package isi.died.parcial01.ejercicio02.app;

import java.util.ArrayList;
import java.util.List;

import isi.died.parcial01.ejercicio02.db.BaseDeDatos;
import isi.died.parcial01.ejercicio02.db.BaseDeDatosExcepcion;
import isi.died.parcial01.ejercicio02.dominio.*;
import isi.died.parcial01.ejercicio02.dominio.Inscripcion.Estado;
import isi.died.parcial01.ejercicio02.exc.DocenteNoPerteneceException;


public class MySysAcadImpl implements MySysAcad {
	private static final BaseDeDatos DB = new BaseDeDatos();


	private List<Materia> materia = new ArrayList<Materia>();
	
	@Override
	public void registrarMateria(Materia d) {
		this.materia.add(d);
	}
	
	private List<Docente> docentes = new ArrayList<Docente>();
	
	@Override
	public void registrarDocente(Docente d) {
		this.docentes.add(d);
	}
	
	private List<Alumno> alumnos = new ArrayList<Alumno>();
	
	@Override
	public void registrarAlumnos(Alumno d) {
		this.alumnos.add(d);
	}
	

	@Override
	public void inscribirAlumnoCursada(Docente d, Alumno a, Materia m, Integer cicloLectivo) throws BaseDeDatosExcepcion{
		Inscripcion insc = new Inscripcion(cicloLectivo,Inscripcion.Estado.CURSANDO);
		d.agregarInscripcion(insc);
		a.addCursada(insc);
		m.addInscripcion(insc);
		DB.guardar(insc); throw new BaseDeDatosExcepcion();
		
	}

	@Override
	public void inscribirAlumnoExamen(Docente d, Alumno a, Materia m) throws BaseDeDatosExcepcion, DocenteNoPerteneceException{
		Examen e = new Examen();
		List<Docente> docentes = m.getDocentes();
		if(docentes.contains(d)) {
		a.addExamen(e);
		d.agregarExamen(e);
		m.addExamen(e);
		DB.guardar(e); throw new BaseDeDatosExcepcion();
		}
		else {
			throw new DocenteNoPerteneceException();
		}
	}

	
	
	public void registrarNota(Examen e, Integer n, Inscripcion i) {
		e.setNota(n);
		if(n>=6) {
			i.setEstado(Estado.PROMOCIONADO);
		}
	}
	

	
}
