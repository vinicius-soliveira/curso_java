import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Calculadora {

	private JFrame frame;
	private JTextField tela;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnSoma;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnSubtracao;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnMultiplicacao;
	private JButton btnFlutuante;
	private JButton btn0;
	private JButton btnExponenciacao;
	private JButton btnDivisao;
	private JPanel panel;
	double termo1;
	double termo2;
	boolean ponto;
	
	
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
		frame.getContentPane().setFont(new Font("Arial", Font.BOLD, 14));
		frame.setBounds(100, 100, 312, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tela = new JTextField();
		tela.setHorizontalAlignment(SwingConstants.RIGHT);
		tela.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		tela.setBounds(10, 29, 266, 53);
		frame.getContentPane().add(tela);
		tela.setColumns(10);
		
		JButton btnCalcule = new JButton("CALCULE");
		btnCalcule.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCalcule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnCalcule.setBounds(177, 113, 102, 35);
		frame.getContentPane().add(btnCalcule);
		
		panel = new JPanel();
		panel.setBounds(10, 166, 266, 200);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+"1");
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 14));
		btn1.setBounds(10, 10, 53, 35);
		panel.add(btn1);
		
		btn4 = new JButton("4");
		btn4.setFont(new Font("Arial", Font.BOLD, 14));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+"4");
			}
		});
		btn4.setBounds(10, 55, 53, 35);
		panel.add(btn4);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+"2");
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 14));
		btn2.setBounds(73, 10, 53, 35);
		panel.add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+"3");
			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 14));
		btn3.setBounds(136, 10, 53, 35);
		panel.add(btn3);
		
		btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSoma.setFont(new Font("Arial", Font.BOLD, 14));
		btnSoma.setBounds(199, 10, 53, 35);
		panel.add(btnSoma);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+"5");
			}
		});
		btn5.setFont(new Font("Arial", Font.BOLD, 14));
		btn5.setBounds(73, 55, 53, 35);
		panel.add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+"6");
			}
		});
		btn6.setFont(new Font("Arial", Font.BOLD, 14));
		btn6.setBounds(136, 55, 53, 35);
		panel.add(btn6);
		
		btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSubtracao.setFont(new Font("Arial", Font.BOLD, 14));
		btnSubtracao.setBounds(199, 55, 53, 35);
		panel.add(btnSubtracao);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+"7");
			}
		});
		btn7.setFont(new Font("Arial", Font.BOLD, 14));
		btn7.setBounds(10, 100, 53, 35);
		panel.add(btn7);
		
		btnFlutuante = new JButton(".");
		btnFlutuante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!ponto)
					tela.setText(tela.getText()+".");
				ponto = true;
			}
		});
		btnFlutuante.setFont(new Font("Arial", Font.BOLD, 14));
		btnFlutuante.setBounds(10, 145, 53, 35);
		panel.add(btnFlutuante);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+"8");
			}
		});
		btn8.setFont(new Font("Arial", Font.BOLD, 14));
		btn8.setBounds(73, 100, 53, 35);
		panel.add(btn8);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+"0");
			}
		});
		btn0.setFont(new Font("Arial", Font.BOLD, 14));
		btn0.setBounds(73, 145, 53, 35);
		panel.add(btn0);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+"9");
			}
		});
		btn9.setFont(new Font("Arial", Font.BOLD, 14));
		btn9.setBounds(136, 100, 53, 35);
		panel.add(btn9);
		
		btnExponenciacao = new JButton("^");
		btnExponenciacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExponenciacao.setFont(new Font("Arial", Font.BOLD, 14));
		btnExponenciacao.setBounds(136, 145, 53, 35);
		panel.add(btnExponenciacao);
		
		btnMultiplicacao = new JButton("*");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMultiplicacao.setFont(new Font("Arial", Font.BOLD, 14));
		btnMultiplicacao.setBounds(199, 100, 53, 35);
		panel.add(btnMultiplicacao);
		
		btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDivisao.setFont(new Font("Arial", Font.BOLD, 14));
		btnDivisao.setBounds(199, 145, 53, 35);
		panel.add(btnDivisao);
		
		
	}
}
