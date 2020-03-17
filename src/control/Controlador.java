package control;

import modelo.Presentable;
import modelo.Tipo;

public class Controlador {
	GestorTipos alojamientos = new GestorTipos();
	GestorClientes clientes = new GestorClientes();
	GestorAlquiler alquileres = new GestorAlquiler();

	public boolean darAltaAlquiler(String alojamiento, String entrada, String salida, String cliente) {
		Tipo alojamientoActual = alojamientos.getAlojamiento(Integer.valueOf(alojamiento));
		boolean retorno = false;
		Presentable clienteActual = clientes.getCliente(Integer.valueOf(cliente));
		if (alojamientoActual != null && clienteActual != null) {
			retorno = alquileres.addAlquiler(alojamientoActual, entrada, salida, clienteActual);
		}
		return retorno;
	}

	public StringBuilder mostrarAlquileres() {

		return alquileres.mostrarAlquileres();
	}

}
