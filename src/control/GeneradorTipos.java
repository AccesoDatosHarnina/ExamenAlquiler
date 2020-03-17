package control;

import modelo.Tipo;
import modelo.Pequenos;
import modelo.Grande;

public class GeneradorTipos {

	public static Tipo[] generaTipos() {
		int cantidad = 11;
		Tipo Alquileres[] = new Tipo[cantidad];
		int i = 0;
		for (; i < Alquileres.length / 2; i++) {
			Alquileres[i] = new Grande(i + 1, i*10,i*8,60);
		}
		for (; i < Alquileres.length; i++) {
			Alquileres[i] = new Pequenos(i + 1, i*10,i*8, true);
		}
		return Alquileres;
	}
}
