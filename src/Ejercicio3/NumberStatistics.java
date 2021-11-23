package Ejercicio3;

public class NumberStatistics {
	private int amontonarNumero;
	private double [] numeros;
	
	//Constructor
	public NumberStatistics(int tama�o) {
		this.numeros=new double[tama�o];
		this.amontonarNumero=0;
	}
	
	//Devuelve true si puede a�adir el numero; false en caso contrario
	public boolean addNumber(double n) {
		if(this.amontonarNumero<numeros.length) {
			this.numeros[this.amontonarNumero]=n;
			this.amontonarNumero ++;
			return true;
		}
		else {
			return false;
		}
	}
	
	//Calcula la media y muestra. No la devuelve
	public void showStatistics() {
		double suma=0;
		for (int i=0;i<this.amontonarNumero;i++) {
			suma= suma+numeros[i];
		}
		System.out.println("La media es: "+(suma/this.amontonarNumero));
	}
}
