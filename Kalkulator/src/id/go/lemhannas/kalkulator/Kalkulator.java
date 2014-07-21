package id.go.lemhannas.kalkulator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class Kalkulator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	public double jumlah;
	public double data, datakedua;
	public String operator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator frame = new Kalkulator();
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
	public Kalkulator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 427, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		textField.setBounds(10, 36, 292, 49);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JButton button = new JButton("1");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText().concat("1"));
				
			}
		});
		button.setBounds(10, 96, 91, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText().concat("2"));
				
			}
		});
		
		button_1.setBounds(110, 96, 91, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText().concat("3"));
				
			}
		});
		button_2.setBounds(211, 96, 91, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText().concat("4"));
				
			}
		});
		button_3.setBounds(10, 130, 91, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText().concat("5"));
				
			}
		});
		button_4.setBounds(110, 130, 91, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText().concat("6"));
				
			}
		});
		button_5.setBounds(211, 130, 91, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText().concat("7"));
				
			}
		});
		button_6.setBounds(10, 164, 91, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText().concat("8"));
				}
		});
		button_7.setBounds(110, 164, 91, 23);
		
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText().concat("9"));
				
			}
		});
		button_8.setBounds(211, 164, 91, 23);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("0");
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText().concat("0"));
			}
		});
		button_9.setBounds(110, 198, 91, 23);
		contentPane.add(button_9);
		
		JButton button_15 = new JButton(".");
		button_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText().concat("."));
			}
		});
		button_15.setBounds(10, 198, 91, 23);
		contentPane.add(button_15);
		
		JButton button_10 = new JButton("+");
		button_10.addMouseListener(new MouseAdapter() {
			

			@Override
			public void mouseClicked(MouseEvent e) {
				// textField.setText(textField.getText().concat("+"));
				
				data = Double.parseDouble(textField.getText());
				operator = "penjumlahan";
				
				textField.setText("");
				
				
				
			}
		});
		button_10.setBounds(312, 96, 91, 23);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("-");
		button_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				data = Double.parseDouble(textField.getText());
				operator = "pengurangan";
				
				textField.setText("");
			}
		});
		button_11.setBounds(312, 130, 91, 23);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("/");
		button_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				data = Double.parseDouble(textField.getText());
				operator = "pembagian";
				textField.setText("");
			}
		});
		button_12.setBounds(312, 164, 91, 23);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("*");
		button_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				data = Double.parseDouble(textField.getText());
				operator = "perkalian";
				textField.setText("");
			}
		});
		button_13.setBounds(312, 198, 91, 23);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("=");
		button_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				datakedua = Double.parseDouble(textField.getText());
				
				switch (operator) {
				case "penjumlahan"	:jumlah = data + datakedua; break;
				case "pengurangan"	:jumlah = data - datakedua; break;
				case "pembagian"	:jumlah = data / datakedua; break;
				case "perkalian"	:jumlah = data * datakedua; break;
				}
				
				String hasilakhir = String.valueOf(jumlah);
				textField.setText(hasilakhir);
				
			}
		});
		button_14.setBounds(211, 198, 91, 23);
		contentPane.add(button_14);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setBounds(312, 36, 91, 49);
		contentPane.add(btnClear);
		
		
		
		
		
		
	}
}