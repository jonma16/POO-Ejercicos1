package Ejercicio1;

import jdk.internal.misc.FileSystemOption;

public class Productos {
	private double precios;
	private String nombre;
	private int cantidad;

 
	public Productos(String nombre, double precio, int cantidad) {
		this.precios=precio;
		this.nombre=nombre;
		this.cantidad=cantidad;
	}
	
	public void escribirproducto() {
		System.out.print(precios );
		System.out.print(nombre );
		System.out.print(cantidad );
	}
	
	private void syso() {
		// TODO Apéndice de método generado automáticamente

	}

}
