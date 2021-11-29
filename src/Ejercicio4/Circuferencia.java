package Ejercicio4;

public class Circuferencia {
	double radio;
	String color;
	
	//Constructor
	public Circuferencia(double r,String c) {
		this.radio=r;
		this.color=c;
	}
	
	//Metodo para obtener el area
	public double area() {
		return 3.1416*this.radio*this.radio;
	}
	
	public void printPerimeter() {
		System.out.println("El perimetro de la circuferencia es "+2*3.1416*this.radio);
	}
	
	public boolean isBig() {
		if (this.area()<20) {
			return true;
			
		}
		else {
			return false;
		}
	}
	
	public boolean isEqualTo(Circuferencia c2) {
		if (this.color==c2.color && this.radio==c2.radio) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public void show() {
		System.out.println("El radio de la circufencia es "+ this.radio);
		System.out.println("El color de la circufencia es "+ this.color);
	}

}
