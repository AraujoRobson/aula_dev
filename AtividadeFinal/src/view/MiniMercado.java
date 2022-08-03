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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import model.Estoque;
import model.Produto;
import model.Venda;

import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.AbstractListModel;
import javax.swing.JRadioButton;

public class MiniMercado {

	private JFrame frmMinimercado;
	private JTextField txtCadastroDescricao;
	private JTextField txtCadastroPreco;
	private JTextField txtCadastroQtdEstoque;
	private JTextField txtCarrinhoQtd;
	private Estoque estoque;
	private Venda venda;
	private Produto produto;

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
		venda = new Venda();
		produto = new Produto();
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
		
		JComboBox cboEstoque = new JComboBox();
		cboEstoque.setFont(new Font("Source Code Pro", Font.PLAIN, 12));
		cboEstoque.setBounds(22, 30, 217, 28);
		pnlVenda.add(cboEstoque);
		
		txtCarrinhoQtd = new JTextField();
		txtCarrinhoQtd.setBounds(249, 30, 57, 28);
		pnlVenda.add(txtCarrinhoQtd);
		txtCarrinhoQtd.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Produto");
		lblNewLabel_1.setFont(new Font("Source Code Pro", Font.PLAIN, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(22, 11, 204, 14);
		pnlVenda.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Quantidade");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Source Code Pro", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(236, 11, 86, 14);
		pnlVenda.add(lblNewLabel_1_1);
		
		JTextPane txtCarrinhodeCompra = new JTextPane();
		txtCarrinhodeCompra.setEditable(false);
		txtCarrinhodeCompra.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtCarrinhodeCompra.setBounds(22, 95, 335, 404);
		pnlVenda.add(txtCarrinhodeCompra);
		
		JLabel lblNewLabel_1_2 = new JLabel("Carrinho de Compras");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(22, 71, 335, 14);
		pnlVenda.add(lblNewLabel_1_2);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Concluir Venda", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 198, 109);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("Metodo de Pagamento");
		lblNewLabel_1_3.setBounds(10, 5, 178, 16);
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		panel_1.add(lblNewLabel_1_3);
		
		JRadioButton rdbtnDinheiro = new JRadioButton("Dinheiro");
		rdbtnDinheiro.setFont(new Font("Dialog", Font.PLAIN, 12));
		rdbtnDinheiro.setBounds(20, 27, 83, 21);
		panel_1.add(rdbtnDinheiro);
		
		JRadioButton rdbtnPix = new JRadioButton("Pix");
		rdbtnPix.setFont(new Font("Dialog", Font.PLAIN, 12));
		rdbtnPix.setBounds(20, 50, 83, 21);
		panel_1.add(rdbtnPix);
		
		JRadioButton rdbtnDinheiro_1_1 = new JRadioButton("Cartao");
		rdbtnDinheiro_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		rdbtnDinheiro_1_1.setBounds(20, 73, 83, 21);
		panel_1.add(rdbtnDinheiro_1_1);
		
		JLabel lblQtdEstoque_1 = new JLabel("Lista Estoque");
		lblQtdEstoque_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblQtdEstoque_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblQtdEstoque_1.setBounds(26, 192, 98, 28);
		pnlAddEstoque.add(lblQtdEstoque_1);
		
		JTextPane txtListaEstoque = new JTextPane();
		txtListaEstoque.setEditable(false);
		txtListaEstoque.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtListaEstoque.setBounds(36, 229, 313, 264);
		pnlAddEstoque.add(txtListaEstoque);
		
		JButton btnCadastroNovoItem = new JButton("+ Cadastrar item");
		btnCadastroNovoItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double vlr = Double.parseDouble(txtCadastroPreco.getText()); 
				int qtd = Integer.parseInt(txtCadastroQtdEstoque.getText());
				
				produto = new Produto(txtCadastroDescricao.getText(), vlr, qtd);
				
				estoque.incluirItem(produto);
				txtListaEstoque.setText(estoque.visualizarEstoque());
				txtCadastroDescricao.setText(null);
				txtCadastroPreco.setText(null);
				txtCadastroQtdEstoque.setText(null);
				cboEstoque.setModel(new DefaultComboBoxModel(estoque.nomes()));
			}
		});
		btnCadastroNovoItem.setFont(new Font("Source Code Pro", Font.PLAIN, 12));
		btnCadastroNovoItem.setBounds(134, 131, 171, 38);
		pnlAddEstoque.add(btnCadastroNovoItem);
		
		JButton btnApagarEstoque = new JButton("Apagar Estoque");
		btnApagarEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtListaEstoque.setText("");
				estoque.apagar();
				cboEstoque.setModel(new DefaultComboBoxModel(new String[] {}));
			}
		});
		btnApagarEstoque.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnApagarEstoque.setBounds(36, 501, 313, 38);
		pnlAddEstoque.add(btnApagarEstoque);

		JButton btnCarrinhoAdicionar = new JButton("+");
		btnCarrinhoAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(txtCarrinhoQtd.getText()) < 21 && venda.limitarCarrinho()) {
					venda.addItemVenda(estoque.produto(cboEstoque.getSelectedIndex()), Integer.parseInt(txtCarrinhoQtd.getText()));
					txtCarrinhodeCompra.setText(venda.visualizarVenda());
				}else {
					JOptionPane.showMessageDialog(null, "Quantidade maxima por carrinho é 20.");
				}
			}
		});
		btnCarrinhoAdicionar.setFont(new Font("Arial Black", Font.BOLD, 13));
		btnCarrinhoAdicionar.setBounds(312, 28, 45, 33);
		pnlVenda.add(btnCarrinhoAdicionar);

		JButton btnEsvaziarCarrinho = new JButton("Esvaziar Carrinho");
		btnEsvaziarCarrinho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCarrinhodeCompra.setText(null);
				txtCarrinhoQtd.setText(null);
				venda.apagaLista();
			}
		});
		btnEsvaziarCarrinho.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnEsvaziarCarrinho.setBounds(22, 523, 335, 33);
		pnlVenda.add(btnEsvaziarCarrinho);
	}
}
