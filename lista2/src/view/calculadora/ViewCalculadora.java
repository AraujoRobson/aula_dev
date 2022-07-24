package view.calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import exercicios.Calculadora;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class ViewCalculadora {

	private JFrame frmCalculadora;
	private JTextField txtNumeros;
	private JTextField txtResultado;
	private double numero1 = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCalculadora window = new ViewCalculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewCalculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setIconImage(Toolkit.getDefaultToolkit().getImage(ViewCalculadora.class.getResource("/imgs/icons8-math-48.png")));
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmCalculadora.setResizable(false);
		frmCalculadora.setBounds(100, 100, 304, 391);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		Calculadora calc = new Calculadora();
		
		JLabel lblNumero1 = new JLabel("");
		lblNumero1.setBackground(Color.BLACK);
		lblNumero1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumero1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNumero1.setBounds(10, 75, 197, 20);
		frmCalculadora.getContentPane().add(lblNumero1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(217, 20, 63, 49);
		frmCalculadora.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblOperacao = new JLabel("?");
		lblOperacao.setBounds(0, 0, 63, 49);
		panel_1.add(lblOperacao);
		lblOperacao.setFont(new Font("Verdana", Font.BOLD, 24));
		lblOperacao.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnSomar = new JButton("");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOperacao.setText("+");
				if(txtNumeros.getText().equals("") && numero1 == 0) {
					numero1 = 0;
				}else if(numero1 != 0){
					numero1 = numero1;
				}else {
					numero1 = Integer.parseInt(txtNumeros.getText());
				}
				lblNumero1.setText(Double.toString(numero1));
				txtNumeros.setText(null);
			}
		});
		btnSomar.setIcon(new ImageIcon(ViewCalculadora.class.getResource("/imgs/soma-ios-glyph.png")));
		btnSomar.setBounds(10, 107, 59, 59);
		frmCalculadora.getContentPane().add(btnSomar);
		
		JButton btnSubtrair = new JButton("");
		btnSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOperacao.setText("-");
				if(txtNumeros.getText().equals("") && numero1 == 0) {
					numero1 = 0;
				}else if(numero1 != 0){
					numero1 = numero1;
				}else {
					numero1 = Integer.parseInt(txtNumeros.getText());
				}
				lblNumero1.setText(Double.toString(numero1));
				txtNumeros.setText(null);
			}
		});
		btnSubtrair.setIcon(new ImageIcon(ViewCalculadora.class.getResource("/imgs/menos-ios-glyph.png")));
		btnSubtrair.setBounds(79, 107, 59, 59);
		frmCalculadora.getContentPane().add(btnSubtrair);
		
		JButton btnDividir = new JButton("");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOperacao.setText("/");
				if(txtNumeros.getText().equals("") && numero1 == 0) {
					numero1 = 0;
				}else if(numero1 != 0){
					numero1 = numero1;
				}else {
					numero1 = Integer.parseInt(txtNumeros.getText());
				}
				lblNumero1.setText(Double.toString(numero1));
				txtNumeros.setText(null);
			}
		});
		btnDividir.setIcon(new ImageIcon(ViewCalculadora.class.getResource("/imgs/dividir-ios-glyph.png")));
		btnDividir.setBounds(217, 107, 59, 59);
		frmCalculadora.getContentPane().add(btnDividir);
		
		JButton btnMultiplicar = new JButton("");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOperacao.setText("*");
				if(txtNumeros.getText().equals("") && numero1 == 0) {
					numero1 = 0;
				}else if(numero1 != 0){
					numero1 = numero1;
				}else {
					numero1 = Integer.parseInt(txtNumeros.getText());
				}
				lblNumero1.setText(Double.toString(numero1));
				txtNumeros.setText(null);
			}
		});
		btnMultiplicar.setIcon(new ImageIcon(ViewCalculadora.class.getResource("/imgs/multiplicar-ios-glyph.png")));
		btnMultiplicar.setBounds(148, 107, 59, 59);
		frmCalculadora.getContentPane().add(btnMultiplicar);
		
		txtNumeros = new JTextField();
		txtNumeros.setFont(new Font("Verdana", Font.PLAIN, 20));
		txtNumeros.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumeros.setBounds(10, 20, 197, 49);
		frmCalculadora.getContentPane().add(txtNumeros);
		txtNumeros.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 245, 133, 89);
		frmCalculadora.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblResultado.setBounds(10, 10, 110, 13);
		panel.add(lblResultado);
		
		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Verdana", Font.PLAIN, 20));
		txtResultado.setEditable(false);
		txtResultado.setColumns(10);
		txtResultado.setBounds(10, 33, 110, 45);
		panel.add(txtResultado);
		
		JButton btnLimpar = new JButton("");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNumeros.setText(null);
				lblNumero1.setText(null);
				lblOperacao.setText("?");
				txtResultado.setText(null);
				numero1 = 0;
			}
		});
		btnLimpar.setIcon(new ImageIcon(ViewCalculadora.class.getResource("/imgs/broom-win11-color.png")));
		btnLimpar.setBounds(148, 245, 128, 89);
		frmCalculadora.getContentPane().add(btnLimpar);
		
		JButton btnResultado = new JButton("");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(lblOperacao.getText().equals("+")) {
					txtResultado.setText(Double.toString(calc.somar(numero1, Integer.parseInt(txtNumeros.getText()))));
					numero1 = 0;
					txtNumeros.setText(null);
					lblNumero1.setText(null);
				}else if(lblOperacao.getText().equals("-")) {
					txtResultado.setText(Double.toString(calc.subtrair(numero1, Integer.parseInt(txtNumeros.getText()))));
					numero1 = 0;
					txtNumeros.setText(null);
					lblNumero1.setText(null);
				}else if(lblOperacao.getText().equals("*")){
					txtResultado.setText(Double.toString(calc.multiplicar(numero1, Integer.parseInt(txtNumeros.getText()))));
					numero1 = 0;
					txtNumeros.setText(null);
					lblNumero1.setText(null);
				}else if(lblOperacao.getText().equals("/")) {
					txtResultado.setText(Double.toString(calc.dividir(numero1, Integer.parseInt(txtNumeros.getText()))));
					numero1 = 0;
					txtNumeros.setText(null);
					lblNumero1.setText(null);
				}else {
					JOptionPane.showMessageDialog(null, "Nenhuma Operação Foi Selecionada!");
				}
				
				
			}
		});
		btnResultado.setIcon(new ImageIcon(ViewCalculadora.class.getResource("/imgs/icons8-equal-sign-30.png")));
		btnResultado.setBounds(10, 176, 266, 59);
		frmCalculadora.getContentPane().add(btnResultado);
		
		
	}
}
