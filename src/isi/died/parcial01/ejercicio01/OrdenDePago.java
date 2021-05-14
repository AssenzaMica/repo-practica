package isi.died.parcial01.ejercicio01;

public class OrdenDePago {
	
	private Integer numero;
	private String mes;
	private Double total;
	
	
	public OrdenDePago(Integer numero, String mes, Double total) {
		this.numero = numero;
		this.mes = mes;
		this.total = total;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	
	

}
