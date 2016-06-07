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

public class Alumnos extends JFrame {

	private JPanel contentPane;
	private JPasswordField pswContraseña;
	private JTextField textField;
	private JLabel lblContrasea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alumnos frame = new Alumnos();
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
	public Alumnos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("ADMINISTRAC\u00D3N");
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 35));
		
		pswContraseña = new JPasswordField();
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnLogin = new JButton("LOGIN");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(108)
					.addComponent(lblNewLabel)
					.addContainerGap(113, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(192)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(pswContraseña, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
							.addGap(208))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(221)
					.addComponent(lblUsuario)
					.addContainerGap(245, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(212)
					.addComponent(lblContrasea)
					.addContainerGap(227, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(224)
					.addComponent(btnLogin)
					.addContainerGap(237, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(60)
					.addComponent(lblNewLabel)
					.addGap(54)
					.addComponent(lblUsuario)
					.addGap(18)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(22)
					.addComponent(lblContrasea, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(pswContraseña, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(btnLogin)
					.addContainerGap(164, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
