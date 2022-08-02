package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JList;

public class MiniMercado {

	private JFrame frmMinimercado;
	private JTextField txtCadastroDescricao;
	private JTextField txtCadastroPreco;
	private JTextField txtCadastroQtdEstoque;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniMercado window = new MiniMercado();
					window.frmMinimercado.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MiniMercado() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMinimercado = new JFrame();
		frmMinimercado.setTitle("MiniMercado");
		frmMinimercado.setResizable(false);
		frmMinimercado.setBounds(100, 100, 426, 586);
		frmMinimercado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMinimercado.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 390, 530);
		frmMinimercado.getContentPane().add(tabbedPane);
		
		JPanel pnlAddEstoque = new JPanel();
		tabbedPane.addTab("Cadastro Produtos", null, pnlAddEstoque, null);
		pnlAddEstoque.setLayout(null);
		
		txtCadastroDescricao = new JTextField();
		txtCadastroDescricao.setFont(new Font("Source Code Pro", Font.PLAIN, 12));
		txtCadastroDescricao.setBounds(134, 12, 171, 28);
		pnlAddEstoque.add(txtCadastroDescricao);
		txtCadastroDescricao.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Descrição:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Source Code Pro", Font.PLAIN, 12));
		lblNewLabel.setBounds(26, 11, 98, 28);
		pnlAddEstoque.add(lblNewLabel);
		
		txtCadastroPreco = new JTextField();
		txtCadastroPreco.setFont(new Font("Source Code Pro", Font.PLAIN, 12));
		txtCadastroPreco.setColumns(10);
		txtCadastroPreco.setBounds(134, 52, 171, 28);
		pnlAddEstoque.add(txtCadastroPreco);
		
		JLabel lblValorR = new JLabel("Valor: R$");
		lblValorR.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorR.setFont(new Font("Source Code Pro", Font.PLAIN, 12));
		lblValorR.setBounds(26, 51, 98, 28);
		pnlAddEstoque.add(lblValorR);
		
		JLabel lblQtdEstoque = new JLabel("Qtd Estoque:");
		lblQtdEstoque.setHorizontalAlignment(SwingConstants.CENTER);
		lblQtdEstoque.setFont(new Font("Source Code Pro", Font.PLAIN, 12));
		lblQtdEstoque.setBounds(26, 91, 98, 28);
		pnlAddEstoque.add(lblQtdEstoque);
		
		txtCadastroQtdEstoque = new JTextField();
		txtCadastroQtdEstoque.setFont(new Font("Source Code Pro", Font.PLAIN, 12));
		txtCadastroQtdEstoque.setColumns(10);
		txtCadastroQtdEstoque.setBounds(134, 92, 171, 28);
		pnlAddEstoque.add(txtCadastroQtdEstoque);
		
		JButton btnCadastroNovoItem = new JButton("+ Cadastrar item");
		btnCadastroNovoItem.setFont(new Font("Source Code Pro", Font.PLAIN, 12));
		btnCadastroNovoItem.setBounds(134, 131, 171, 38);
		pnlAddEstoque.add(btnCadastroNovoItem);
		
		JPanel pnlVenda = new JPanel();
		tabbedPane.addTab("Carrinho de Compra", null, pnlVenda, null);
		pnlVenda.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Source Code Pro", Font.PLAIN, 12));
		comboBox.setBounds(22, 30, 188, 28);
		pnlVenda.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(220, 30, 86, 28);
		pnlVenda.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Produto");
		lblNewLabel_1.setFont(new Font("Source Code Pro", Font.PLAIN, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(22, 11, 188, 14);
		pnlVenda.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Quantidade");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Source Code Pro", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(220, 11, 86, 14);
		pnlVenda.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 13));
		btnNewButton.setBounds(312, 28, 45, 33);
		pnlVenda.add(btnNewButton);
		
		JList listValor = new JList();
		listValor.setBounds(220, 79, 137, 412);
		pnlVenda.add(listValor);
		
		JList listDescricao = new JList();
		listDescricao.setBounds(22, 79, 188, 412);
		pnlVenda.add(listDescricao);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Concluir Venda", null, panel, null);
		panel.setLayout(null);
	}
}
