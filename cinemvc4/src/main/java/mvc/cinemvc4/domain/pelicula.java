package mvc.cinemvc4.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class pelicula {

	private String nombre;
	
	private String director;
	
	private String fecha;
	
	private int id;
	
	public pelicula(String nombre, String director, String fecha, int id) {
		super();
		this.nombre = nombre;
		this.director = director;
		this.fecha = fecha;
		this.id = id;
	}

	public pelicula(String nombre, String director, int id) {
		super();
		this.nombre = nombre;
		this.director = director;
		this.id = id;
	}

	public pelicula(String nombre, String director) {
		super();
		this.nombre = nombre;
		this.director = director;
	}

	public pelicula(String director) {
		super();
		this.director = director;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
