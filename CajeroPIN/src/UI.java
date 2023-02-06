import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI extends JFrame {

	private JPanel contentPane;
	private String secretPin = "1234";
	private StringBuilder userPin = new StringBuilder();
	private StringBuilder pinMessage=new StringBuilder();
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
		setBounds(100, 100, 452, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PIN");
		lblNewLabel.setBounds(166, 21, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblMensaje = new JLabel(" ");
		lblMensaje.setBounds(38, 390, 61, 16);
		contentPane.add(lblMensaje);
		
		JLabel lblPin = new JLabel(" ");
		lblPin.setBounds(143, 49, 84, 16);
		contentPane.add(lblPin);
		ActionListener botonActionListener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JButton boton=(JButton) e.getSource();
				userPin.append(boton.getText());
				pinMessage.append("*");
				lblPin.setText(pinMessage.toString());
				if(userPin.length()==secretPin.length()) {
					if(userPin.toString().equals(secretPin)) {
						lblMensaje.setText("Enhorabuena");
					}else{
						lblMensaje.setText("Error");
					}
					userPin=new StringBuilder();
					pinMessage=new StringBuilder();
				}
				
			}
		};
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(botonActionListener);
		btnNewButton.setBounds(82, 144, 61, 45);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(botonActionListener);
		btnNewButton_1.setBounds(143, 144, 61, 45);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(botonActionListener);
		btnNewButton_2.setBounds(201, 144, 61, 45);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(botonActionListener);
		btnNewButton_3.setBounds(82, 201, 61, 45);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("5");
		btnNewButton_1_1.addActionListener(botonActionListener);
		btnNewButton_1_1.setBounds(143, 201, 61, 45);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("6");
		btnNewButton_2_1.addActionListener(botonActionListener);
		btnNewButton_2_1.setBounds(201, 201, 61, 45);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_4 = new JButton("7");
		btnNewButton_4.addActionListener(botonActionListener);
		btnNewButton_4.setBounds(82, 258, 61, 45);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_1_2 = new JButton("8");
		btnNewButton_1_2.addActionListener(botonActionListener);
		btnNewButton_1_2.setBounds(143, 258, 61, 45);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("9");
		btnNewButton_2_2.addActionListener(botonActionListener);
		btnNewButton_2_2.setBounds(201, 258, 61, 45);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_2_1 = new JButton("0");
		btnNewButton_2_2_1.addActionListener(botonActionListener);
		btnNewButton_2_2_1.setBounds(143, 315, 61, 45);
		contentPane.add(btnNewButton_2_2_1);
		
	
	}
}
