package modelo;

public class GestionDatos {
	private Palabra secreta;
	private Palabra parcial;
	private int numeroFallos = 0;

	public void crearSecreta(String cadena) {
		secreta = new Palabra(cadena);
		parcial = new Palabra(secreta.longitud());
	}

	public boolean comprobarLetraEnPalabra(char letra) {
		int posicion = 0;
		boolean respuesta = false;
		do {
			posicion = secreta.buscaLetra(posicion, letra);
			if (posicion != -1) {
				respuesta = true;
				parcial.setLetraEnPosicion(posicion, letra);
				posicion++;
			}
		} while (posicion != -1);
		if (!respuesta) {
			this.numeroFallos++;
		}
		return respuesta;
	}

	public String getParcial() {
		return parcial.getPalabra();
	}

	public String getFallos() {
		return String.valueOf(this.numeroFallos);
	}
}
