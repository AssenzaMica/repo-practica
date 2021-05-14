package isi.died.parcial01.ejercicio01;

public class GastoHospedaje extends Comprobante {

	private String nombreHotel;
	private Integer cantEstrellas;
	private Boolean habilitado;
	
		
	public GastoHospedaje(double monto, String nombreHotel, Integer cantEstrellas, Boolean habilitado) {
		super(monto);
		this.nombreHotel = nombreHotel;
		this.cantEstrellas = cantEstrellas;
		this.habilitado = habilitado;
	}
	public String getNombreHotel() {
		return nombreHotel;
	}
	public void setNombreHotel(String nombreHotel) {
		this.nombreHotel = nombreHotel;
	}
	public Integer getCantEstrellas() {
		return cantEstrellas;
	}
	public void setCantEstrellas(Integer cantEstrellas) {
		this.cantEstrellas = cantEstrellas;
	}
	public Boolean getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(Boolean habilitado) {
		this.habilitado = habilitado;
	}
	
	@Override
	public double monto() {
		double reconocido=0.0;
		if(habilitado) {
			reconocido=super.monto;
		} 
		else{
			if(this.cantEstrellas<=3) {
				reconocido=super.monto*0.75;
			}
			else {
				reconocido=super.monto*0.50;
			}
			
		}
		return reconocido;
	}
	
	
	
}
