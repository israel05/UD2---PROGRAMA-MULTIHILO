/***
 *Es una clase igual a la de primero.java, saca por la salida estandar 100 veces la palabra "Segundo" seguidas de un número" 
 * 
 * 
 * @see Primero.java
 * @author Israel de Lamo
 *
 */



public class Segundo implements Runnable {
	public void run() {
		for (int i=1;i<100;i++)
		System.out.println( "Segundo " + i );
		}
		}
