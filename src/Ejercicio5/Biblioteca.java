package Ejercicio5;

public class Biblioteca {
	public static boolean espar(int n) {	
		if(n%2==0) {
			System.out.println("Es par");
			return true;
		}
		else {
			System.out.println("Es impar");
			return false;
		}
	}
	
	public static int cantidadDigitos(int n) {
		int contador=0;
		while (n!=0){
			n=n/10;
			contador++;
		}
		return contador;
	}
	
	public static boolean tiene5(int n) {
		return (cantidadDigitos(n)>=5);
	}
	
	public static boolean multiplode10() {
		System.out.println("Dame un numero:");
		int n= Console.readInt();
		if(n%10==0) {
			System.out.println("Es multiplo de 10");
			return true;
		}
		else {
			System.out.println("No es multiplo de 10");
			return false;
		}
	}

}
