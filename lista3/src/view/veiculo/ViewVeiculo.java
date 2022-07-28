package view.veiculo;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import exercicios.Veiculo;

public class ViewVeiculo {

	private JFrame frame;
	private JTextField txtModelo;
	private JTextField txtAno;
	private JTextField txtCor;
	private JTextField txtKm;
	private JTextField txtCorAtual;
	private JTextField txtNovaCor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewVeiculo window = new ViewVeiculo();
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
	public ViewVeiculo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 493, 379);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Veiculo veiculo = new Veiculo(null, 0, null, 0);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 456, 152);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dados do Veiculo:");
		lblNewLabel.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 394, 20);
		panel.add(lblNewLabel);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		lblModelo.setBounds(10, 41, 69, 20);
		panel.add(lblModelo);
		
		txtModelo = new JTextField();
		txtModelo.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		txtModelo.setBounds(89, 41, 146, 20);
		panel.add(txtModelo);
		txtModelo.setColumns(10);
		
		JLabel lblAno = new JLabel("Ano:");
		lblAno.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		lblAno.setBounds(309, 41, 42, 20);
		panel.add(lblAno);
		
		txtAno = new JTextField();
		txtAno.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		txtAno.setColumns(10);
		txtAno.setBounds(357, 41, 89, 20);
		panel.add(txtAno);
		
		JLabel lblCor = new JLabel("Cor:");
		lblCor.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		lblCor.setBounds(10, 74, 69, 20);
		panel.add(lblCor);
		
		txtCor = new JTextField();
		txtCor.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		txtCor.setColumns(10);
		txtCor.setBounds(89, 74, 146, 20);
		panel.add(txtCor);
		
		JLabel lblpnl1Km = new JLabel("KM:");
		lblpnl1Km.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		lblpnl1Km.setBounds(309, 74, 42, 20);
		panel.add(lblpnl1Km);
		
		txtKm = new JTextField();
		txtKm.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		txtKm.setColumns(10);
		txtKm.setBounds(357, 74, 89, 20);
		panel.add(txtKm);
				
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 174, 223, 152);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Alterar Cor:");
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 10, 121, 20);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblModelo_1 = new JLabel("Cor Atual:");
		lblModelo_1.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		lblModelo_1.setBounds(10, 41, 115, 20);
		panel_1.add(lblModelo_1);
		
		txtCorAtual = new JTextField();
		txtCorAtual.setBackground(Color.WHITE);
		txtCorAtual.setEditable(false);
		txtCorAtual.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		txtCorAtual.setColumns(10);
		txtCorAtual.setBounds(10, 60, 115, 20);
		panel_1.add(txtCorAtual);
		
		JButton btnNovaCor = new JButton("");
		btnNovaCor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				veiculo.setCor(txtNovaCor.getText());
				txtCorAtual.setText(veiculo.getCor());
				txtNovaCor.setText(null);
			}
		});
		btnNovaCor.setIcon(new ImageIcon(ViewVeiculo.class.getResource("/docs/icons8-spray-64.png")));
		btnNovaCor.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		btnNovaCor.setBounds(135, 60, 76, 70);
		panel_1.add(btnNovaCor);
		
		JLabel lblModelo_1_1 = new JLabel("Nova cor:");
		lblModelo_1_1.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		lblModelo_1_1.setBounds(10, 89, 115, 20);
		panel_1.add(lblModelo_1_1);
		
		txtNovaCor = new JTextField();
		txtNovaCor.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		txtNovaCor.setColumns(10);
		txtNovaCor.setBackground(Color.WHITE);
		txtNovaCor.setBounds(10, 110, 115, 20);
		panel_1.add(txtNovaCor);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(243, 174, 223, 77);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Revisao:");
		lblNewLabel_1_1.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 10, 76, 20);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblStatusRevisao = new JLabel("");
		lblStatusRevisao.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		lblStatusRevisao.setBounds(10, 40, 201, 20);
		panel_1_1.add(lblStatusRevisao);
		
		JLabel lblKm = new JLabel("");
		lblKm.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		lblKm.setBounds(82, 10, 129, 20);
		panel_1_1.add(lblKm);
		
		JButton btnLimpar = new JButton("Limpar Dados");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblKm.setText(null);
				lblStatusRevisao.setText(null);
				txtModelo.setText(null);
				txtAno.setText(null);
				txtCor.setText(null);
				txtKm.setText(null);
				txtCorAtual.setText(null);
				txtNovaCor.setText(null);
			}
		});
		btnLimpar.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		btnLimpar.setBounds(243, 262, 223, 64);
		frame.getContentPane().add(btnLimpar);

		JButton btnRegistrar = new JButton("Registrar Veiculo");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				veiculo.setKm(Double.parseDouble(txtKm.getText()));
				veiculo.setAno(Integer.parseInt(txtAno.getText()));
				veiculo.setModelo(txtModelo.getText());
				veiculo.setCor(txtCor.getText());
				
				lblKm.setText(String.format("%.1f KM", veiculo.getKm()));
				lblStatusRevisao.setText(veiculo.verificarManutencao());
				txtCorAtual.setText(txtCor.getText());
			}
		});
		btnRegistrar.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		btnRegistrar.setBounds(140, 118, 174, 23);
		panel.add(btnRegistrar);
	}
}
