package ejerciciosTP2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class VentanaP extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public VentanaP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnEjercicio1 = new JButton("Ejercicio 1");
		btnEjercicio1.setBounds(168, 13, 105, 29);
		btnEjercicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio1 uno = new Ejercicio1();
				uno.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnEjercicio1);
		
		JButton btnEjercicio3 = new JButton("Ejercicio 3");
		btnEjercicio3.setBounds(168, 159, 105, 29);
		btnEjercicio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio3 tres = new Ejercicio3();
				tres.setVisible(true);
			}
		});
		
		JButton btnEjercicio2 = new JButton("Ejercicio 2");
		btnEjercicio2.setBounds(168, 86, 105, 29);
		btnEjercicio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ejercicio2 dos = new Ejercicio2();
				dos.setVisible(true);
			}
		});
		contentPane.add(btnEjercicio2);
		contentPane.add(btnEjercicio3);
	}
	
	public void SetVisibilidad(boolean x)
	{
		setVisible(true);
	}

}
