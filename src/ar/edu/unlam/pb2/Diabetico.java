package ar.edu.unlam.pb2;

public class Diabetico extends Paciente {
	
	public Diabetico (String nombre, Integer dni) {
		super(nombre,dni);
	}
	
	@Override
	public Boolean darIngesta(Plato flan) {
		Boolean puedeComer=false;
		if (flan.tieneAzucal()==false) {
			puedeComer=true;
			super.darIngesta(flan);
		}
		return puedeComer;
	
}

	
	
}
