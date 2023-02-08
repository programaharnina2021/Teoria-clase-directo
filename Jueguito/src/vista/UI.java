package vista;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.GameBehaviour;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class UI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Jueguito");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Fax", Font.PLAIN, 20));
		lblNewLabel.setBounds(146, 17, 174, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("valor");
		lblNewLabel_1.setBounds(24, 198, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblValue = new JLabel(" ");
		lblValue.setBounds(106, 198, 125, 16);
		contentPane.add(lblValue);
		
		JLabel lblNewLabel_2 = new JLabel("minimos");
		lblNewLabel_2.setBounds(24, 226, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblMinMovements = new JLabel(" ");
		lblMinMovements.setBounds(106, 226, 61, 16);
		contentPane.add(lblMinMovements);
		
		JLabel lblNewLabel_3 = new JLabel("movimientos");
		lblNewLabel_3.setBounds(24, 254, 90, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblCurrentMovements = new JLabel(" ");
		lblCurrentMovements.setBounds(142, 254, 61, 16);
		contentPane.add(lblCurrentMovements);
		
		JLabel lblMessage = new JLabel(" ");
		lblMessage.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		lblMessage.setBounds(88, 360, 319, 39);
		contentPane.add(lblMessage);
		
		JPanel botonera = new JPanel();
		botonera.setBounds(24, 69, 413, 85);
		contentPane.add(botonera);
		botonera.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		int size=5;
		String letters[]= {"A","E","I","O","U"};
		GameBehaviour gameBehaviour=new GameBehaviour(lblCurrentMovements,lblMessage);
		int targetNumber = gameBehaviour.getTargetNumber();
		String messageTargetNumber=String.valueOf(targetNumber);
		lblValue.setText(messageTargetNumber);
		for (int i = 0; i < size; i++) {
			MyJButton button=new MyJButton(letters[i],5);
			button.addActionListener(gameBehaviour);
			botonera.add(button);
		}
	}
}
