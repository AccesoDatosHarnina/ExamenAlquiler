package control;

import modelo.Tipo;

public class GestorTipos {
	int cantidad=11;
	public Tipo tipos[];
	public GestorTipos() {
		tipos=GeneradorTipos.generaTipos();
	}
	
	public Tipo getAlojamiento(int id) {
		Tipo retorno=null;
		if(tipos.length>id) {
			retorno=tipos[id];
		}
		return retorno;
	}

	
}
