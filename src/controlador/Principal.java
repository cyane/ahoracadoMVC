package controlador;

import java.awt.EventQueue;

import vista.UI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends UI {

	Control control= new Control();
	public Principal() {
		super();
		btnJugarOtraVez.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnJugarOtraVez.setVisible(false);
				txtMensaje.setText("siguiente ronda");
				txtIntroducirPalabra.setText("");
				txtFallosLetras.setText("");
				txtFallosNumero.setText("0");
				control.setFallos(0);
				txtAciertos.setText("");
				control.setLetrasFallidas(new StringBuilder(""));
				btnPlay.setVisible(true);
				txtIntroducirPalabra.setVisible(true);
				lblElJuegoDel.setVisible(false);
				lblPalabraSecreta.setVisible(true);
				btnPlayRandom.setVisible(true);
				txtLetraIntroducida.setVisible(true);
				lblLetra.setVisible(true);
				txtLetraIntroducida.setEditable(false);
			}
		});
		btnPlayRandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtIntroducirPalabra.setText(" ");
				if(botonPlayActionPerformed()){
					control.setPalabreja(control.getPalabras()); 
					control.iniciaAciertos();
				}
			}
		});
		txtLetraIntroducida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtLetraIntroducida.getText().isEmpty()){
				control.anotarAciertos(txtLetraIntroducida.getText().charAt(0));
				txtFallosNumero.setText(String.valueOf(control.getFallos()));
				txtAciertos.setText(control.getAciertos());
				if (control.palabraAcertada()==true) {
					txtMensaje.setText("you win, eres un maquina");
					txtLetraIntroducida.setVisible(false);
					btnJugarOtraVez.setVisible(true);
					txtIntroducirPalabra.setVisible(false);
					lblLetra.setVisible(false);
				}else if(control.getFallos()>6){
					txtMensaje.setText("you lose, noob, era: "+control.getPalabreja());
					txtLetraIntroducida.setVisible(false);
					btnJugarOtraVez.setVisible(true);
					txtIntroducirPalabra.setVisible(false);
					lblLetra.setVisible(false);
					
				}
				txtLetraIntroducida.setText("");
				txtFallosLetras.setText(control.getLetrasFallidas());
				}else {
					txtMensaje.setText("no ha introducido nada");
				}
				
			}
		});
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(botonPlayActionPerformed()){
					control.setPalabreja(txtIntroducirPalabra.getText()); 
					control.iniciaAciertos();
				}
			}
		});
	}

	protected boolean botonPlayActionPerformed() {
		if (!txtIntroducirPalabra.getText().isEmpty()) {
			txtMensaje.setText("");
			btnPlay.setVisible(false);
			txtIntroducirPalabra.setVisible(false);
			lblElJuegoDel.setVisible(true);
			txtLetraIntroducida.setEditable(true);
			lblPalabraSecreta.setVisible(false);
			btnPlayRandom.setVisible(false);
			return true;
		} else {
			txtMensaje.setText("Introduzca una palabra para jugar");
			return false;
		}
	
		
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
