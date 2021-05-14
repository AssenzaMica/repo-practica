package isi.died.parcial01.ejercicio01;

public abstract class Comprobante {
	
	protected double monto;
	
		
	public Comprobante(double monto) {
		this.monto = monto;
	}



	public abstract double monto();
	
}
