package id.go.lemhannas.bacadatabase;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTable;

public class penampildatabase extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNama;
	private JLabel lblAlamat;
	private JTextField textField_1;
	private JLabel lblTanggalLahir;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					penampildatabase frame = new penampildatabase();
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
	public penampildatabase() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProgramBacaTulis = new JLabel("PROGRAM BACA TULIS DATABASE MENGGUNAKAN JAVA");
		lblProgramBacaTulis.setBounds(172, 11, 273, 14);
		contentPane.add(lblProgramBacaTulis);
		
		textField = new JTextField();
		textField.setBounds(180, 36, 123, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNama = new JLabel("Nama");
		lblNama.setBounds(41, 39, 46, 14);
		contentPane.add(lblNama);
		
		lblAlamat = new JLabel("Alamat");
		lblAlamat.setBounds(41, 71, 46, 14);
		contentPane.add(lblAlamat);
		
		textField_1 = new JTextField();
		textField_1.setBounds(180, 68, 123, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblTanggalLahir = new JLabel("Tanggal Lahir");
		lblTanggalLahir.setBounds(41, 96, 97, 14);
		contentPane.add(lblTanggalLahir);
		
		lblPassword = new JLabel("password");
		lblPassword.setBounds(41, 121, 46, 14);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(179, 118, 124, 20);
		contentPane.add(passwordField);
		
		JButton btnSimpanKeDatabase = new JButton("SIMPAN KE DATABASE");
		btnSimpanKeDatabase.setBounds(330, 117, 149, 23);
		contentPane.add(btnSimpanKeDatabase);
		
		table = new JTable();
		table.setBounds(38, 248, 464, -47);
		contentPane.add(table);
	}
}
