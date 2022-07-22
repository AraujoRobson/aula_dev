package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;

import model.Aluno;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class ViewAluno {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtMedia;
	Aluno aluno = new Aluno();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAluno window = new ViewAluno();
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
	public ViewAluno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblNome.setForeground(Color.WHITE);
		lblNome.setBounds(10, 10, 39, 21);
		frame.getContentPane().add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setForeground(Color.WHITE);
		lblIdade.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblIdade.setBounds(10, 51, 39, 21);
		frame.getContentPane().add(lblIdade);
		
		JLabel lblMedia = new JLabel("M\u00E9dia:");
		lblMedia.setForeground(Color.WHITE);
		lblMedia.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblMedia.setBounds(208, 51, 39, 21);
		frame.getContentPane().add(lblMedia);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		txtNome.setBounds(59, 12, 301, 19);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		txtIdade.setColumns(10);
		txtIdade.setBounds(59, 53, 86, 19);
		frame.getContentPane().add(txtIdade);
		
		txtMedia = new JTextField();
		txtMedia.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		txtMedia.setColumns(10);
		txtMedia.setBounds(257, 53, 103, 19);
		frame.getContentPane().add(txtMedia);
		
		JPanel pnlSexo = new JPanel();
		pnlSexo.setBackground(Color.DARK_GRAY);
		pnlSexo.setBounds(59, 86, 182, 28);
		frame.getContentPane().add(pnlSexo);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setSelected(true);
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnMasculino.setSelected(false);
				rdbtnFeminino.setSelected(true);
			}
		});
		rdbtnMasculino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnFeminino.setSelected(false);
				rdbtnMasculino.setSelected(true);
			}
		});
		rdbtnMasculino.setBackground(Color.DARK_GRAY);
		rdbtnMasculino.setForeground(Color.WHITE);
		rdbtnMasculino.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		pnlSexo.add(rdbtnMasculino);
		
		
		rdbtnFeminino.setBackground(Color.DARK_GRAY);
		rdbtnFeminino.setForeground(Color.WHITE);
		rdbtnFeminino.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		pnlSexo.add(rdbtnFeminino);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(10, 96, 31, 18);
		frame.getContentPane().add(lblSexo);
		lblSexo.setForeground(Color.WHITE);
		lblSexo.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		frame.setBounds(1000, 500, 386, 201);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setMnemonic('r');
		btnSair.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnSair.setBounds(275, 130, 85, 21);
		frame.getContentPane().add(btnSair);
		
		JButton btnSalvar = new JButton("Salvar");
		if(rdbtnMasculino.isSelected() || rdbtnFeminino.isSelected()) {
			btnSalvar.setEnabled(true);
		}else {
			btnSalvar.setEnabled(false);
		}
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aluno.setNome(txtNome.getText());
				aluno.setIdade(Integer.parseInt(txtIdade.getText()));
				aluno.setMedia(Double.parseDouble(txtMedia.getText()));
				
				if(rdbtnMasculino.isSelected()) {
					aluno.setSexo('M');
				}else {
					aluno.setSexo('F');
				}
				
				JOptionPane.showMessageDialog(null,	"Aluno salvo com sucesso!\n"+aluno.toString());
			}
		});
		btnSalvar.setMnemonic('s');
		btnSalvar.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnSalvar.setBounds(10, 130, 85, 21);
		frame.getContentPane().add(btnSalvar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText(null);
				txtIdade.setText(null);
				txtMedia.setText(null);
				rdbtnMasculino.setSelected(false);
				rdbtnFeminino.setSelected(false);
			}
		});
		btnLimpar.setMnemonic('l');
		btnLimpar.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnLimpar.setBounds(145, 130, 85, 21);
		frame.getContentPane().add(btnLimpar);
		
		
	}
}
