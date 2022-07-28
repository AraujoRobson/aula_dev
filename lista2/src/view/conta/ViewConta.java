package view.conta;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import exercicios.Conta;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewConta {

	private JFrame frmConta;
	private JTextField txtNumConta;
	private JTextField txtNomeTitular;
	private JTextField txtTipoConta;
	private JTextField txtValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewConta window = new ViewConta();
					window.frmConta.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewConta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConta = new JFrame();
		frmConta.setIconImage(Toolkit.getDefaultToolkit().getImage(ViewConta.class.getResource("/imgs/icons8-cash-48.png")));
		frmConta.setTitle("Conta");
		frmConta.setResizable(false);
		frmConta.getContentPane().setBackground(Color.DARK_GRAY);
		frmConta.setForeground(Color.DARK_GRAY);
		frmConta.setBackground(Color.WHITE);
		frmConta.setBounds(100, 100, 686, 451);
		frmConta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConta.getContentPane().setLayout(null);
		Conta conta = new Conta(0, null, null);
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 284, 211);
		frmConta.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero da conta:");
		lblNewLabel.setFont(new Font("Reem Kufi", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 115, 14);
		panel.add(lblNewLabel);
		
		txtNumConta = new JTextField();
		txtNumConta.setFont(new Font("Reem Kufi", Font.PLAIN, 15));
		txtNumConta.setBounds(10, 28, 261, 27);
		panel.add(txtNumConta);
		txtNumConta.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome do Titular:");
		lblNewLabel_1.setFont(new Font("Reem Kufi", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 57, 115, 27);
		panel.add(lblNewLabel_1);
		
		txtNomeTitular = new JTextField();
		txtNomeTitular.setFont(new Font("Reem Kufi", Font.PLAIN, 15));
		txtNomeTitular.setColumns(10);
		txtNomeTitular.setBounds(10, 80, 261, 27);
		panel.add(txtNomeTitular);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tipo da Conta:");
		lblNewLabel_1_1.setFont(new Font("Reem Kufi", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 108, 105, 27);
		panel.add(lblNewLabel_1_1);
		
		txtTipoConta = new JTextField();
		txtTipoConta.setFont(new Font("Reem Kufi", Font.PLAIN, 15));
		txtTipoConta.setColumns(10);
		txtTipoConta.setBounds(10, 132, 261, 27);
		panel.add(txtTipoConta);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(304, 10, 355, 391);
		frmConta.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		JLabel lblInformaesDaConta = new JLabel("INFORMAÇÕES DA CONTA");
		lblInformaesDaConta.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformaesDaConta.setFont(new Font("Reem Kufi", Font.PLAIN, 13));
		lblInformaesDaConta.setBounds(10, 11, 335, 14);
		panel_1.add(lblInformaesDaConta);
		
		JLabel lblInfoConta = new JLabel("");
		lblInfoConta.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfoConta.setFont(new Font("Reem Kufi", Font.PLAIN, 20));
		lblInfoConta.setBounds(10, 36, 335, 344);
		panel_1.add(lblInfoConta);
				
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(10, 231, 284, 171);
		frmConta.getContentPane().add(panel_2);
		
		txtValor = new JTextField();
		txtValor.setFont(new Font("Reem Kufi", Font.PLAIN, 13));
		txtValor.setColumns(10);
		txtValor.setBounds(69, 32, 146, 27);
		panel_2.add(txtValor);
				
		JLabel lblNewLabel_1_1_1 = new JLabel("Depositar");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Reem Kufi", Font.PLAIN, 13));
		lblNewLabel_1_1_1.setBounds(10, 78, 115, 14);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("R$");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Reem Kufi", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(20, 32, 59, 27);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Sacar");
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2.setFont(new Font("Reem Kufi", Font.PLAIN, 13));
		lblNewLabel_1_1_1_2.setBounds(156, 79, 115, 14);
		panel_2.add(lblNewLabel_1_1_1_2);
		
		JButton btnSacar = new JButton("");
		btnSacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valor = Double.parseDouble(txtValor.getText());
				conta.sacar(valor);
				lblInfoConta.setText(conta.verificarSaldo());
				if(conta.getSaldo()>= valor) {
					txtValor.setText(null);
				}
			}
		});
		btnSacar.setEnabled(false);
		btnSacar.setIcon(new ImageIcon(ViewConta.class.getResource("/imgs/icons8-cash-64.png")));
		btnSacar.setFont(new Font("Reem Kufi", Font.PLAIN, 13));
		btnSacar.setBounds(168, 94, 91, 66);
		panel_2.add(btnSacar);
		
		JButton btnDepositar = new JButton("");
		btnDepositar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valor = Double.parseDouble(txtValor.getText());
				conta.depositar(valor);
				lblInfoConta.setText(conta.verificarSaldo());
				txtValor.setText(null);
			}
		});
		btnDepositar.setEnabled(false);
		btnDepositar.setIcon(new ImageIcon(ViewConta.class.getResource("/imgs/icons8-cash-in-64.png")));
		btnDepositar.setFont(new Font("Reem Kufi", Font.PLAIN, 13));
		btnDepositar.setBounds(22, 94, 91, 66);
		panel_2.add(btnDepositar);
		
		JButton btnRegistrar = new JButton("Registrar!");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conta.setTitularConta(txtNomeTitular.getText());
				conta.setTipoConta(txtTipoConta.getText());
				conta.setNumeroConta(Integer.parseInt(txtNumConta.getText()));
				
				lblInfoConta.setText(conta.verificarSaldo());
				btnDepositar.setEnabled(true);
				btnSacar.setEnabled(true);
			}
		});
		btnRegistrar.setFont(new Font("Reem Kufi", Font.PLAIN, 13));
		btnRegistrar.setBounds(125, 171, 146, 29);
		panel.add(btnRegistrar);

		JButton btnLimpar = new JButton("");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNomeTitular.setText("");
				txtNumConta.setText("");
				txtTipoConta.setText("");
				lblInfoConta.setText("");
				btnDepositar.setEnabled(false);
				btnSacar.setEnabled(false);
				txtValor.setText("");
			}
		});
		btnLimpar.setIcon(new ImageIcon(ViewConta.class.getResource("/imgs/broom-win1-color.png")));
		btnLimpar.setFont(new Font("Reem Kufi", Font.PLAIN, 13));
		btnLimpar.setBounds(254, 333, 91, 47);
		panel_1.add(btnLimpar);

	}
}
