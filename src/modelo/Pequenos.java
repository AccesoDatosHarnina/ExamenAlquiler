package modelo;

public class Pequenos extends Tipo {
	public boolean weekend;

	public Pequenos(int id, int personas,int elementos,boolean weekend) {
		super(id, personas,elementos);
		this.weekend = weekend;
	}

	@Override
	public String toString() {
		return "el alquiler pequeno "+super.toString();
	}
}
