package isi.died.parcial01.ejercicio01;

import java.time.LocalDate;

public class GastoAlimento extends Comprobante {

	private String tipo; //almuerzo o cena
	private LocalDate fecha;
	private Double monto;
	
		
	public GastoAlimento(String tipo, LocalDate fecha, Double monto) {
		super(monto);
		this.tipo = tipo;
		this.fecha = fecha;
		this.monto = monto;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	
	@Override
	public double monto() {
		double reconocido=super.monto;
		return reconocido;
	}
	
}
