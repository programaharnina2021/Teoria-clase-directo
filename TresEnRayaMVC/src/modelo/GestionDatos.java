package modelo;

public class GestionDatos {
	private Tablero tablero=new Tablero();
	public int numerojugada = 2;
	/**
	 * Informa de quien es el turno actual
	 * 
	 * @return 1 o 0 dependiendo de quien sea el propietario del turno
	 */
	public int verTurno() {
		if (numerojugada % 2 == 0)
			return 2;
		return 1;

	}
}
