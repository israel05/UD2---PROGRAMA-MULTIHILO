public class Posicion implements Runnable {

	/**
	 * Clase Posicion
	 * 
	 * Saca por pantalla la palabra "posicion" y un numero creciente del 1 a 15
	 * Es un runnable y debe se llamada desde otra clase
	 * 
	 * 
	 */
	
	/**
	 * 
	 */
	private String posicion; 
	
	
	/**
	 * Es un setter para posici�n.
	 * @param pos como String cocn la posici�n que le pasamos
	 */
	public Posicion (String pos) {
		
		posicion=pos;
	}

	/**
	 * Es el m�todo run que se ejecutara al llamar a la clase como si fuera un hilo
	 */
	
	public void run() {
		for (int i=1;i<=15;i++)
			System.out.println( posicion +" "+ i );
		}

}

