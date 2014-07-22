package id.go.lemhannas.latihandatabase;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JTable;

public class FormInput extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public static String namabaru;
	public static String alamatbaru;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormInput frame = new FormInput();
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
	public FormInput() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(152, 49, 206, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNama = new JLabel("Nama");
		lblNama.setBounds(52, 52, 46, 14);
		contentPane.add(lblNama);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setLineWrap(true);
		textArea.setBounds(152, 80, 206, 46);
		contentPane.add(textArea);
		
		JLabel lblAlamat = new JLabel("Alamat");
		lblAlamat.setBounds(52, 84, 46, 14);
		contentPane.add(lblAlamat);
		
		JLabel lblFormPengisianData = new JLabel("FORM PENGISIAN DATA");
		lblFormPengisianData.setBounds(179, 11, 116, 14);
		contentPane.add(lblFormPengisianData);
		
		DefaultTableModel tabelnya = new DefaultTableModel();
		table = new JTable(tabelnya);
		table.setBounds(29, 197, 382, 46);
		contentPane.add(table);
		
		tabelnya.addColumn("ID");
		tabelnya.addColumn("Nama");
		tabelnya.addColumn("Alamat");
		
		
		JButton btnNewButton = new JButton("UPDATE DATA");
		btnNewButton.addMouseListener(new MouseAdapter() {


			public void mouseClicked(MouseEvent arg0) {
				namabaru = textField.getText();
				alamatbaru = textArea.getText();
				new KoneksiDatabase(namabaru, alamatbaru);
			}
		});
		btnNewButton.setBounds(267, 137, 91, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
