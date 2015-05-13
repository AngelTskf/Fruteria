package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BuscarArticuloUI extends JPanel {
	private JTextField txtBusquedaNombre;
	private JTextField txtPrecio;
	private JTextField txtPVP;
	private JTextField txtDescripcion;
	private JTextField txtMensaje;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public BuscarArticuloUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {110, 110, 66, 70, 30, 125, 95, 0};
		gridBagLayout.rowHeights = new int[]{14, 0, 0, 53, 23, 0, 0, 0, 58, 19, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblBusquedaNombre = new JLabel("Busqueda Nombre");
		lblBusquedaNombre.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblBusquedaNombre = new GridBagConstraints();
		gbc_lblBusquedaNombre.anchor = GridBagConstraints.EAST;
		gbc_lblBusquedaNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblBusquedaNombre.gridx = 0;
		gbc_lblBusquedaNombre.gridy = 1;
		add(lblBusquedaNombre, gbc_lblBusquedaNombre);
		
		txtBusquedaNombre = new JTextField();
		GridBagConstraints gbc_txtBusquedaNombre = new GridBagConstraints();
		gbc_txtBusquedaNombre.gridwidth = 5;
		gbc_txtBusquedaNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtBusquedaNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBusquedaNombre.gridx = 1;
		gbc_txtBusquedaNombre.gridy = 1;
		add(txtBusquedaNombre, gbc_txtBusquedaNombre);
		txtBusquedaNombre.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.anchor = GridBagConstraints.WEST;
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 0);
		gbc_btnBuscar.gridx = 6;
		gbc_btnBuscar.gridy = 1;
		add(btnBuscar, gbc_btnBuscar);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 2;
		add(lblNombre, gbc_lblNombre);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 5;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 2;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 0;
		gbc_lblPrecio.gridy = 3;
		add(lblPrecio, gbc_lblPrecio);
		
		txtPrecio = new JTextField();
		GridBagConstraints gbc_txtPrecio = new GridBagConstraints();
		gbc_txtPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecio.gridx = 1;
		gbc_txtPrecio.gridy = 3;
		add(txtPrecio, gbc_txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel label = new JLabel("\u20AC");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 3;
		gbc_label.gridy = 3;
		add(label, gbc_label);
		
		JLabel lblPvp = new JLabel("PVP");
		GridBagConstraints gbc_lblPvp = new GridBagConstraints();
		gbc_lblPvp.anchor = GridBagConstraints.EAST;
		gbc_lblPvp.insets = new Insets(0, 0, 5, 5);
		gbc_lblPvp.gridx = 4;
		gbc_lblPvp.gridy = 3;
		add(lblPvp, gbc_lblPvp);
		
		txtPVP = new JTextField();
		GridBagConstraints gbc_txtPVP = new GridBagConstraints();
		gbc_txtPVP.insets = new Insets(0, 0, 5, 5);
		gbc_txtPVP.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPVP.gridx = 5;
		gbc_txtPVP.gridy = 3;
		add(txtPVP, gbc_txtPVP);
		txtPVP.setColumns(10);
		
		JLabel lblEuros = new JLabel("\u20AC");
		GridBagConstraints gbc_lblEuros = new GridBagConstraints();
		gbc_lblEuros.anchor = GridBagConstraints.WEST;
		gbc_lblEuros.insets = new Insets(0, 0, 5, 0);
		gbc_lblEuros.gridx = 6;
		gbc_lblEuros.gridy = 3;
		add(lblEuros, gbc_lblEuros);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
		GridBagConstraints gbc_lblDescripcin = new GridBagConstraints();
		gbc_lblDescripcin.anchor = GridBagConstraints.EAST;
		gbc_lblDescripcin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcin.gridx = 0;
		gbc_lblDescripcin.gridy = 4;
		add(lblDescripcin, gbc_lblDescripcin);
		
		txtDescripcion = new JTextField();
		GridBagConstraints gbc_txtDescripcion = new GridBagConstraints();
		gbc_txtDescripcion.gridheight = 4;
		gbc_txtDescripcion.gridwidth = 6;
		gbc_txtDescripcion.insets = new Insets(0, 0, 5, 0);
		gbc_txtDescripcion.fill = GridBagConstraints.BOTH;
		gbc_txtDescripcion.gridx = 1;
		gbc_txtDescripcion.gridy = 4;
		add(txtDescripcion, gbc_txtDescripcion);
		txtDescripcion.setColumns(10);
		
		JLabel lblMensaje = new JLabel("Mensaje");
		GridBagConstraints gbc_lblMensaje = new GridBagConstraints();
		gbc_lblMensaje.anchor = GridBagConstraints.EAST;
		gbc_lblMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_lblMensaje.gridx = 0;
		gbc_lblMensaje.gridy = 8;
		add(lblMensaje, gbc_lblMensaje);
		
		txtMensaje = new JTextField();
		GridBagConstraints gbc_txtMensaje = new GridBagConstraints();
		gbc_txtMensaje.insets = new Insets(0, 0, 5, 0);
		gbc_txtMensaje.gridwidth = 6;
		gbc_txtMensaje.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMensaje.gridx = 1;
		gbc_txtMensaje.gridy = 8;
		add(txtMensaje, gbc_txtMensaje);
		txtMensaje.setColumns(10);

	}

}
