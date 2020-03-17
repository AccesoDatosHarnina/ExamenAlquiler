package modelo;

public class Tipo {
	public int referencia;
	public int personas;
	public int elementos;
	

			
	public Tipo(int referencia, int personas, int elementos) {
		super();
		this.referencia = referencia;
		this.personas = personas;
		this.elementos = elementos;
	}

	@Override
	public boolean equals(Object obj) {
		return referencia==((Tipo)obj).referencia;
	}

	
	@Override
	public String toString() {
		return " con referencia:"+referencia;
	}
}
