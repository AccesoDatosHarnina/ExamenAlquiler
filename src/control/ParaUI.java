package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.UI;

public class ParaUI extends UI {
	Controlador controlador=new Controlador();

	public ParaUI() {
		super();
		getBtnValidar().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String mensaje="todo correcto";
				if(!controlador.darAltaAlquiler(getTxtAlquiler().getText(),
						getTxtEntrada().getText(),getTxtSalida().getText(),getTxtCliente().getText())) {
					mensaje="fallo al dar de alta";
				}else {
					limpiarCrearAlquiler();					
				}
				getLblMensaje().setText(mensaje);
			}

			
		});
		getBtnActualiza().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getTextArea().setText(controlador.mostrarAlquileres().toString());
			}
		});
	}

}
