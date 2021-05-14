package isi.died.parcial01.ejercicio02.exc;

public class DocenteNoPerteneceException extends Exception {
	
	public DocenteNoPerteneceException() {
		super("El docente no pertenece a la materia seleccionada");
	}
	
}
