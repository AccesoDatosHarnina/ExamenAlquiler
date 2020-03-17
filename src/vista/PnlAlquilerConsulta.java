package vista;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PnlAlquilerConsulta extends JPanel {
	private JTextArea textArea;
	private JButton btnActualiza;

	/**
	 * Create the panel.
	 */
	public PnlAlquilerConsulta() {
		
		JLabel lblConsultaEstancias = new JLabel("Consulta Alquiler");
		lblConsultaEstancias.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnActualiza = new JButton("Actualiza");
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(391, Short.MAX_VALUE)
					.addComponent(lblConsultaEstancias)
					.addGap(388))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(79)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 851, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(95, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(829, Short.MAX_VALUE)
					.addComponent(btnActualiza)
					.addGap(107))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(45)
					.addComponent(lblConsultaEstancias)
					.addGap(16)
					.addComponent(btnActualiza)
					.addGap(38)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 502, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(94, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public JButton getBtnActualiza() {
		return btnActualiza;
	}
}
