package view.lista1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import exercicios.lista1.Atividade1;
import exercicios.lista1.Atividade2;
import exercicios.lista1.Atividade3;
import exercicios.lista1.Atividade4;
import exercicios.lista1.Atividade5;
import exercicios.lista1.Atividade6;
import exercicios.lista1.Atividade7;
import exercicios.lista1.Atividade8;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewerLista1 {

	private JFrame frame;
	private JTextField txtNumAt1;
	private JTextField txtKm;
	private JTextField txtLitros;
	private JTextField txtAnos;
	private JTextField txtPorDia;
	private JTextField txtValor;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtNomeAt5;
	private JTextField txtIdadeAt5;
	private JTextField txtIdadeAt6;
	private JTextField txtBaseAt8;
	private JTextField txtExpoenteAt8;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewerLista1 window = new ViewerLista1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewerLista1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBackground(Color.GRAY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 446, 841);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 151, 157);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNumAt1 = new JLabel("Informe um Numero:");
		lblNumAt1.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblNumAt1.setBounds(10, 36, 126, 19);
		panel.add(lblNumAt1);
		
		txtNumAt1 = new JTextField();
		txtNumAt1.setForeground(Color.BLACK);
		txtNumAt1.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		txtNumAt1.setBounds(10, 65, 126, 28);
		panel.add(txtNumAt1);
		txtNumAt1.setColumns(10);
		
		JButton btnAt1 = new JButton("Executar");
		btnAt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Atividade1 at1 = new Atividade1();
			
				JOptionPane.showMessageDialog(null, "Sucessor é: " + at1.sucessor(Integer.parseInt(txtNumAt1.getText())));
			}
		});
		btnAt1.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		btnAt1.setBounds(10, 108, 126, 39);
		panel.add(btnAt1);
		
		JLabel lblAt1 = new JLabel("Atividade 1");
		lblAt1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblAt1.setBounds(10, 10, 76, 22);
		panel.add(lblAt1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(171, 10, 248, 157);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAt2 = new JLabel("Atividade 2");
		lblAt2.setBounds(10, 10, 84, 22);
		panel_1.add(lblAt2);
		lblAt2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		
		JLabel lblKmPercorridos = new JLabel("Km percorridos");
		lblKmPercorridos.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblKmPercorridos.setBounds(10, 36, 126, 19);
		panel_1.add(lblKmPercorridos);
		
		txtKm = new JTextField();
		txtKm.setForeground(Color.BLACK);
		txtKm.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		txtKm.setColumns(10);
		txtKm.setBounds(112, 34, 126, 28);
		panel_1.add(txtKm);
		
		JLabel lblLitrosGastos = new JLabel("Litros gastos");
		lblLitrosGastos.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblLitrosGastos.setBounds(10, 67, 126, 19);
		panel_1.add(lblLitrosGastos);
		
		txtLitros = new JTextField();
		txtLitros.setForeground(Color.BLACK);
		txtLitros.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		txtLitros.setColumns(10);
		txtLitros.setBounds(112, 65, 126, 28);
		panel_1.add(txtLitros);
		
		JButton btnAt2 = new JButton("Executar");
		btnAt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Atividade2 at2 = new Atividade2();
				double km = Double.parseDouble(txtKm.getText());
				double litros = Double.parseDouble(txtLitros.getText());
				JOptionPane.showMessageDialog(null, "A média é " + at2.mediakm(km, litros));
			}
		});
		btnAt2.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		btnAt2.setBounds(61, 108, 126, 39);
		panel_1.add(btnAt2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(10, 177, 409, 157);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblAt3 = new JLabel("Atividade 3");
		lblAt3.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblAt3.setBounds(10, 10, 84, 22);
		panel_1_1.add(lblAt3);
		
		JLabel lblAnosFumando = new JLabel("Anos Fumando");
		lblAnosFumando.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnosFumando.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblAnosFumando.setBounds(10, 36, 102, 19);
		panel_1_1.add(lblAnosFumando);
		
		txtAnos = new JTextField();
		txtAnos.setForeground(Color.BLACK);
		txtAnos.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		txtAnos.setColumns(10);
		txtAnos.setBounds(10, 64, 105, 28);
		panel_1_1.add(txtAnos);
		
		JLabel lblPorDia = new JLabel("Por dia");
		lblPorDia.setHorizontalAlignment(SwingConstants.CENTER);
		lblPorDia.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblPorDia.setBounds(156, 36, 105, 19);
		panel_1_1.add(lblPorDia);
		
		txtPorDia = new JTextField();
		txtPorDia.setForeground(Color.BLACK);
		txtPorDia.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		txtPorDia.setColumns(10);
		txtPorDia.setBounds(156, 64, 105, 28);
		panel_1_1.add(txtPorDia);
		
		JButton btnAt3 = new JButton("Executar");
		btnAt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Atividade3 at3 = new Atividade3();
				int anos = Integer.parseInt(txtAnos.getText());
				int porDia = Integer.parseInt(txtPorDia.getText());
				double valor = Double.parseDouble(txtValor.getText());
				JOptionPane.showMessageDialog(null, "R$"+ at3.gastoFumante(anos, porDia, valor) + " Gastos");
			}
		});
		btnAt3.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		btnAt3.setBounds(156, 108, 105, 39);
		panel_1_1.add(btnAt3);
		
		JLabel lblValorCarteira = new JLabel("Valor Carteira");
		lblValorCarteira.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorCarteira.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblValorCarteira.setBounds(294, 36, 105, 19);
		panel_1_1.add(lblValorCarteira);
		
		txtValor = new JTextField();
		txtValor.setForeground(Color.BLACK);
		txtValor.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		txtValor.setColumns(10);
		txtValor.setBounds(294, 64, 105, 28);
		panel_1_1.add(txtValor);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(10, 344, 199, 157);
		frame.getContentPane().add(panel_1_2);
		
		JLabel lblAt4 = new JLabel("Atividade 4");
		lblAt4.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblAt4.setBounds(10, 10, 84, 22);
		panel_1_2.add(lblAt4);
		
		JLabel lblNum1 = new JLabel("N\u00FAmero 1:");
		lblNum1.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblNum1.setBounds(10, 36, 70, 19);
		panel_1_2.add(lblNum1);
		
		txtNum1 = new JTextField();
		txtNum1.setForeground(Color.BLACK);
		txtNum1.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		txtNum1.setColumns(10);
		txtNum1.setBounds(80, 34, 88, 28);
		panel_1_2.add(txtNum1);
		
		JLabel lblNum2 = new JLabel("N\u00FAmero 2:");
		lblNum2.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblNum2.setBounds(10, 67, 70, 19);
		panel_1_2.add(lblNum2);
		
		txtNum2 = new JTextField();
		txtNum2.setForeground(Color.BLACK);
		txtNum2.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		txtNum2.setColumns(10);
		txtNum2.setBounds(80, 65, 88, 28);
		panel_1_2.add(txtNum2);
		
		JButton btnAt4 = new JButton("Executar");
		btnAt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Atividade4 at4 = new Atividade4();
				double n1 = Double.parseDouble(txtNum1.getText());	
				double n2 = Double.parseDouble(txtNum2.getText());
				JOptionPane.showMessageDialog(null, "O maior número é: " + at4.maior(n1, n2));
			}
		});
		btnAt4.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		btnAt4.setBounds(19, 108, 140, 39);
		panel_1_2.add(btnAt4);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(219, 344, 200, 157);
		frame.getContentPane().add(panel_1_3);
		
		JLabel lblAt5 = new JLabel("Atividade 5");
		lblAt5.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblAt5.setBounds(10, 10, 84, 22);
		panel_1_3.add(lblAt5);
		
		JLabel lblNomeAt5 = new JLabel("Nome:");
		lblNomeAt5.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblNomeAt5.setBounds(10, 36, 50, 19);
		panel_1_3.add(lblNomeAt5);
		
		txtNomeAt5 = new JTextField();
		txtNomeAt5.setForeground(Color.BLACK);
		txtNomeAt5.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		txtNomeAt5.setColumns(10);
		txtNomeAt5.setBounds(60, 34, 126, 28);
		panel_1_3.add(txtNomeAt5);
		
		JLabel lblIdadeAt5 = new JLabel("Idade:");
		lblIdadeAt5.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblIdadeAt5.setBounds(10, 67, 50, 19);
		panel_1_3.add(lblIdadeAt5);
		
		txtIdadeAt5 = new JTextField();
		txtIdadeAt5.setForeground(Color.BLACK);
		txtIdadeAt5.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		txtIdadeAt5.setColumns(10);
		txtIdadeAt5.setBounds(60, 65, 126, 28);
		panel_1_3.add(txtIdadeAt5);
		
		JButton btnAt5 = new JButton("Executar");
		btnAt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Atividade5 at5 = new Atividade5();
				String nome = txtNomeAt5.getText();
				int idade = Integer.parseInt(txtIdadeAt5.getText());
				
				JOptionPane.showMessageDialog(null, at5.votar(nome, idade));
			}
		});
		btnAt5.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		btnAt5.setBounds(37, 108, 126, 39);
		panel_1_3.add(btnAt5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(10, 511, 151, 157);
		frame.getContentPane().add(panel_2);
		
		JLabel lblIdadeAt6 = new JLabel("Informe sua idade:");
		lblIdadeAt6.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblIdadeAt6.setBounds(10, 36, 118, 19);
		panel_2.add(lblIdadeAt6);
		
		txtIdadeAt6 = new JTextField();
		txtIdadeAt6.setForeground(Color.BLACK);
		txtIdadeAt6.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		txtIdadeAt6.setColumns(10);
		txtIdadeAt6.setBounds(10, 65, 118, 28);
		panel_2.add(txtIdadeAt6);
		
		JButton btnAt6 = new JButton("Executar");
		btnAt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Atividade6 at6 = new Atividade6();
				JOptionPane.showMessageDialog(null, at6.doarSangue(Integer.parseInt(txtIdadeAt6.getText())));
			}
		});
		btnAt6.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		btnAt6.setBounds(10, 108, 118, 39);
		panel_2.add(btnAt6);
		
		JLabel lblAt6 = new JLabel("Atividade 6");
		lblAt6.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblAt6.setBounds(10, 10, 81, 22);
		panel_2.add(lblAt6);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(171, 511, 248, 157);
		frame.getContentPane().add(panel_2_1);
		
		JLabel lblVaiLevar = new JLabel("Vai levar");
		lblVaiLevar.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblVaiLevar.setBounds(37, 36, 68, 19);
		panel_2_1.add(lblVaiLevar);
		
		
		JLabel lblAt7 = new JLabel("Atividade 7");
		lblAt7.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblAt7.setBounds(10, 10, 81, 22);
		panel_2_1.add(lblAt7);
		
		JLabel lblAnosAt7 = new JLabel("");
		lblAnosAt7.setForeground(Color.RED);
		lblAnosAt7.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		lblAnosAt7.setBounds(107, 36, 40, 19);
		panel_2_1.add(lblAnosAt7);
		
		JLabel lblVaiLevar_1_1 = new JLabel("anos");
		lblVaiLevar_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblVaiLevar_1_1.setBounds(139, 36, 40, 19);
		panel_2_1.add(lblVaiLevar_1_1);
		
		JLabel lblParaZFicar = new JLabel("para Z\u00E9 ficar maior que Chico");
		lblParaZFicar.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblParaZFicar.setBounds(37, 65, 187, 19);
		panel_2_1.add(lblParaZFicar);
		
		JButton btnAt7 = new JButton("Executar");
		btnAt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Atividade7 at7 = new Atividade7();
				lblAnosAt7.setText(at7.chigoEze());
			}
		});
		btnAt7.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		btnAt7.setBounds(64, 108, 118, 39);
		panel_2_1.add(btnAt7);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBounds(10, 678, 409, 108);
		frame.getContentPane().add(panel_1_4);
		
		JLabel lblAt8 = new JLabel("Atividade 8");
		lblAt8.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblAt8.setBounds(10, 10, 84, 22);
		panel_1_4.add(lblAt8);
		
		JLabel lblBase = new JLabel("Base");
		lblBase.setHorizontalAlignment(SwingConstants.CENTER);
		lblBase.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblBase.setBounds(10, 36, 84, 19);
		panel_1_4.add(lblBase);
		
		txtBaseAt8 = new JTextField();
		txtBaseAt8.setForeground(Color.BLACK);
		txtBaseAt8.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		txtBaseAt8.setColumns(10);
		txtBaseAt8.setBounds(112, 34, 126, 28);
		panel_1_4.add(txtBaseAt8);
		
		JLabel lblExpoente = new JLabel("Expoente");
		lblExpoente.setHorizontalAlignment(SwingConstants.CENTER);
		lblExpoente.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblExpoente.setBounds(10, 67, 84, 19);
		panel_1_4.add(lblExpoente);
		
		txtExpoenteAt8 = new JTextField();
		txtExpoenteAt8.setForeground(Color.BLACK);
		txtExpoenteAt8.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		txtExpoenteAt8.setColumns(10);
		txtExpoenteAt8.setBounds(112, 65, 126, 28);
		panel_1_4.add(txtExpoenteAt8);
		
		JButton btnAt8 = new JButton("Executar");
		btnAt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Atividade8 at8 = new Atividade8();
				int base = Integer.parseInt(txtBaseAt8.getText());
				int expo = Integer.parseInt(txtExpoenteAt8.getText());
				JOptionPane.showMessageDialog(null, "Potência: " + at8.potenciacao(base, expo));
			}
		});
		btnAt8.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		btnAt8.setBounds(273, 34, 126, 59);
		panel_1_4.add(btnAt8);
	}
}
