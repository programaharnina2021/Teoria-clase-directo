package vista;

import javax.swing.JButton;

public class MyJButton extends JButton {

	private final int value;

	public MyJButton(String text,int value) {
		super(text);
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	
	
}
