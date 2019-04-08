public class Actividad4 {
	
	/**
	 * Clase Activdad 4 sirve como lanzadora de los diferentes hilos
	 * 
	 * Interiormente llama dos veces al mismo hilo, "Posicion.java"
	 * y cuando termina muestra el mensaje por pantalla
	 * 
	 * En este ejercicio se puede ver como JavaDoc ayuda a la creacción de una
	 * documentación ordenada que debe aparecer en todo buen programa
	 * 
	 * @author Israel de Lamo
	 * @version 1.0
	 * @see posicion.java
	 * @see https://docs.oracle.com/javase/7/docs/api/java/lang/Runnable.html
	 * @param arg
	 */
	
	public static void main(String arg[]) {
		
		Thread p = new Thread(new Posicion("Primero"));
		Thread s = new Thread(new Posicion("Segundo"));
		p.start();
		s.start(); //nada mÃ¡s
		System.out.println( "Fin programa ");
	}
}
