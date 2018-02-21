package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI extends JFrame {

	protected JPanel contentPane;
	protected JTextField txtAciertos;
	protected JTextField txtFallosNumero;
	protected JTextField txtFallosLetras;
	protected JTextField txtMensaje;
	protected JTextField txtIntroducirPalabra;
	protected JLabel lblPalabraSecreta;
	protected JButton btnPlay;
	protected JLabel lblElJuegoDel;
	protected JTextField txtLetraIntroducida;
	protected JButton btnPlayRandom;
	protected JButton btnJugarOtraVez;
	protected JLabel lblLetra;



	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblElJuegoDel = new JLabel("El juego del Ahorcado");
		lblElJuegoDel.setVisible(false);
		lblElJuegoDel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblElJuegoDel.setBounds(41, 22, 356, 44);
		contentPane.add(lblElJuegoDel);
		
		lblLetra = new JLabel("Letra");
		lblLetra.setBounds(147, 107, 46, 14);
		contentPane.add(lblLetra);
		
		txtLetraIntroducida = new JTextField();
		txtLetraIntroducida.setEditable(false);
		txtLetraIntroducida.setBounds(244, 104, 31, 20);
		contentPane.add(txtLetraIntroducida);
		txtLetraIntroducida.setColumns(10);
		
		JLabel lblAciertos = new JLabel("Aciertos");
		lblAciertos.setBounds(21, 155, 130, 14);
		contentPane.add(lblAciertos);
		
		txtAciertos = new JTextField();
		txtAciertos.setEditable(false);
		txtAciertos.setBounds(81, 152, 316, 20);
		contentPane.add(txtAciertos);
		txtAciertos.setColumns(10);
		
		JLabel lblFallos = new JLabel("Fallos");
		lblFallos.setBounds(81, 185, 46, 17);
		contentPane.add(lblFallos);
		
		txtFallosNumero = new JTextField();
		txtFallosNumero.setEditable(false);
		txtFallosNumero.setBounds(130, 183, 38, 20);
		contentPane.add(txtFallosNumero);
		txtFallosNumero.setColumns(10);
		
		txtFallosLetras = new JTextField();
		txtFallosLetras.setEditable(false);
		txtFallosLetras.setBounds(192, 183, 179, 20);
		contentPane.add(txtFallosLetras);
		txtFallosLetras.setColumns(10);
		
		JLabel lblMensaje = new JLabel("Mensaje");
		lblMensaje.setBounds(21, 223, 118, 14);
		contentPane.add(lblMensaje);
		
		txtMensaje = new JTextField();
		txtMensaje.setEditable(false);
		txtMensaje.setBounds(81, 220, 316, 20);
		contentPane.add(txtMensaje);
		txtMensaje.setColumns(10);
		
		txtIntroducirPalabra = new JTextField();
		txtIntroducirPalabra.setBounds(115, 25, 220, 23);
		contentPane.add(txtIntroducirPalabra);
		txtIntroducirPalabra.setColumns(10);
		
		btnPlay = new JButton("play");
		btnPlay.setBounds(335, 24, 89, 23);
		contentPane.add(btnPlay);
		
		lblPalabraSecreta = new JLabel("Palabra Secreta");
		lblPalabraSecreta.setBounds(21, 29, 105, 14);
		contentPane.add(lblPalabraSecreta);
		
		btnPlayRandom = new JButton("play random");
		btnPlayRandom.setBounds(115, 54, 220, 23);
		contentPane.add(btnPlayRandom);
		
		btnJugarOtraVez = new JButton("jugar otra vez");
		btnJugarOtraVez.setVisible(false);
		btnJugarOtraVez.setBounds(130, 103, 166, 23);
		contentPane.add(btnJugarOtraVez);
	}
}
