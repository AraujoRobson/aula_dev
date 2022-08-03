package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import model.Estoque;
import model.Produto;
import javax.swing.DefaultComboBoxModel;

public class MiniMercado {

	private JFrame frmMinimercado;
	private JTextField txtCadastroDescricao;
	private JTextField txtCadastroPreco;
	private JTextField txtCadastroQtdEstoque;
	private JTextField txtCarrinhoQtd;
	//private Produto estoque;
	private Estoque estoque;

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
		estoque = new Estoque();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMinimercado = new JFrame();
		frmMinimercado.setTitle("MiniMercado");
		frmMinimercado.setResizable(false);
		frmMinimercado.setBounds(100, 100, 426, 651);
		frmMinimercado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMinimercado.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 390, 593);
		frmMinimercado.getContentPane().add(tabbedPane);
		
		JPanel pnlAddEstoque = new JPanel();
		tabbedPane.addTab("Cadastro Produtos", null, pnlAddEstoque, null);
		pnlAddEstoque.setLayout(null);
		
		txtCadastroDescricao = new JTextField();
		txtCadastroDescricao.setFont(new Font("Source Code Pro", Font.PLAIN, 12));
		txtCadastroDescricao.setBounds(134, 12, 171, 28);
		pnlAddEstoque.add(txtCadastroDescricao);
		txtCadastroDescricao.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Descricao:");
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
		
		JPanel pnlVenda = new JPanel();
		tabbedPane.addTab("Carrinho de Compra", null, pnlVenda, null);
		pnlVenda.setLayout(null);
		
		JComboBox cmbEstoque = new JComboBox();
		cmbEstoque.setFont(new Font("Source Code Pro", Font.PLAIN, 12));
		cmbEstoque.setBounds(22, 30, 188, 28);
		pnlVenda.add(cmbEstoque);
		
		txtCarrinhoQtd = new JTextField();
		txtCarrinhoQtd.setBounds(220, 30, 86, 28);
		pnlVenda.add(txtCarrinhoQtd);
		txtCarrinhoQtd.setColumns(10);
		
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
		
		JButton btnCarrinhoAdicionar = new JButton("+");
		btnCarrinhoAdicionar.setFont(new Font("Arial Black", Font.BOLD, 13));
		btnCarrinhoAdicionar.setBounds(312, 28, 45, 33);
		pnlVenda.add(btnCarrinhoAdicionar);
		
		JTextPane txtListaEstoque_1 = new JTextPane();
		txtListaEstoque_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtListaEstoque_1.setBounds(22, 95, 335, 404);
		pnlVenda.add(txtListaEstoque_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Carrinho de Compras");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(22, 71, 335, 14);
		pnlVenda.add(lblNewLabel_1_2);
		
		JButton btnEsvaziarCarrinho = new JButton("Esvaziar Carrinho");
		btnEsvaziarCarrinho.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnEsvaziarCarrinho.setBounds(22, 523, 335, 33);
		pnlVenda.add(btnEsvaziarCarrinho);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Concluir Venda", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblQtdEstoque_1 = new JLabel("Lista Estoque");
		lblQtdEstoque_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblQtdEstoque_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblQtdEstoque_1.setBounds(26, 192, 98, 28);
		pnlAddEstoque.add(lblQtdEstoque_1);
		
		JTextPane txtListaEstoque = new JTextPane();
		txtListaEstoque.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtListaEstoque.setBounds(36, 229, 313, 264);
		pnlAddEstoque.add(txtListaEstoque);
		
		JButton btnCadastroNovoItem = new JButton("+ Cadastrar item");
		btnCadastroNovoItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double vlr = Double.parseDouble(txtCadastroPreco.getText()); 
				int qtd = Integer.parseInt(txtCadastroQtdEstoque.getText());
				
				Produto itens = new Produto(txtCadastroDescricao.getText(), vlr, qtd);
				
				estoque.incluirItem(itens);
				txtListaEstoque.setText(estoque.visualizarEstoque());
				txtCadastroDescricao.setText(null);
				txtCadastroPreco.setText(null);
				txtCadastroQtdEstoque.setText(null);
				cmbEstoque.setModel(new DefaultComboBoxModel(estoque.nomes()));
			}
		});
		btnCadastroNovoItem.setFont(new Font("Source Code Pro", Font.PLAIN, 12));
		btnCadastroNovoItem.setBounds(134, 131, 171, 38);
		pnlAddEstoque.add(btnCadastroNovoItem);
		
		JButton btnApagarEstoque = new JButton("Apagar Estoque");
		btnApagarEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtListaEstoque.setText("");
			}
		});
		btnApagarEstoque.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnApagarEstoque.setBounds(36, 501, 313, 38);
		pnlAddEstoque.add(btnApagarEstoque);
		
		
	}
}
