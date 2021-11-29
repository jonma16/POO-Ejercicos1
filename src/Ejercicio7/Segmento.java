package Ejercicio7;

public class Segmento {
	Punto p1;
	Punto p2;
	
	//Constructor
	public Segmento(Punto punto1,Punto punto2) {
		this.p1=punto1;
		this.p2=punto2;
	}
	
	public Segmento(double x1,double x2, double y1,double y2) {
		this.p1=new Punto(x1,y1);
		this.p2=new Punto(x2,y2);
	}

	
	
	public boolean esHorizontal() {
		if(this.p1.getY()==this.p2.getY()) {
			//System.out.println("Es horizontal");
			return true;
		}
		else {
			return false;
			//System.out.println("No es horizontal");
		}
	}
	
	public boolean esVertical() {
		if(this.p1.getX()==this.p2.getX()) {
			return true;
			//System.out.println("Es vertical");
		}
		else {
			return false;
			//System.out.println("No es vertical");
		}
	}
	
	public Punto puntoAlto() {
		if(this.p1.getY()>this.p2.getY()) {
			return this.p1;
		}
		else if(this.p2.getY()>this.p1.getY()) {
			return p2;
		}
		else {
			return null;
		}
	}
	
	public double longitud() {
		return Math.sqrt(this.p1.getX()-this.p2.getX())*
		(this.p1.getX()-this.p2.getX())+(this.p1.getY()-this.p2.getY())*
		(this.p1.getY()-this.p2.getY());
	}
	
	public Segmento masLargo(Segmento s2) {
		if (this.longitud()>s2.longitud()) {
			return this;
		}
		else if(this.longitud()<s2.longitud()) {
			return s2;
		}
		else {
			return null;
		}
		
	}
	
	
}
