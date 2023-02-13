package modelo;

public class Tablero {
	public int tablero[][] = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };

	public int getValorPosicion(Coordenada coordenada) {
		return tablero[coordenada.getX()][coordenada.getY()];
	}

	public void setValorPosicion(Coordenada coordenada, int i) {
		tablero[coordenada.getX()][coordenada.getY()]=i;
		
	}
	/**
	 * Mirar las filas del tablero
	 * 
	 * @return true si hay tres fichas de la misma clase en una fila
	 */
	private boolean compruebaFila() {
		for (int x = 0; x < 3; x++)
			if (tablero[x][0] == tablero[x][1] && tablero[x][1] == tablero[x][2] && tablero[x][1] != 0)
				return true;
		return false;
	}
	
	/**
	 * Mira las columnas del tablero
	 * 
	 * @return true si tres fichas de la misma clase en una columna
	 */
	private boolean compruebaColumna() {
		for (int y = 0; y < 3; y++)
			if (tablero[0][y] == tablero[1][y] && tablero[1][y] == tablero[2][y] && tablero[1][y] != 0)
				return true;
		return false;
	}

	/**
	 * Comprueba si alguna diagonal tiene tres en raya No hace falta comparar si
	 * est�n vacias, no puede ocurrir
	 * 
	 * @return true si se da la circunstancia
	 */
	private boolean compruebaDiagonal() {
		if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2])
			return true;
		if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0])
			return true;
		return false;
	}

	/**
	 * Se encarga de llamar a los metodos que comprueban las tres en raya
	 * 
	 * @return true si se han conseguida tres en raya
	 */
	public boolean comprobarTresEnRaya() {
		if (compruebaFila() || compruebaColumna() || compruebaDiagonal())
			return true;
		return false;
	}
	
	/**
	 * Si en la casilla determinada por las coordenadas x e y se encuentra con un
	 * cero seignifica que la casilla est� libre
	 * 
	 * @param coordenada de fila
	 * @param coordenada de columna
	 * @return verdadero si la casilla esta libre y falso en caso contrario
	 */
	public boolean mirarCasillaLibre(Coordenada coordenada) {
		return getValorPosicion(coordenada)  == 0;
	}
	/**
	 * Comprueba si la casilla origen esta ocupada por una ficha de la propiedad del
	 * turno actual
	 * 
	 * @return true si casilla pertenece al turno actual o false en caso contrario
	 */
	public boolean comprobarPropiedad(Coordenada coordenada, int turno) {
		return getValorPosicion(coordenada) ==turno;
	}
	

	/**
	 * casilla libre adyacente libre
	 * 
	 * @return true si encuentra al menos una casilla libre contigua false si la
	 *         pieza est� bloqueada
	 */
	public boolean comprobarBloqueada(Coordenada coordenada) {
		for (int x = coordenada.getX() - 1; x <= coordenada.getX() + 1; x++)
			for (int y = coordenada.getY() - 1; y <= coordenada.getY() + 1; y++)
				if (x > -1 && x < 3 && y > -1 && y < 3)
					if (getValorPosicion(new Coordenada(x, y))  == 0)
						return true;
		return false;
	}
}
