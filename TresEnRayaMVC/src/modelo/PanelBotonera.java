package modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import boceto.MyButton;

public class PanelBotonera extends JPanel {

	private MyButton botonera[][]=new MyButton[3][3];
	
	public PanelBotonera() {
		crearBotones();
	
	}

	private void crearBotones() {
		for (int i = 0; i < 3; i++) {
			for (int j= 0; j < 3; j++) {
				botonera[i][j] = new MyButton(new Coordenada(i, j));
				botonera[i][j] .addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				System.out.println("hola soy "+((MyButton)e.getSource()).getCoordenada().toString());
				}
			});
			this.add(botonera[i][j] );
			}
		}
		
	}

	public MyButton getBoton(int i, int j) {
		return botonera[i][j];
	}

	
}
