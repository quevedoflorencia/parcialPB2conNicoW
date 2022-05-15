package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class testParcial {

	@Test
	public void queSePuedaCrearUnPaciente() {
		String nombre="mariano";
		Integer dni= 123;
		
		
		Paciente paciente1= new Paciente(nombre,dni);
		assertNotNull(paciente1);
	}
	
	@Test
	public void queSePuedaCrearUnPlato() {
		String nombrePlato="fideos";
		Boolean esCrudo=false;
		
		Plato plato1= new Plato (nombrePlato,esCrudo);
		assertNotNull(plato1);
	}
	
	@Test
	public void queSePuedaCrearUnIngrediente() {
		String harina="harina";
		Boolean tieneSal=true;
		Boolean tieneAzucar=false;
		Boolean tieneTacc=true;
		
		Ingrediente ingredientePrincipal= new Ingrediente (harina,tieneSal,tieneAzucar,tieneTacc);
		assertNotNull(ingredientePrincipal);
	}

	@Test
	public void queSePuedaAgregarUnIngredienteAlPlato() {
		String nombrePlato="pizza";
		String ingredienteQueso="queso";
		Boolean tieneSal=true;
		Boolean tieneAzucar=false;
		Boolean tieneTacc=true;
		Boolean esCrudo=false;
		
		Plato pizza= new Plato(nombrePlato,esCrudo);
		Ingrediente queso=new Ingrediente (ingredienteQueso,tieneSal,tieneAzucar,tieneTacc);
		
		assertTrue(pizza.agregarIngrediente(queso));
		
	}
	
	@Test
	public void queSePuedaDarDeComerAUnPacienteCeliaco() {
		String nombre="mariano";
		Integer dni= 123;
			
		String nombrePlato="pizza";
		
		String ingredienteQueso="queso";
		Boolean tieneSal=true;
		Boolean tieneAzucar=false;
		Boolean tieneTacc=true;
		Boolean esCrudo=false;
		
		Paciente pacienteCeliaco= new Celiaco(nombre,dni);
		Plato pizza= new Plato(nombrePlato,esCrudo);
		Ingrediente queso=new Ingrediente (ingredienteQueso,tieneSal,tieneAzucar,tieneTacc);
		
		pizza.agregarIngrediente(queso);
		assertFalse(pacienteCeliaco.darIngesta(pizza));
		
		
	}
	@Test
	public void queSePuedaDarDeComerAUnPacienteDiabetico() {
		String nombre="rogelio";
		Integer dni= 123;
			
		String nombrePlato="flan";
		
		String ingredienteDulceDeLeche="dulceDeLeche";
		Boolean tieneSal=false;
		Boolean tieneAzucar=true;
		Boolean tieneTacc=true;
		Boolean esCrudo=false;
		
		Paciente pacienteDiabetico= new Diabetico(nombre,dni);
		Plato flan= new Plato(nombrePlato,esCrudo);
		Ingrediente dulceDeLeche=new Ingrediente (ingredienteDulceDeLeche,tieneSal,tieneAzucar,tieneTacc);
		
		flan.agregarIngrediente(dulceDeLeche);
		assertFalse(pacienteDiabetico.darIngesta(flan));
			
	}
	
	@Test
	public void queNoSePuedaDarDeComerAUnPacienteHipertenso() {
		String nombre="mamerto";
		Integer dni= 123;
			
		String nombrePlato="asado";
		
		String ingredienteCarne="carne";
		Boolean tieneSal=true;
		Boolean tieneAzucar=false;
		Boolean tieneTacc=false;
		Boolean esCrudo=false;
		
		Paciente pacienteHipertenso= new Hipertenso(nombre,dni);
		Plato asado= new Plato(nombrePlato,esCrudo);
		Ingrediente carne=new Ingrediente (ingredienteCarne,tieneSal,tieneAzucar,tieneTacc);
		
		asado.agregarIngrediente(carne);
		assertFalse(pacienteHipertenso.darIngesta(asado));
			
	}
}
