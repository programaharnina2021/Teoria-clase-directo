package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class UI extends JFrame {
	//UI va a ser la clase que aloja los componentes pero no tiene NADA de logica del programa

	private JPanel contentPane;
	private JTextField txtLetra;
	private JButton btnJugar;
	private JLabel lblPalabra;
	private JLabel lblFallos;
	private JLabel lblMensaje;

	

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
		
		JLabel lblNewLabel = new JLabel("ahorcado");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(162, 20, 120, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Palabra");
		lblNewLabel_1.setBounds(33, 77, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		lblPalabra = new JLabel(" ");
		lblPalabra.setBounds(116, 77, 205, 16);
		contentPane.add(lblPalabra);
		
		JLabel lblNewLabel_2 = new JLabel("fallos");
		lblNewLabel_2.setBounds(33, 126, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		lblFallos = new JLabel(" ");
		lblFallos.setBounds(106, 126, 61, 16);
		contentPane.add(lblFallos);
		
		JLabel lblNewLabel_3 = new JLabel("letra");
		lblNewLabel_3.setBounds(33, 190, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		txtLetra = new JTextField();
		txtLetra.setBounds(112, 185, 79, 26);
		contentPane.add(txtLetra);
		txtLetra.setColumns(10);
		
		btnJugar = new JButton("jugar");
	
		btnJugar.setBounds(222, 185, 117, 29);
		contentPane.add(btnJugar);
		
		lblMensaje = new JLabel(" ");
		lblMensaje.setBounds(33, 237, 392, 16);
		contentPane.add(lblMensaje);
	}



	protected JButton getBtnJugar() {
		return btnJugar;
	}



	protected JLabel getLblPalabra() {
		return lblPalabra;
	}



	protected JLabel getLblFallos() {
		return lblFallos;
	}



	protected JTextField getTxtLetra() {
		return txtLetra;
	}



	protected JLabel getLblMensaje() {
		return lblMensaje;
	}
}
