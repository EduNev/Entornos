package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class Pestañas extends JFrame {

	private JPanel contentPane;
	private JPanel pnAdm;
	private JPanel pnProf;
	private JPanel pnAlum;
	private JTable tblNotas;
	private JTextField textField_1;
	private JCheckBox chbxVerificacionModulo;
	private JComboBox cbxProfesor;
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table_2;
	private JComboBox cbxAlumno;
	private JComboBox cbxAsignatura;
	private JComboBox cbxNota;
	private JComboBox comboBox_1;
	DefaultTableModel modelNotas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pestañas frame = new Pestañas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pestañas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		pnAdm = new JPanel();
		tabbedPane.addTab("Administración de Notas", null, pnAdm, null);
		
		cbxAlumno = new JComboBox();
		cbxAlumno.setModel(new DefaultComboBoxModel(new String[] {"Pepe Garc\u00EDa", "Luis Perez", "Antonio Garza"}));
		
		cbxAsignatura = new JComboBox();
		cbxAsignatura.setModel(new DefaultComboBoxModel(new String[] {"DAM", "ASIR"}));
		
		cbxNota = new JComboBox();
		cbxNota.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		
		JCheckBox chckbxVerificacin = new JCheckBox("Verificaci\u00F3n");
		
		JButton btnListo = new JButton("Listo");
		btnListo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Object [] fila = {cbxAlumno.getSelectedItem(),cbxAsignatura.getSelectedItem(),cbxNota.getSelectedItem()};
				modelNotas.addRow(fila);
				
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblAlumno = new JLabel("Alumno");
		lblAlumno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblModulo = new JLabel("Modulo");
		lblModulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNota = new JLabel("Nota");
		lblNota.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_pnAdm = new GroupLayout(pnAdm);
		gl_pnAdm.setHorizontalGroup(
			gl_pnAdm.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnAdm.createSequentialGroup()
					.addContainerGap(425, Short.MAX_VALUE)
					.addComponent(chckbxVerificacin)
					.addGap(54))
				.addGroup(gl_pnAdm.createSequentialGroup()
					.addGap(47)
					.addComponent(cbxAlumno, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_pnAdm.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnAdm.createSequentialGroup()
							.addGap(74)
							.addComponent(cbxAsignatura, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnAdm.createSequentialGroup()
							.addGap(89)
							.addComponent(lblModulo)))
					.addGroup(gl_pnAdm.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnAdm.createSequentialGroup()
							.addGap(84)
							.addComponent(cbxNota, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnAdm.createSequentialGroup()
							.addGap(93)
							.addComponent(lblNota)))
					.addGap(91))
				.addGroup(gl_pnAdm.createSequentialGroup()
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
					.addGap(18))
				.addGroup(gl_pnAdm.createSequentialGroup()
					.addGap(72)
					.addComponent(lblAlumno)
					.addContainerGap(440, Short.MAX_VALUE))
				.addGroup(gl_pnAdm.createSequentialGroup()
					.addGap(233)
					.addComponent(btnListo)
					.addContainerGap(270, Short.MAX_VALUE))
		);
		gl_pnAdm.setVerticalGroup(
			gl_pnAdm.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnAdm.createSequentialGroup()
					.addGap(47)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
					.addGroup(gl_pnAdm.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAlumno)
						.addComponent(lblModulo, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNota))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnAdm.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbxAlumno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbxAsignatura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbxNota, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(56)
					.addComponent(chckbxVerificacin)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnListo)
					.addGap(50))
		);
		
		tblNotas = new JTable();
		tblNotas.setModel( modelNotas = new DefaultTableModel(
			new Object[][] {
			
			},
			new String[] {
				"Alumnos", "Modulo", "Notas"
			}
		));
		scrollPane.setViewportView(tblNotas);
		pnAdm.setLayout(gl_pnAdm);
		
		JPanel pnModulos = new JPanel();
		tabbedPane.addTab("Administración de Modulos", null, pnModulos, null);
		
		chbxVerificacionModulo = new JCheckBox("Verificaci\u00F3n");
		
		cbxProfesor = new JComboBox();
		cbxProfesor.setModel(new DefaultComboBoxModel(new String[] {"Pepe Garc\u00EDa", "Luis Perez", "Antonio Garza"}));
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Primero", "Segundo"}));
		
		JLabel lblCurso = new JLabel("A\u00F1o");
		lblCurso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JLabel lblProfesor = new JLabel("Profesor");
		lblProfesor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton button = new JButton("Listo");
		GroupLayout gl_pnModulos = new GroupLayout(pnModulos);
		gl_pnModulos.setHorizontalGroup(
			gl_pnModulos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnModulos.createSequentialGroup()
					.addGap(18)
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
					.addGap(18))
				.addGroup(gl_pnModulos.createSequentialGroup()
					.addGap(233)
					.addComponent(button)
					.addContainerGap(270, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_pnModulos.createSequentialGroup()
					.addGroup(gl_pnModulos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnModulos.createSequentialGroup()
							.addGap(46)
							.addComponent(cbxProfesor, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(109))
						.addGroup(gl_pnModulos.createSequentialGroup()
							.addGap(70)
							.addComponent(lblProfesor)
							.addPreferredGap(ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
							.addComponent(lblNombre)
							.addGap(117)))
					.addGroup(gl_pnModulos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnModulos.createParallelGroup(Alignment.LEADING)
							.addGroup(Alignment.TRAILING, gl_pnModulos.createSequentialGroup()
								.addComponent(comboBox_1, 0, 104, Short.MAX_VALUE)
								.addGap(29))
							.addGroup(Alignment.TRAILING, gl_pnModulos.createSequentialGroup()
								.addComponent(chbxVerificacionModulo)
								.addGap(54)))
						.addGroup(gl_pnModulos.createSequentialGroup()
							.addGap(39)
							.addComponent(lblCurso)
							.addContainerGap())))
		);
		gl_pnModulos.setVerticalGroup(
			gl_pnModulos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnModulos.createSequentialGroup()
					.addGap(47)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
					.addGroup(gl_pnModulos.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblProfesor)
						.addGroup(gl_pnModulos.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNombre)
							.addComponent(lblCurso)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnModulos.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbxProfesor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(56)
					.addComponent(chbxVerificacionModulo)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(button)
					.addGap(50))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Nombre Modulo", "Profesor", "A\u00F1o"
			}
		));
		scrollPane_1.setViewportView(table);
		pnModulos.setLayout(gl_pnModulos);
		
		pnAlum = new JPanel();
		tabbedPane.addTab("Administracion de Alumnos", null, pnAlum, null);
		
		JButton btnListo_1 = new JButton("Listo");
		
		JScrollPane scrollPane_2 = new JScrollPane();
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"DAM", "ASIR"}));
		
		JLabel lblNexpediente = new JLabel("NExpediente");
		
		JLabel lblNombreYApellidos = new JLabel("Nombre y Apellidos");
		
		JLabel lblModulo_1 = new JLabel("Modulo");
		GroupLayout gl_pnAlum = new GroupLayout(pnAlum);
		gl_pnAlum.setHorizontalGroup(
			gl_pnAlum.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnAlum.createSequentialGroup()
					.addGroup(gl_pnAlum.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnAlum.createSequentialGroup()
							.addGap(238)
							.addComponent(btnListo_1))
						.addGroup(gl_pnAlum.createSequentialGroup()
							.addGap(57)
							.addGroup(gl_pnAlum.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_pnAlum.createSequentialGroup()
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(85)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblModulo_1, Alignment.TRAILING))))
					.addContainerGap(90, Short.MAX_VALUE))
				.addGroup(gl_pnAlum.createSequentialGroup()
					.addGap(74)
					.addComponent(lblNexpediente)
					.addGap(102)
					.addComponent(lblNombreYApellidos)
					.addContainerGap(230, Short.MAX_VALUE))
		);
		gl_pnAlum.setVerticalGroup(
			gl_pnAlum.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_pnAlum.createSequentialGroup()
					.addGap(59)
					.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
					.addGroup(gl_pnAlum.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNexpediente)
						.addComponent(lblNombreYApellidos)
						.addComponent(lblModulo_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnAlum.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(81)
					.addComponent(btnListo_1)
					.addGap(70))
		);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"NumExpediente", "Modulo", "Nombre", "Apellidos"
			}
		));
		scrollPane_2.setViewportView(table_1);
		pnAlum.setLayout(gl_pnAlum);
		
		pnProf = new JPanel();
		tabbedPane.addTab("Profesorado", null, pnProf, null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		
		JLabel lblNexpediente_1 = new JLabel("NExpediente");
		
		JLabel lblNombreYApellidos_1 = new JLabel("Nombre y Apellidos");
		
		JLabel lblEmail = new JLabel("email");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JButton btnListo_2 = new JButton("listo");
		GroupLayout gl_pnProf = new GroupLayout(pnProf);
		gl_pnProf.setHorizontalGroup(
			gl_pnProf.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnProf.createSequentialGroup()
					.addGroup(gl_pnProf.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnProf.createSequentialGroup()
							.addGap(75)
							.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 391, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnProf.createSequentialGroup()
							.addGroup(gl_pnProf.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(Alignment.LEADING, gl_pnProf.createSequentialGroup()
									.addGap(58)
									.addComponent(lblNexpediente_1)
									.addGap(102)
									.addComponent(lblNombreYApellidos_1))
								.addGroup(gl_pnProf.createSequentialGroup()
									.addGap(45)
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_pnProf.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnProf.createSequentialGroup()
									.addGap(80)
									.addComponent(lblEmail))
								.addGroup(gl_pnProf.createSequentialGroup()
									.addGap(52)
									.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_pnProf.createSequentialGroup()
							.addGap(251)
							.addComponent(btnListo_2)))
					.addContainerGap(92, Short.MAX_VALUE))
		);
		gl_pnProf.setVerticalGroup(
			gl_pnProf.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnProf.createSequentialGroup()
					.addGap(31)
					.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
					.addGap(47)
					.addGroup(gl_pnProf.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNexpediente_1)
						.addComponent(lblNombreYApellidos_1)
						.addComponent(lblEmail))
					.addGap(18)
					.addGroup(gl_pnProf.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
					.addComponent(btnListo_2)
					.addGap(34))
		);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Num_expediente", "Nombre", "Apellido", "Email"
			}
		));
		scrollPane_3.setViewportView(table_2);
		pnProf.setLayout(gl_pnProf);
		contentPane.setLayout(gl_contentPane);
	}
}
