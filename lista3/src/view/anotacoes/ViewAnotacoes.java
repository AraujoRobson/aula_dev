package view.anotacoes;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import exercicios.CadernoAnotacoes;

public class ViewAnotacoes {

	private JFrame frame;
	private JTextField txtNovaAnotacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAnotacoes window = new ViewAnotacoes();
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
	public ViewAnotacoes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 363, 297);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		CadernoAnotacoes anotacoes = new CadernoAnotacoes();
		
		JTextPane txtAnotacoes = new JTextPane();
		txtAnotacoes.setBounds(10, 164, 324, 81);
		frame.getContentPane().add(txtAnotacoes);
		
		JLabel lblNewLabel = new JLabel("Anotações");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 139, 324, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 147, 117);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nova anotação:");
		lblNewLabel_1.setBounds(10, 11, 90, 14);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		txtNovaAnotacao = new JTextField();
		txtNovaAnotacao.setBounds(10, 32, 124, 20);
		panel.add(txtNovaAnotacao);
		txtNovaAnotacao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNovaAnotacao.setColumns(10);
		
		JButton btnIncluirAnotacao = new JButton("Incluir anotação");
		btnIncluirAnotacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				anotacoes.adicionarAnotacao(txtNovaAnotacao.getText());
				txtNovaAnotacao.setText(null);
			}
		});
		btnIncluirAnotacao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnIncluirAnotacao.setBounds(10, 60, 124, 38);
		panel.add(btnIncluirAnotacao);
		
		JButton btnVisualizarAnotacoes = new JButton("Visualizar Anotações");
		btnVisualizarAnotacoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAnotacoes.setText(anotacoes.visualizarAnotacoes());
			}
		});
		btnVisualizarAnotacoes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnVisualizarAnotacoes.setBounds(167, 23, 167, 38);
		frame.getContentPane().add(btnVisualizarAnotacoes);
		
		JButton btnApagarAnotacoes = new JButton("Apagar Anotações");
		btnApagarAnotacoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				anotacoes.apagarAnotacoes();
				JOptionPane.showMessageDialog(null, "Você apagou todas as anotações");
				txtAnotacoes.setText(null);
				txtNovaAnotacao.setText(null);
			}
		});
		btnApagarAnotacoes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnApagarAnotacoes.setBounds(167, 72, 167, 38);
		frame.getContentPane().add(btnApagarAnotacoes);
	}
}
