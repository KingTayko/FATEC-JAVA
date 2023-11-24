package swing;
import java.util.ArrayList;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		ArrayList<Integer> juncao = new ArrayList<>();
	/**
	 * Create the frame.
	 */
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(164, 62, 175, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("        Calculadora de media");
		lblNewLabel.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 21));
		lblNewLabel.setBounds(102, 11, 310, 40);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(123, 165, 270, 63);
		contentPane.add(textArea);
		
		JButton btnNewButton_1 = new JButton("Enviar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					
					int num = Integer.parseInt(textField.getText());
					juncao.add(num);
					textArea.setText("Notas: " + juncao);
					
				}catch(Exception err){
					JOptionPane.showMessageDialog(null, "Nota invalida!");
				}
			}
		});
		
		JTextArea resultado = new JTextArea();
		resultado.setBounds(123, 298, 270, 37);
		contentPane.add(resultado);
		
		btnNewButton_1.setBounds(206, 121, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Media");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double media = CalculadoraNumeros.CalcularMedia(juncao);
				resultado.setText("A media é: " + media);
			}
		});
		
		
		btnNewButton.setBounds(206, 249, 89, 23);
		contentPane.add(btnNewButton);
	}
}
