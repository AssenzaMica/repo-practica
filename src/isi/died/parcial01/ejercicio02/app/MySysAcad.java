package isi.died.parcial01.ejercicio02.app;

import isi.died.parcial01.ejercicio02.db.BaseDeDatosExcepcion;
import isi.died.parcial01.ejercicio02.dominio.*;
import isi.died.parcial01.ejercicio02.exc.DocenteNoPerteneceException;



public interface MySysAcad {
	
	public void registrarMateria(Materia d);
	
	
	public void registrarDocente(Docente d) ;
	
	
	public void registrarAlumnos(Alumno d);
	/**
	 * crea una nueva instancia de Inscripcion y 
	 * asigna la inscripcion a la lista de inscripciones del alumno, 
	 * de la materia y del docente
	 * @throws BaseDeDatosExcepcion 
	 */
	public void inscribirAlumnoCursada(Docente d,Alumno a, Materia m,Integer cicloLectivo) throws BaseDeDatosExcepcion;

	/**
	 * crea una nueva instancia de Inscripcion y 
	 * asigna la inscripcion a la lista de inscripciones del alumno, 
	 * de la materia y del docente
	 * @throws DocenteNoPerteneceException 
	 * @throws BaseDeDatosExcepcion 
	 */
	public void inscribirAlumnoExamen(Docente d,Alumno a, Materia m) throws DocenteNoPerteneceException, BaseDeDatosExcepcion;
	

}
