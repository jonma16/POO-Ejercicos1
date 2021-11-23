package Ejercicio4;

public class Circuferencia {
	double radio;
	String color;
	
	public Circuferencia(double r,String c) {
		this.radio=r;
		this.color=c;
	}
	
	public double area() {
		return 3.1416*this.radio*this.radio;
	}
	
	public void printPerimeter() {
		System.out.println("El perimetro de la circuferencia es "+2*3.1416*this.radio);
	}
	
	public boolean isBig() {
		if (radio<20) {
			return true;
			
		}
		else {
			return false;
		}
	}
	
	public boolean isEqualTo(this.CircuferenciaC2) {
		this.color=c2.color;
		this.radio=c2.radio;
	}

}
