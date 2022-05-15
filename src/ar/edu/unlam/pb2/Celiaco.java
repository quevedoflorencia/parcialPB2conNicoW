package ar.edu.unlam.pb2;

public class Celiaco extends Paciente {

	public Celiaco(String nombre, Integer dni) {
		super(nombre,dni);
	}

	@Override
	public Boolean darIngesta(Plato pizza) {
		Boolean puedeComer=false;
		if (pizza.tieneTacc()==false) {
			puedeComer=true;
			super.darIngesta(pizza);
		}
		return puedeComer;
	
}
	
}
