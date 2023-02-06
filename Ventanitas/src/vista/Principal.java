package vista;

public class Principal {

	public static void main(String[] args) {
		Ser ser=new Ser();
		ser.hacerAlgo();
		new Ser().hacerAlgo();
		new Comportamiento() {
			@Override
			public void hacerAlgo() {
					System.out.println("pues yo lo hago de otra forma");
			}
		}.hacerAlgo();
	}

}
