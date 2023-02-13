package modelo;

import java.awt.EventQueue;

public class PrincipalFrameCopuesto {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParaFrameCompuesto frame = new ParaFrameCompuesto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
