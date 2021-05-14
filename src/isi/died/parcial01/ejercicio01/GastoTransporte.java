package isi.died.parcial01.ejercicio01;

import java.time.LocalDate;
import java.time.Duration;

public class GastoTransporte extends Comprobante {

	private Integer kmInicio;
	private Integer kmFin;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	
		
	public GastoTransporte(double monto, Integer kmInicio, Integer kmFin, LocalDate fechaInicio, LocalDate fechaFin) {
		super(monto);
		this.kmInicio = kmInicio;
		this.kmFin = kmFin;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	
	public Integer getKmInicio() {
		return kmInicio;
	}
	public void setKmInicio(Integer kmInicio) {
		this.kmInicio = kmInicio;
	}
	public Integer getKmFin() {
		return kmFin;
	}
	public void setKmFin(Integer kmFin) {
		this.kmFin = kmFin;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	
	@Override
	public double monto() {
		double reconocido=0.0;
		reconocido=50*(this.kmFin-this.kmInicio)+5000*((Duration.between(fechaInicio, fechaFin)).toDays());
		return reconocido;
	}
	
	
}
