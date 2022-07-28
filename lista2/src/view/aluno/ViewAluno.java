package view.aluno;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import exercicios.Aluno;

public class ViewAluno {

	private JFrame frmAlunoAprovaao;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAluno window = new ViewAluno();
					window.frmAlunoAprovaao.setVisible(true);
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
		frmAlunoAprovaao = new JFrame();
		frmAlunoAprovaao.setIconImage(Toolkit.getDefaultToolkit().getImage(ViewAluno.class.getResource("/imgs/icons8-student-registration-100.png")));
		frmAlunoAprovaao.setResizable(false);
		frmAlunoAprovaao.getContentPane().setForeground(Color.LIGHT_GRAY);
		frmAlunoAprovaao.setForeground(Color.DARK_GRAY);
		frmAlunoAprovaao.setTitle("Aluno");
		frmAlunoAprovaao.setBounds(100, 100, 450, 290);
		frmAlunoAprovaao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAlunoAprovaao.getContentPane().setLayout(null);
		
		JPanel pnlInfoAluno = new JPanel();
		pnlInfoAluno.setBackground(Color.LIGHT_GRAY);
		pnlInfoAluno.setForeground(Color.LIGHT_GRAY);
		pnlInfoAluno.setBounds(10, 10, 414, 70);
		frmAlunoAprovaao.getContentPane().add(pnlInfoAluno);
		pnlInfoAluno.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informações Aluno:");
		lblNewLabel.setFont(new Font("Monospaced", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 394, 21);
		pnlInfoAluno.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Monospaced", Font.PLAIN, 15));
		lblNome.setBounds(10, 32, 61, 21);
		pnlInfoAluno.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtNome.setBounds(72, 34, 168, 20);
		pnlInfoAluno.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdade.setFont(new Font("Monospaced", Font.PLAIN, 15));
		lblIdade.setBounds(262, 31, 71, 21);
		pnlInfoAluno.add(lblIdade);
		
		txtIdade = new JTextField();
		txtIdade.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtIdade.setColumns(10);
		txtIdade.setBounds(343, 34, 61, 20);
		pnlInfoAluno.add(txtIdade);
		
		JPanel pnlNotas = new JPanel();
		pnlNotas.setBackground(Color.LIGHT_GRAY);
		pnlNotas.setLayout(null);
		pnlNotas.setForeground(new Color(64, 64, 64));
		pnlNotas.setBounds(10, 90, 414, 70);
		frmAlunoAprovaao.getContentPane().add(pnlNotas);
		
		JLabel lblNotasDoAluno = new JLabel("Notas:");
		lblNotasDoAluno.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotasDoAluno.setFont(new Font("Monospaced", Font.PLAIN, 15));
		lblNotasDoAluno.setBounds(10, 0, 394, 21);
		pnlNotas.add(lblNotasDoAluno);
		
		JLabel lblNota = new JLabel("Nota 1:");
		lblNota.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNota.setBounds(10, 32, 61, 21);
		pnlNotas.add(lblNota);
		
		txtNota1 = new JTextField();
		txtNota1.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtNota1.setColumns(10);
		txtNota1.setBounds(70, 32, 61, 20);
		pnlNotas.add(txtNota1);
		
		JLabel lblNota_2 = new JLabel("Nota 2:");
		lblNota_2.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNota_2.setBounds(142, 32, 61, 21);
		pnlNotas.add(lblNota_2);
		
		txtNota2 = new JTextField();
		txtNota2.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtNota2.setColumns(10);
		txtNota2.setBounds(202, 32, 61, 20);
		pnlNotas.add(txtNota2);
		
		JLabel lblNota_1_1 = new JLabel("Nota 3:");
		lblNota_1_1.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNota_1_1.setBounds(283, 32, 61, 21);
		pnlNotas.add(lblNota_1_1);
		
		txtNota3 = new JTextField();
		txtNota3.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtNota3.setColumns(10);
		txtNota3.setBounds(343, 32, 61, 20);
		pnlNotas.add(txtNota3);
		
		JPanel pnlStatus = new JPanel();
		pnlStatus.setLayout(null);
		pnlStatus.setForeground(Color.DARK_GRAY);
		pnlStatus.setBackground(Color.LIGHT_GRAY);
		pnlStatus.setBounds(216, 170, 208, 70);
		frmAlunoAprovaao.getContentPane().add(pnlStatus);
		
		JLabel lblNota_1_1_1 = new JLabel("Status:");
		lblNota_1_1_1.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNota_1_1_1.setBounds(10, 32, 61, 21);
		pnlStatus.add(lblNota_1_1_1);
		
		txtStatus = new JTextField();
		txtStatus.setBackground(Color.WHITE);
		txtStatus.setEditable(false);
		txtStatus.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtStatus.setColumns(10);
		txtStatus.setBounds(71, 30, 127, 27);
		pnlStatus.add(txtStatus);
		
		JLabel lblMedia = new JLabel("");
		lblMedia.setFont(new Font("Monospaced", Font.PLAIN, 15));
		lblMedia.setBounds(10, 7, 188, 21);
		pnlStatus.add(lblMedia);
		
		JPanel pnlBotoes = new JPanel();
		pnlBotoes.setLayout(null);
		pnlBotoes.setForeground(Color.DARK_GRAY);
		pnlBotoes.setBackground(Color.LIGHT_GRAY);
		pnlBotoes.setBounds(10, 170, 196, 70);
		frmAlunoAprovaao.getContentPane().add(pnlBotoes);
		
		JButton btnLimparCampos = new JButton("");
		btnLimparCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText(null);
				txtIdade.setText(null);
				txtNota1.setText(null);
				txtNota2.setText(null);
				txtNota3.setText(null);
				txtStatus.setText(null);
				lblMedia.setText(null);
				frmAlunoAprovaao.setTitle("Aluno");
			}
		});
		btnLimparCampos.setIcon(new ImageIcon(ViewAluno.class.getResource("/imgs/broom-win1-color.png")));
		btnLimparCampos.setBounds(10, 5, 80, 60);
		pnlBotoes.add(btnLimparCampos);
		
		JButton btnExecutarVerificar = new JButton("");
		btnExecutarVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idade = Integer.parseInt(txtIdade.getText());
				double n1 = Double.parseDouble(txtNota1.getText());
				double n2 = Double.parseDouble(txtNota2.getText());
				double n3 = Double.parseDouble(txtNota3.getText());
				
				Aluno aluno = new Aluno(txtNome.getText(), idade);
				
				lblMedia.setText(aluno.calcularMedia(n1, n2, n3));
				txtStatus.setText(aluno.verificarAprovacao());
				frmAlunoAprovaao.setTitle(String.format("Aluno | %s", txtNome.getText()));
			}
		});
		btnExecutarVerificar.setIcon(new ImageIcon(ViewAluno.class.getResource("/imgs/icons8-evaluate-64.png")));
		btnExecutarVerificar.setBounds(106, 5, 80, 60);
		pnlBotoes.add(btnExecutarVerificar);
	}
}
