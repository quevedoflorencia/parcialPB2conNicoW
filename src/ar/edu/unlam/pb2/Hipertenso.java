package ar.edu.unlam.pb2;

public class Hipertenso extends Paciente {

	public Hipertenso(String nombre, Integer dni) {
		super(nombre,dni);
	}

	@Override
	public Boolean darIngesta(Plato asado) {
		Boolean puedeComer=false;
		if (asado.tieneSal()==false) {
			puedeComer=true;
			super.darIngesta(asado);
		}
		return puedeComer;
	
}
}
