package modelo;


public class Coordenada {
	private int x,y;
	
	public Coordenada(int x, int y) {
		super();		
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void asignarCoordenada(Coordenada destino) {
		this.setX(destino.getX());
		this.setY(destino.getY());
	}
	/**
	 * Comprueba si la casilla destino es contigua a la casilla origen
	 * 
	 * @return True si es contigua false en caso contrario
	 */
	public boolean casillaContigua(Coordenada destino) {
		int x = destino.getX() - this.getX(), y = destino.getY() - this.getY();
		if (x > -2 && x < 2 && y > -2 && y < 2)
			return true;
		return false;

	}
	
	@Override
	public String toString() {
		return ""+x+":"+y;
	}
}
