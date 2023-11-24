package tela.cadastro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtv1;
	private JTextField txtv2;
	private JTextField txtv4;
	private JTextField txtv5;
	private JTextField txtv6;
	private JTextField txtv7;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(10, 47, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtv1 = new JTextField();
		txtv1.setBounds(112, 44, 235, 20);
		contentPane.add(txtv1);
		txtv1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setBounds(10, 72, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtv2 = new JTextField();
		txtv2.setBounds(112, 69, 235, 20);
		contentPane.add(txtv2);
		txtv2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Sexo");
		lblNewLabel_2.setBounds(10, 97, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setBounds(10, 122, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtv4 = new JTextField();
		txtv4.setBounds(112, 119, 235, 20);
		contentPane.add(txtv4);
		txtv4.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Telefone");
		lblNewLabel_4.setBounds(10, 147, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cpf");
		lblNewLabel_5.setBounds(10, 172, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		txtv5 = new JTextField();
		txtv5.setBounds(112, 144, 235, 20);
		contentPane.add(txtv5);
		txtv5.setColumns(10);
		
		txtv6 = new JTextField();
		txtv6.setBounds(112, 169, 235, 20);
		contentPane.add(txtv6);
		txtv6.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Data de nascimento");
		lblNewLabel_6.setBounds(10, 197, 95, 14);
		contentPane.add(lblNewLabel_6);
		
		txtv7 = new JTextField();
		txtv7.setBounds(112, 194, 235, 20);
		contentPane.add(txtv7);
		txtv7.setColumns(10);
		
		JLabel labelResp = new JLabel("");
		labelResp.setBounds(392, 47, 232, 14);
		contentPane.add(labelResp);
		
		JLabel labelResp2 = new JLabel("");
		labelResp2.setBounds(392, 72, 232, 14);
		contentPane.add(labelResp2);
		
		JLabel labelResp3 = new JLabel("");
		labelResp3.setBounds(392, 97, 232, 14);
		contentPane.add(labelResp3);
		
		JLabel labelResp4 = new JLabel("");
		labelResp4.setBounds(392, 122, 232, 14);
		contentPane.add(labelResp4);
		
		JLabel labelResp5 = new JLabel("");
		labelResp5.setBounds(392, 147, 232, 14);
		contentPane.add(labelResp5);
		
		JLabel labelResp6 = new JLabel("");
		labelResp6.setBounds(392, 172, 232, 14);
		contentPane.add(labelResp6);
		
		JLabel labelResp7 = new JLabel("");
		labelResp7.setBounds(392, 197, 232, 14);
		contentPane.add(labelResp7);
	
		JRadioButton Masc = new JRadioButton("Masculino");
		buttonGroup.add(Masc);
		Masc.setBounds(107, 93, 76, 23);
		contentPane.add(Masc);
		
		JRadioButton Fem = new JRadioButton("Feminino");
		buttonGroup.add(Fem);
		Fem.setBounds(180, 93, 67, 23);
		contentPane.add(Fem);
		
		
		JButton btnCompleteSeuCadastro = new JButton("Complete seu cadastro");
		btnCompleteSeuCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtv1.getText();
				Double idade = Double.parseDouble(txtv2.getText());
				String email = txtv4.getText();
				Double telefone = Double.parseDouble(txtv5.getText());
				Double CPF = Double.parseDouble(txtv6.getText());
				String Data = txtv7.getText();
				labelResp.setText( "Seu nome é: " + nome);
				labelResp2.setText( "Sua idade é: " + idade);
				if(Masc.isSelected()) {
					labelResp3.setText("Sexo: Masculino");
				}
				else if(Fem.isSelected()) {
					labelResp3.setText("Sexo: Femino");
				}
				labelResp4.setText( "Email: " + email + "@gmail.com");
				labelResp5.setText( "Numero de telefone:" + telefone);
				labelResp6.setText( "Seu CPF:" + CPF);
				labelResp7.setText( "Data de nascimento:" + Data);
			}
		});
		btnCompleteSeuCadastro.setBounds(142, 225, 173, 23);
		contentPane.add(btnCompleteSeuCadastro);
		
		JLabel lblNewLabel_7 = new JLabel("CRIE SUA CONTA");
		lblNewLabel_7.setBackground(new Color(255, 0, 0));
		lblNewLabel_7.setForeground(new Color(0, 0, 0));
		lblNewLabel_7.setBounds(180, 11, 143, 14);
		contentPane.add(lblNewLabel_7);
		
		
		
		
		;
		
	
	}
}
