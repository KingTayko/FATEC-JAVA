package restaurante;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaAdmin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField Email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAdmin frame = new TelaAdmin();
					frame.setLocationRelativeTo(null);
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
	public TelaAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(22, 10, 626, 66);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Label label = new Label("Login");
		label.setFont(new Font("Dubai", Font.ITALIC, 19));
		label.setBounds(276, 23, 62, 22);
		panel.add(label);
		
		Label label_1 = new Label("Email:");
		label_1.setFont(new Font("Dubai", Font.ITALIC, 15));
		label_1.setBounds(10, 168, 56, 34);
		contentPane.add(label_1);
		
		Button button = new Button("Voltar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* Voltar para 1 janela */
				TelaRestaurante T1 = new TelaRestaurante();
				T1.setVisible(true);
				dispose();
				
			}
		});
		button.setBounds(112, 391, 115, 40);
		contentPane.add(button);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(77, 269, 571, 34);
		contentPane.add(passwordField);
		
		Email = new JTextField();
		Email.setBounds(77, 168, 571, 34);
		contentPane.add(Email);
		Email.setColumns(10);
		
		Label label_1_1 = new Label("Senha:");
		label_1_1.setFont(new Font("Dubai", Font.ITALIC, 15));
		label_1_1.setBounds(10, 269, 56, 34);
		contentPane.add(label_1_1);
		
		Button button_1 = new Button("Enviar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* Verificação de login*/
				if(Email.getText().equals("Admin@gmail.com") && passwordField.getText().equals("12345")) {
					JOptionPane.showMessageDialog(button_1, "Login realizado com sucesso!");
				}else {
					JOptionPane.showMessageDialog(button_1, "Login Negado!");
				}
				
			}
		});
		button_1.setBounds(443, 391, 115, 40);
		contentPane.add(button_1);
	}
}
