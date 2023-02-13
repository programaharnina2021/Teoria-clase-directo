package control;

import java.util.Random;

public class PalabraObjectMother {

	String palabras[] = { "hola", "casa", "coche", "procesador", "rodillo" };

	public String getRandomPalabra() {
		return palabras[new Random().nextInt(palabras.length)];
	}

}
