/**
 * Saca 100 n�meros por la salida estandar 
 * @version 1.0
 * @see segundo.java
 * @author Israel de Lamo
 *
 */
public class Primero implements Runnable {
	public void run() {
		for (int i=1;i<100;i++)
			System.out.println( "Primero " + i );
	}
}
