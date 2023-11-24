package vetor.tela;

import java.awt.EventQueue;
import java.awt.TextArea;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
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
	public principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Produto");
		lblNewLabel.setBounds(10, 39, 69, 14);
		contentPane.add(lblNewLabel);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(56, 107, 335, 127);
		contentPane.add(textArea);
		
		txt1 = new JTextField();
		txt1.setBounds(69, 36, 117, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		ArrayList<String>produto = new ArrayList();
		
		JButton btnNewButton = new JButton("Enviar produto");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				produto.add(txt1.getText());
				for(String str : produto) {
					textArea.setText("" + produto);
				}
				
			}
		});
		btnNewButton.setBounds(213, 35, 110, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
