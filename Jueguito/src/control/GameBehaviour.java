package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JLabel;

import vista.MyJButton;

public class GameBehaviour implements ActionListener {

	private int acumulator = 0;
	private int currentMovements = 0;
	private int min = 10, max = 50;
	private int targetNumber ;
	private JLabel lblCurrentMovements;
	private JLabel lblMessage;


	public GameBehaviour(JLabel lblCurrentMovements, JLabel lblMessage) {
		super();
		targetNumber = getRandomNumber(min, max);
		this.lblCurrentMovements=lblCurrentMovements;
		this.lblMessage=lblMessage;
	}

	public int getRandomNumber(int min, int max) {
		return new Random().nextInt(max - min) + min;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (!hasReachedTargetNumber()) {
			MyJButton boton = (MyJButton) e.getSource();
			int value = boton.getValue();
			acumulator += value;
			currentMovements++;
			lblCurrentMovements.setText(String.valueOf(currentMovements));
		} else {
			lblMessage.setText("Esto se ha terminado");
		}
	}

	private boolean hasReachedTargetNumber() {
		return acumulator >= targetNumber;
	}

	public int getTargetNumber() {
		return targetNumber;
	}

}
