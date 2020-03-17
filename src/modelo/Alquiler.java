package modelo;

public class Alquiler {
	public Tipo alquiler;
	public String entrada,salida;
	public Presentable presentable;
	
	public Alquiler(Tipo alquiler, String entrada, String salida, Presentable campable) {
		super();
		this.alquiler = alquiler;
		this.entrada = entrada;
		this.salida = salida;
		this.presentable = campable;
	}

	public Tipo getalquiler() {
		return alquiler;
	}

	public String getEntrada() {
		return entrada;
	}
	public String getSalida() {
		return salida;
	}
	public Presentable getCampable() {
		return presentable;
	}
	@Override
	public String toString() {
		return alquiler.toString()+" con entrada "+entrada+" y salida "+salida+" asociado a  "+presentable.presenta();
	}
}
