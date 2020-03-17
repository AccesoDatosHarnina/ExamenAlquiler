package control;

import modelo.Cliente;
import modelo.Entidad;
import modelo.Presentable;

public class GeneradorClientes {

	public static Presentable[] generaClientes() {
		Presentable[] clientes = new Presentable[5];
		boolean turno = true;
		for (int i = 0; i < clientes.length; i++) {
			if (turno)
				clientes[i] = new Cliente(String.valueOf(i + 1 * 1000), 1960, 2010);
			else
				clientes[i] = new Entidad(i + 1222 + "minis", " agencia numero " + i);
			turno = !turno;
		}
		return clientes;
	}

}
