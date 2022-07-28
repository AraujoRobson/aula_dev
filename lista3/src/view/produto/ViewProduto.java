package view.produto;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import exercicios.Produto;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewProduto {

	private JFrame frame;
	private JTextField txtNome1;
	private JTextField txtPreco1;
	private JTextField txtNome2;
	private JTextField txtPreco2;
	private JTextField txtNome3;
	private JTextField txtPreco3;
	private JTextField txtNome4;
	private JTextField txtPreco4;
	private JTextField txtNome5;
	private JTextField txtPreco5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewProduto window = new ViewProduto();
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
	public ViewProduto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 663, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Produto prod1 = new Produto(null, 0);
		Produto prod2 = new Produto(null, 0);
		Produto prod3 = new Produto(null, 0);
		Produto prod4 = new Produto(null, 0);
		Produto prod5 = new Produto(null, 0);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 477, 65);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Produto 1:");
		lblNewLabel.setBounds(10, 11, 77, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 36, 52, 14);
		panel.add(lblNome);
		
		txtNome1 = new JTextField();
		txtNome1.setBounds(72, 33, 112, 20);
		panel.add(txtNome1);
		txtNome1.setColumns(10);
		
		JLabel lblPreo = new JLabel("Preço:  R$");
		lblPreo.setBounds(194, 36, 62, 14);
		panel.add(lblPreo);
		
		txtPreco1 = new JTextField();
		txtPreco1.setBounds(256, 33, 112, 20);
		panel.add(txtPreco1);
		txtPreco1.setColumns(10);
		
		JButton btnCadastrar1 = new JButton("Cadastrar");
		btnCadastrar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prod1.setNome(txtNome1.getText());
				prod1.setPreco(Double.parseDouble(txtPreco1.getText()));
			}
		});
		btnCadastrar1.setBounds(378, 11, 99, 43);
		panel.add(btnCadastrar1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 87, 477, 65);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Produto 2:");
		lblNewLabel_1.setBounds(10, 11, 77, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNome_1 = new JLabel("Nome:");
		lblNome_1.setBounds(10, 36, 52, 14);
		panel_1.add(lblNome_1);
		
		txtNome2 = new JTextField();
		txtNome2.setColumns(10);
		txtNome2.setBounds(72, 33, 112, 20);
		panel_1.add(txtNome2);
		
		JLabel lblPreo_1 = new JLabel("Preço:  R$");
		lblPreo_1.setBounds(194, 36, 62, 14);
		panel_1.add(lblPreo_1);
		
		txtPreco2 = new JTextField();
		txtPreco2.setColumns(10);
		txtPreco2.setBounds(256, 33, 112, 20);
		panel_1.add(txtPreco2);
		
		JButton btnCadastrar2 = new JButton("Cadastrar");
		btnCadastrar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prod2.setNome(txtNome1.getText());
				prod2.setPreco(Double.parseDouble(txtPreco2.getText()));
			}
		});
		btnCadastrar2.setBounds(378, 11, 99, 43);
		panel_1.add(btnCadastrar2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(10, 163, 477, 65);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Produto 3:");
		lblNewLabel_1_1.setBounds(10, 11, 77, 14);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNome_1_1 = new JLabel("Nome:");
		lblNome_1_1.setBounds(10, 36, 52, 14);
		panel_1_1.add(lblNome_1_1);
		
		txtNome3 = new JTextField();
		txtNome3.setColumns(10);
		txtNome3.setBounds(72, 33, 112, 20);
		panel_1_1.add(txtNome3);
		
		JLabel lblPreo_1_1 = new JLabel("Preço:  R$");
		lblPreo_1_1.setBounds(194, 36, 66, 14);
		panel_1_1.add(lblPreo_1_1);
		
		txtPreco3 = new JTextField();
		txtPreco3.setColumns(10);
		txtPreco3.setBounds(256, 33, 112, 20);
		panel_1_1.add(txtPreco3);
		
		JButton btnCadastrar3 = new JButton("Cadastrar");
		btnCadastrar3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prod3.setNome(txtNome1.getText());
				prod3.setPreco(Double.parseDouble(txtPreco3.getText()));
			}
		});
		btnCadastrar3.setBounds(378, 11, 99, 43);
		panel_1_1.add(btnCadastrar3);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBounds(10, 239, 477, 65);
		frame.getContentPane().add(panel_1_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Produto 4:");
		lblNewLabel_1_1_1.setBounds(10, 11, 77, 14);
		panel_1_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNome_1_1_1 = new JLabel("Nome:");
		lblNome_1_1_1.setBounds(10, 36, 52, 14);
		panel_1_1_1.add(lblNome_1_1_1);
		
		txtNome4 = new JTextField();
		txtNome4.setColumns(10);
		txtNome4.setBounds(72, 33, 112, 20);
		panel_1_1_1.add(txtNome4);
		
		JLabel lblPreo_1_1_1 = new JLabel("Preço:  R$");
		lblPreo_1_1_1.setBounds(194, 36, 64, 14);
		panel_1_1_1.add(lblPreo_1_1_1);
		
		txtPreco4 = new JTextField();
		txtPreco4.setColumns(10);
		txtPreco4.setBounds(256, 33, 112, 20);
		panel_1_1_1.add(txtPreco4);
		
		JButton btnCadastrar4 = new JButton("Cadastrar");
		btnCadastrar4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prod4.setNome(txtNome1.getText());
				prod4.setPreco(Double.parseDouble(txtPreco4.getText()));
			}
		});
		btnCadastrar4.setBounds(378, 11, 99, 43);
		panel_1_1_1.add(btnCadastrar4);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBounds(10, 315, 477, 65);
		frame.getContentPane().add(panel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Produto 5:");
		lblNewLabel_1_1_1_1.setBounds(10, 11, 77, 14);
		panel_1_1_1_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNome_1_1_1_1 = new JLabel("Nome:");
		lblNome_1_1_1_1.setBounds(10, 36, 52, 14);
		panel_1_1_1_1.add(lblNome_1_1_1_1);
		
		txtNome5 = new JTextField();
		txtNome5.setColumns(10);
		txtNome5.setBounds(72, 33, 112, 20);
		panel_1_1_1_1.add(txtNome5);
		
		JLabel lblPreo_1_1_1_1 = new JLabel("Preço:  R$");
		lblPreo_1_1_1_1.setBounds(194, 36, 64, 14);
		panel_1_1_1_1.add(lblPreo_1_1_1_1);
		
		txtPreco5 = new JTextField();
		txtPreco5.setColumns(10);
		txtPreco5.setBounds(256, 33, 112, 20);
		panel_1_1_1_1.add(txtPreco5);
		
		JButton btnCadastrar5 = new JButton("Cadastrar");
		btnCadastrar5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prod5.setNome(txtNome1.getText());
				prod5.setPreco(Double.parseDouble(txtPreco5.getText()));
			}
		});
		btnCadastrar5.setBounds(378, 11, 99, 43);
		panel_1_1_1_1.add(btnCadastrar5);
		
		JButton btnAtualizarValores = new JButton("Atualizar Valores");
		btnAtualizarValores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prod1.aumentarPreco(prod1);
				prod2.aumentarPreco(prod2);
				prod3.aumentarPreco(prod3);
				prod4.aumentarPreco(prod4);
				prod5.aumentarPreco(prod5);
				txtPreco1.setText(Double.toString(prod1.getPreco()));
				txtPreco2.setText(Double.toString(prod2.getPreco()));
				txtPreco3.setText(Double.toString(prod3.getPreco()));
				txtPreco4.setText(Double.toString(prod4.getPreco()));
				txtPreco5.setText(Double.toString(prod5.getPreco()));
				JOptionPane.showMessageDialog(null, "Valores Atualizados!");
			}
		});
		btnAtualizarValores.setBounds(497, 11, 140, 65);
		frame.getContentPane().add(btnAtualizarValores);
		
		JButton btnLimparCampos = new JButton("Limpar Campos");
		btnLimparCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPreco1.setText(null);
				txtNome1.setText(null);
				txtPreco2.setText(null);
				txtNome2.setText(null);
				txtPreco3.setText(null);
				txtNome3.setText(null);
				txtPreco4.setText(null);
				txtNome4.setText(null);
				txtPreco5.setText(null);
				txtNome5.setText(null);
			}
		});
		btnLimparCampos.setBounds(497, 87, 140, 65);
		frame.getContentPane().add(btnLimparCampos);
	}
}
