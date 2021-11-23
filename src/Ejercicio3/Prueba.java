package Ejercicio3;

public class Prueba {

	public static void main(String[] args) {
		NumberStatistics ns= new NumberStatistics(1);
		System.out.println(ns.addNumber(5));
		//Este ultimo no añadira y no sdara false
		System.out.println(ns.addNumber(8.2));
		
		ns.showStatistics();
		
	}

}
