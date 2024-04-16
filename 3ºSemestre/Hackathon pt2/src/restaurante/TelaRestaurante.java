package restaurante;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaRestaurante extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRestaurante frame = new TelaRestaurante();
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
	public TelaRestaurante() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 581);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 441, 521);
		panel.setBackground(Color.DARK_GRAY);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\KingTayko\\Desktop\\ifome.png"));
		lblNewLabel.setBounds(51, 139, 421, 371);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("                 Bem Vindo!");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Dubai", Font.ITALIC, 30));
		lblNewLabel_1.setBounds(27, 37, 383, 104);
		panel.add(lblNewLabel_1);
		
		Button button = new Button("Fazer Pedido");
		button.setBackground(Color.RED);
		button.setBounds(484, 35, 284, 100);
		contentPane.add(button);
		
		Button button_1 = new Button("Adiministrador");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*Ligação da 2 janela*/
				TelaAdmin T2 = new TelaAdmin();
				T2.setVisible(true);
				dispose();
				
			}
		});
		button_1.setFont(new Font("Dubai", Font.ITALIC, 12));
		button_1.setBackground(Color.RED);
		button_1.setBounds(484, 206, 284, 100);
		contentPane.add(button_1);
		
		Button button_2 = new Button("Sair");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_2.setFont(new Font("Dubai", Font.ITALIC, 12));
		button_2.setBackground(Color.RED);
		button_2.setBounds(484, 374, 284, 100);
		contentPane.add(button_2);
	}
}
