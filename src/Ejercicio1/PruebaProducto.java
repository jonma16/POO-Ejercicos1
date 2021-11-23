package Ejercicio1;

public class PruebaProducto {

	public static void main(String[] args) {
		Productos p1=new Productos("Platano",2.55,100);
		Productos p2=new Productos("Sandia",5.00,6);
		Productos p3=new Productos("Pera",4.30,900);
		Productos p4=new Productos("Manzana",1.30,90);
		p1.escribirproducto();
		p2.escribirproducto();
		p3.escribirproducto();
		p4.escribirproducto();
	}

}
