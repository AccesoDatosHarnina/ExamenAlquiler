package modelo;

public class Grande extends Tipo {
	public int pagoAplazado;

	public Grande(int id, int personas, int elementos, int pagoAplaazdo) {
		super(id, personas,elementos);
		this.pagoAplazado = pagoAplaazdo;
	}
	@Override
	public String toString() {
		return "El alquiler grande "+super.toString();
	}
	
}
