package boceto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Coordenada;

import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MuchosBotones extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MuchosBotones frame = new MuchosBotones();
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
	public MuchosBotones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		for (int i = 0; i < 3; i++) {
			for (int j= 0; j < 3; j++) {
			MyButton myButton = new MyButton(new Coordenada(i, j));
			myButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
				System.out.println("hola soy "+((MyButton)e.getSource()).getCoordenada().toString());
					
				}
			});
			contentPane.add(myButton);
			}
		}

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 3, 0, 0));
	}

}
