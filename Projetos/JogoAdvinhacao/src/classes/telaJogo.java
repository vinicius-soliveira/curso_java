package classes;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;
import java.math.*;

public class telaJogo {

	private JFrame frame;
	boolean acerto= false;
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
				
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Arial", Font.BOLD, 16));
		frame.setBounds(100, 100, 604, 529);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel imagem = new JLabel("");
		imagem.setIcon(new ImageIcon("C:\\Users\\Vinicius\\Documents\\Curso_Java\\JogoAdvinhacao\\src\\imagens\\genio.png"));
		imagem.setBounds(278, 67, 298, 415);
		frame.getContentPane().add(imagem);
		
		JLabel lblMessage = new JLabel("Mensagem");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setFont(new Font("Arial", Font.BOLD, 16));
		lblMessage.setBounds(205, 36, 163, 85);
		frame.getContentPane().add(lblMessage);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Vinicius\\Documents\\Curso_Java\\JogoAdvinhacao\\src\\imagens\\balao.png"));
		lblNewLabel_1.setBounds(182, 10, 220, 177);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Escolha um n\u00FAmero:");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_3.setBounds(34, 310, 163, 29);
		frame.getContentPane().add(lblNewLabel_3);
		
		JSpinner valor = new JSpinner();
		valor.setModel(new SpinnerNumberModel(1, 1, 5, 1));
		valor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		valor.setBounds(197, 311, 39, 28);
		frame.getContentPane().add(valor);
		
		JButton btnNovoJogo = new JButton("Novo Jogo");
		btnNovoJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNovoJogo.setVisible(false);
				imagem.setIcon((new ImageIcon("C:\\Users\\Vinicius\\Documents\\Curso_Java\\JogoAdvinhacao\\src\\imagens\\genio.png")));
				lblMessage.setForeground(Color.BLACK);
				lblMessage.setText("<html> <center>Estou pensando em número entre 1 e 5. Tente Advinhar!!!</center></html>");
				acerto = false;
			}
		});
		btnNovoJogo.setFont(new Font("Arial", Font.BOLD, 16));
		btnNovoJogo.setBounds(268, 428, 122, 37);
		frame.getContentPane().add(btnNovoJogo);
		
		btnNovoJogo.setVisible(false);
		lblMessage.setText("<html> Estou pensando em número entre 1 e 10. Tente Advinhar!!!</html>");
	    acerto = false;
		
		
		JButton btnPalpite = new JButton("Palpite");
		btnPalpite.setFont(new Font("Arial", Font.BOLD, 15));
		btnPalpite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int num = Integer.parseInt(valor.getValue().toString());
				double n = 1 + 9*Math.random();
				long valorPensado = Math.round(n);
			
				
				if (!acerto) {
				
					if (num == valorPensado) {
						lblMessage.setForeground(Color.BLUE);
						lblMessage.setText("ACERTOU!!!");
						imagem.setBounds(301, 35, 298, 415);
						imagem.setIcon((new ImageIcon("C:\\Users\\Vinicius\\Documents\\Curso_Java\\JogoAdvinhacao\\src\\imagens\\genioAcerto.png")));
						btnNovoJogo.setVisible(true);
						acerto = true;
					} else {
						lblMessage.setForeground(Color.RED);
						imagem.setBounds(301, 50, 298, 415);
						imagem.setIcon((new ImageIcon("C:\\Users\\Vinicius\\Documents\\Curso_Java\\JogoAdvinhacao\\src\\imagens\\genioErro.png")));
						lblMessage.setText("<html> Você ERROU! Tente novamente!</html>");
					
					}
				
				}
			}
		});
		btnPalpite.setBounds(71, 370, 106, 29);
		frame.getContentPane().add(btnPalpite);
		
		
		
		
		
		
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaJogo window = new telaJogo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}});
		
		
		
	}

	/**
	 * Create the application.
	 */
	public telaJogo() {
		initialize();
		
	}
	
	
	
	
	
	
}
