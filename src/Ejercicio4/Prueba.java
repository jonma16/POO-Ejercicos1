package Ejercicio4;

public class Prueba {

	public static void main(String[] args) {
		Circuferencia c= new Circuferencia(28.45, "Azul");
		Circuferencia c1= new Circuferencia(3.45, "Rojo");
		Circuferencia c2= new Circuferencia(28.45, "Azul");
		
		c.show();
		c.printPerimeter();
		c1.show();
		c1.printPerimeter();
		c2.show();
		c2.printPerimeter();
		
		//Comparamos uno con otro
		System.out.println(c.isEqualTo(c2));
		System.out.println(c.isEqualTo(c1));

	}

}
