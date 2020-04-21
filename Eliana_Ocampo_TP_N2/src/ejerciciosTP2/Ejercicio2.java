package ejerciciosTP2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtPromedio;
	private JTextField txtCondicion;

	
	/**
	 * Create the frame.
	 */
	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNotas1 = new JLabel("Notas del estudiante:");
		lblNotas1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNotas1.setBounds(15, 16, 186, 20);
		contentPane.add(lblNotas1);
		
		JLabel lblNota1 = new JLabel("Nota1:");
		lblNota1.setBounds(25, 50, 54, 20);
		contentPane.add(lblNota1);
		
		JLabel lblNewLabel = new JLabel("Nota2:");
		lblNewLabel.setBounds(25, 86, 54, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNota = new JLabel("Nota3:");
		lblNota.setBounds(25, 122, 54, 20);
		contentPane.add(lblNota);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(94, 47, 146, 26);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(94, 83, 146, 26);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.setBounds(94, 119, 146, 26);
		contentPane.add(txtNota3);
		txtNota3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("TPS");
		lblNewLabel_1.setBounds(25, 161, 37, 20);
		contentPane.add(lblNewLabel_1);
		
		JComboBox cbxTPS = new JComboBox();
		cbxTPS.setBounds(94, 158, 146, 26);
		cbxTPS.addItem("APROBADO");
		cbxTPS.addItem("DESAPROBADO");
		contentPane.add(cbxTPS);
		
		JLabel lblNewLabel_2 = new JLabel("Condici\u00F3n estudiante:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(15, 221, 186, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Promedio:");
		lblNewLabel_3.setBounds(25, 257, 76, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Condici\u00F3n:");
		lblNewLabel_4.setBounds(25, 293, 76, 20);
		contentPane.add(lblNewLabel_4);
		
		txtPromedio = new JTextField();
		txtPromedio.setBounds(109, 254, 146, 26);
		contentPane.add(txtPromedio);
		txtPromedio.setColumns(10);
		
		txtCondicion = new JTextField();
		txtCondicion.setBounds(109, 290, 146, 26);
		contentPane.add(txtCondicion);
		txtCondicion.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int uno = Integer.parseInt(txtNota1.getText());
				int dos = Integer.parseInt(txtNota2.getText());
				int tres = Integer.parseInt(txtNota3.getText());
				int prom = uno+dos+tres;
				prom = prom/3;
				txtPromedio.setText(String.valueOf(prom));
				if(uno>7&&dos>7&&tres>7&&cbxTPS.getSelectedIndex()==0) {
					txtCondicion.setText("PROMOCIONADO");
				}
				else if(uno>5&&dos>5&&tres>5&&cbxTPS.getSelectedIndex()==0) {
					txtCondicion.setText("REGULAR");
				}
				else
				{
					txtCondicion.setText("LIBRE");
				}
				
			}
		});
		btnCalcular.setBounds(304, 61, 115, 29);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNota1.setText("");
				txtNota2.setText("");
				txtNota3.setText("");
				txtPromedio.setText("");
				txtCondicion.setText("");
				cbxTPS.setSelectedIndex(0);
			}
		});
		btnNuevo.setBounds(304, 106, 115, 29);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnSalir.setBounds(304, 151, 115, 29);
		contentPane.add(btnSalir);
	}
}
