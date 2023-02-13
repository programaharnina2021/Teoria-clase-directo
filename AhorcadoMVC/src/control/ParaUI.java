package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.GestionDatos;
import vista.UI;

public class ParaUI extends UI {
	private GestionDatos gestionDatos;

	public ParaUI() {
		super();
		int maxFallos = 5;
		gestionDatos = new GestionDatos();
		gestionDatos.crearSecreta(new PalabraObjectMother().getRandomPalabra());
		actualizaEstado();
		getBtnJugar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Integer.parseInt(gestionDatos.getFallos()) < maxFallos) {
					// necesito recoger la letra del usuario
					char charAt = getTxtLetra().getText().charAt(0);
					getTxtLetra().setText("");
					// comprobar si la letra esta
					gestionDatos.comprobarLetraEnPalabra(charAt);
					actualizaEstado();
				} else {
					getLblMensaje().setText("has alcanzado el maximo de fallos");
				}

			}
		});
	}

	private void actualizaEstado() {
		getLblFallos().setText(gestionDatos.getFallos());
		getLblPalabra().setText(gestionDatos.getParcial());
	}

}
