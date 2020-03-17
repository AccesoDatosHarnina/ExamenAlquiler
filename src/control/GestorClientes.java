package control;

import modelo.Cliente;
import modelo.Presentable;

public class GestorClientes {
	public Presentable[] clientes;

	public GestorClientes() {
		super();
		clientes=GeneradorClientes.generaClientes();
	}

	public Presentable getCliente(Integer id) {
		Presentable retorno=null;
		if(id<clientes.length) {
			retorno=clientes[id];
		}
		return retorno;
	}
	
	
	

}
