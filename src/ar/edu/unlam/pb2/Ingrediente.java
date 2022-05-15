package ar.edu.unlam.pb2;

public class Ingrediente {

	private String harina;
	private Boolean tieneSal;
	private Boolean tieneAzucar;
	private Boolean tieneTacc;

	public Ingrediente(String harina, Boolean tieneSal, Boolean tieneAzucar, Boolean tieneTacc) {
		this.harina=harina;
		this.tieneSal=tieneSal;
		this.tieneAzucar=tieneAzucar;
		this.tieneTacc=tieneTacc;
	}

	public String getHarina() {
		return harina;
	}

	public void setHarina(String harina) {
		this.harina = harina;
	}

	public Boolean getTieneSal() {
		return tieneSal;
	}

	public void setTieneSal(Boolean tieneSal) {
		this.tieneSal = tieneSal;
	}

	public Boolean getTieneAzucar() {
		return tieneAzucar;
	}

	public void setTieneAzucar(Boolean tieneAzucar) {
		this.tieneAzucar = tieneAzucar;
	}

	public Boolean getTieneTacc() {
		return tieneTacc;
	}

	public void setTieneTacc(Boolean tieneTacc) {
		this.tieneTacc = tieneTacc;
	}

}
