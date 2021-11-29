package Ejercicio6;

public class Punto {
	double x;
	double y;
	
	//Constructor
	public Punto(double x,double y) {
		this.x=x;
		this.y=y;
	}
	
	public int cuadrante() {
		if(this.x>0 && this.y>0) {
			System.out.println("Primer cuadrante");
			return 1;
		}
		else if(this.x<0 && this.y>0) {
			System.out.println("Segundo cuadrante");
			return 2;
		}
		else if (this.x<0 && this.y<0) {
			System.out.println("Tercer cuadrante");
			return 3;
		}
		else if (this.x>0 && this.y<0) {
			System.out.println("Caurto cuadrante");
			return 4;
		}
		return 0;
		
	}
	
	public void Muestra() {
		System.out.println("La cordenada de X es:"+this.x);
		System.out.println("La cordenada de Y es:"+this.y);
	}
}
