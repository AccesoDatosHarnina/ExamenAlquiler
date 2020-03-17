package modelo;

public class Entidad implements Presentable {
	public String numeroMinisterial;
	public String nombre;
	

	public Entidad(String numeroMinisterial, String nombre) {
		super();
		this.numeroMinisterial = numeroMinisterial;
		this.nombre = nombre;
	}


	@Override
	public String presenta() {
		return " me presento como " + nombre;
	}
}
