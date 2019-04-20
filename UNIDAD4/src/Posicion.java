/**
 * Saca por pantalla la palabra "posicion" y un numero creciente del 1 a 15
* Es un runnable y debe se llamada desde otra clase
 * @author idela
 * @version 1.0
 */




public class Posicion implements Runnable {

	
	private String posicion; 
	
	
	/**
	 * Es un setter para posición .
	 * @param pos como String cocn la posición que le pasamos
	 */
	public Posicion (String pos) {
		
		posicion=pos;
	}

	/**
	 * Es el método run que se ejecutara al llamar a la clase como si fuera un hilo
	 * Hace las veces de un main y cuenta hasta 15
	 */
	
	public void run() {
		for (int i=1;i<=15;i++)
			System.out.println( posicion +" "+ i );
		}

}

