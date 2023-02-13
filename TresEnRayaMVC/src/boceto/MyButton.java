package boceto;

import javax.swing.JButton;

import modelo.Coordenada;

public class MyButton extends JButton {
	private Coordenada coordenada;

	public MyButton(Coordenada coordenada) {
		super("");
		this.coordenada = coordenada;
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}
	
	
}
