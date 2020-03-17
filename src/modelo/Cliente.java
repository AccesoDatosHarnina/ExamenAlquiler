package modelo;

public class Cliente implements Presentable{
	public String dni;
	public int anno;
	public int annoAlta;

	public Cliente(String dni, int anno, int annoAlta) {
		super();
		this.dni = dni;
		this.anno = anno;
		this.annoAlta = annoAlta;
	}

	@Override
	public String presenta() {
		return " soy el cliente "+dni;
	}

}
