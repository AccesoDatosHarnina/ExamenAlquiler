package control;

import modelo.Alquiler;
import modelo.Presentable;
import modelo.Tipo;

public class GestorAlquiler {
	int cantidad = 10;
	public Alquiler[] alquileres = new Alquiler[cantidad];
	int ultima = 0;

	private boolean addAlquiler(Alquiler Alquiler) {
		boolean retorno = false;
		if (ultima < alquileres.length) {
			alquileres[ultima] = Alquiler;
			ultima++;
			retorno = true;
		}
		return true;
	}

	public Alquiler[] getalquileres() {
		return alquileres;
	}

	public boolean addAlquiler(Tipo tipoActual, String entrada, String salida, Presentable clienteActual) {
		boolean retorno = false;
		if (!buscarAlquiler(tipoActual)) {
			addAlquiler(new Alquiler(tipoActual, entrada, salida, clienteActual));
			retorno = true;
		}
		return retorno;
	}

	private boolean buscarAlquiler(Tipo alojamiento) {
		boolean retorno = true;
		for (int i = 0; i < ultima && retorno; i++) {
			retorno = alquileres[i].getalquiler().equals(alojamiento);
		}
		return false;
	}

	public StringBuilder mostrarAlquileres() {
		StringBuilder mensaje = new StringBuilder();
		for (int i = 0; i < ultima; i++) {
			mensaje.append(alquileres[i].toString());
			mensaje.append("\n");
		}
		return mensaje;
	}
}
