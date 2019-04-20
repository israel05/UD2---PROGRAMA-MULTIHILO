
/**
 * Mediante programación con hilos lanzamos los hilos y mostramos su salida
 * Debido a como funcionan los hilos y su alternancia en el uso de CPU no tiene porque salir dos veces 
 * el mismo resultado
 * 
 * @author Israel de Lamo
 * @version 1.0
 * @see segundo.java
 * @see primero.java
 * @see https://docs.oracle.com/javase/7/docs/api/java/lang/Runnable.html
 * @param arg
 *
 */

public class Hilos2 {
	public static void main(String arg[]) {
		Thread p = new Thread(new Primero());
		Thread s = new Thread(new Segundo());
		p.start();
		s.start();
		System.out.println( "Fin programa ");
	}
}
