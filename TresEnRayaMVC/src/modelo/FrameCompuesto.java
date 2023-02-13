package modelo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import boceto.MyButton;

import javax.swing.JLabel;
import java.awt.FlowLayout;

public class FrameCompuesto extends JFrame {

	private JPanel contentPane;
	private PanelBotonera panel;

	

	/**
	 * Create the frame.
	 */
	public FrameCompuesto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(194, 10, 61, 16);
		contentPane.add(lblNewLabel);
		
		panel = new PanelBotonera();
		FlowLayout fl_panel = (FlowLayout) panel.getLayout();
		fl_panel.setVgap(1);
		fl_panel.setHgap(1);
		panel.setBounds(106, 120, 248, 132);
		contentPane.add(panel);
		panel.getBoton(1,1).setText("X");
	}

	protected PanelBotonera getPanel() {
		return panel;
	}

	public MyButton getBoton(int i, int j) {
		return panel.getBoton(i, j);
	}
}
