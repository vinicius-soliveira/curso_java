import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Calculadora {

	private JFrame frame;
	private JTextField parcela;
	private JTextField parcela2;
	private JTextField resultado;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
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
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		parcela = new JTextField();
		parcela.setFont(new Font("Tahoma", Font.BOLD, 12));
		parcela.setBounds(157, 28, 69, 37);
		frame.getContentPane().add(parcela);
		parcela.setColumns(10);
		
		parcela2 = new JTextField();
		parcela2.setBounds(38, 29, 69, 37);
		frame.getContentPane().add(parcela2);
		parcela2.setColumns(10);
		
		resultado = new JTextField();
		resultado.setBounds(130, 154, 96, 37);
		frame.getContentPane().add(resultado);
		resultado.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Resultado:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(25, 157, 102, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton soma = new JRadioButton("SOMA");
		soma.setBounds(327, 108, 103, 21);
		frame.getContentPane().add(soma);
		
		JRadioButton subtracao = new JRadioButton("SUBTRA\u00C7\u00C3O");
		subtracao.setBounds(327, 131, 103, 21);
		frame.getContentPane().add(subtracao);
		
		JRadioButton multiplicacao = new JRadioButton("MULTIPLICA\u00C7\u00C3O");
		multiplicacao.setBounds(327, 162, 103, 21);
		frame.getContentPane().add(multiplicacao);
		
		JRadioButton divisao = new JRadioButton("DIVIS\u00C3O");
		divisao.setBounds(327, 192, 103, 21);
		frame.getContentPane().add(divisao);
		
		JButton btnNewButton = new JButton("CALCULE");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
				int n1 = Integer.parseInt(parcela.getText());
				int n2 = Integer.parseInt(parcela2.getText());
				
				
				
				int result = n1 + n2;
				resultado.setText(Integer.toString(result));
				
			}
		});
		btnNewButton.setBounds(271, 28, 102, 35);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
