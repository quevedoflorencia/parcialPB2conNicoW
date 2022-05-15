package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Paciente {

	private String nombre;
	private Integer dni;
	private ArrayList<Plato>listaDePlatos;

	public Paciente(String nombre, Integer dni) {
		this.nombre=nombre;
		this.dni=dni;
		this.listaDePlatos=new ArrayList<Plato>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Boolean darIngesta(Plato pizza) {
		return this.listaDePlatos.add(pizza);
		
	}

}
