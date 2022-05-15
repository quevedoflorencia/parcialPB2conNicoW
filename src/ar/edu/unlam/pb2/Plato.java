package ar.edu.unlam.pb2;

import java.util.HashSet;

public class Plato {

	private String nombrePlato;
	private Boolean esCrudo;
	private HashSet <Ingrediente>listaDeIngredientes;

	public Plato(String nombrePlato, Boolean esCrudo) {
		this.nombrePlato=nombrePlato;
		this.esCrudo=esCrudo;
		this.listaDeIngredientes=new HashSet<Ingrediente>();
		
	}

	public Boolean getEsCrudo() {
		return esCrudo;
	}

	public void setEsCrudo(Boolean esCrudo) {
		this.esCrudo = esCrudo;
	}

	public Boolean agregarIngrediente(Ingrediente queso) {
		return this.listaDeIngredientes.add(queso);
		
	}
	public Boolean tieneTacc() {
		Boolean tieneTacc=false;
		 for (Ingrediente ingrediente : listaDeIngredientes) {
			if (ingrediente.getTieneTacc()==true) {
				tieneTacc=true;
			}
		}
		return tieneTacc;
	}
	
	public Boolean tieneSal() {
		Boolean tieneSal=false;
		 for (Ingrediente ingrediente : listaDeIngredientes) {
			if (ingrediente.getTieneSal()==true) {
				tieneSal=true;
			}
		}
		return tieneSal;
	}

	public Boolean tieneAzucal() {
		Boolean tieneAzucar=false;
		 for (Ingrediente ingrediente : listaDeIngredientes) {
			if (ingrediente.getTieneAzucar()==true) {
				tieneAzucar=true;
			}
		}
		return tieneAzucar;
	}
}
