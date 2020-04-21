package ejerciciosTP2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFecNac;
	private JLabel lblLosDatosIngresados;
	private JLabel lblcontenido;



	/**
	 * Create the frame.
	 */
	public Ejercicio1() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(68, 20, 69, 20);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(152, 17, 211, 26);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(68, 62, 69, 20);
		contentPane.add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(152, 59, 211, 26);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Tel\u00E9fono:");
		lblTelefono.setBounds(68, 104, 69, 20);
		contentPane.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(152, 101, 211, 26);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblFechaNac = new JLabel("Fecha Nac:");
		lblFechaNac.setBounds(60, 146, 77, 20);
		contentPane.add(lblFechaNac);
		
		txtFecNac = new JTextField();
		txtFecNac.setBounds(152, 143, 211, 26);
		contentPane.add(txtFecNac);
		txtFecNac.setColumns(10);
		lblLosDatosIngresados = new JLabel("Los datos ingresados fueron:");
		lblLosDatosIngresados.setBounds(25, 182, 211, 26);
		contentPane.add(lblLosDatosIngresados);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtNombre.getText().equals("") || txtApellido.getText().equals("") || txtTelefono.getText().equals("") || txtFecNac.getText().equals("")){
					if(txtNombre.getText().equals("")) txtNombre.setBackground(Color.RED);
					if(txtApellido.getText().equals("")) txtApellido.setBackground(Color.RED);
					if(txtTelefono.getText().equals("")) txtTelefono.setBackground(Color.RED);
					if(txtFecNac.getText().equals("")) txtFecNac.setBackground(Color.RED);
				lblcontenido.setText(" ");
				}
				else
				{
					lblcontenido.setText(txtNombre.getText()+" "+txtApellido.getText()+" "+txtTelefono.getText()+" "+txtFecNac.getText());
					txtNombre.setBackground(Color.WHITE);
					txtApellido.setBackground(Color.WHITE);
					txtTelefono.setBackground(Color.WHITE);
					txtFecNac.setBackground(Color.WHITE);
				}
			}
		});
		btnMostrar.setBounds(374, 142, 115, 29);
		contentPane.add(btnMostrar);
		
		lblcontenido = new JLabel(" ");
		lblcontenido.setBounds(25, 218, 464, 110);
		contentPane.add(lblcontenido);
		setVisible(true);
	}
}
