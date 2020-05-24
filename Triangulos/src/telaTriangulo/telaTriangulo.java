package telaTriangulo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JSlider;
import java.awt.Font;
import java.awt.Window;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.color.ColorSpace;

import java.math.*;


public class telaTriangulo {

	private JFrame frame;
	
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 607, 384);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Vinicius\\Documents\\Curso_Java\\Triangulos\\src\\images\\triangulo.png"));
		lblNewLabel.setBounds(450, 10, 106, 127);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel ladoA = new JLabel("0");
		ladoA.setForeground(Color.GRAY);
		ladoA.setHorizontalAlignment(SwingConstants.CENTER);
		ladoA.setFont(new Font("Tahoma", Font.BOLD, 16));
		ladoA.setBounds(337, 24, 45, 22);
		frame.getContentPane().add(ladoA);
		
		JLabel ladoB = new JLabel("0");
		ladoB.setForeground(Color.GRAY);
		ladoB.setHorizontalAlignment(SwingConstants.CENTER);
		ladoB.setFont(new Font("Tahoma", Font.BOLD, 16));
		ladoB.setBounds(337, 60, 45, 22);
		frame.getContentPane().add(ladoB);
		
		JLabel ladoC = new JLabel("0");
		ladoC.setForeground(Color.GRAY);
		ladoC.setHorizontalAlignment(SwingConstants.CENTER);
		ladoC.setFont(new Font("Tahoma", Font.BOLD, 16));
		ladoC.setBounds(337, 92, 45, 22);
		frame.getContentPane().add(ladoC);
		
		JSlider sliderA = new JSlider();
		sliderA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				ladoA.setText(Integer.toString((sliderA.getValue()))); 
			}
		});
		sliderA.setMaximum(20);
		sliderA.setValue(0);
		sliderA.setBounds(127, 24, 200, 22);
		frame.getContentPane().add(sliderA);
		
		JSlider sliderB = new JSlider();
		sliderB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				ladoB.setText(Integer.toString((sliderB.getValue())));
			}
		});
		sliderB.setMaximum(20);
		sliderB.setValue(0);
		sliderB.setBounds(127, 60, 200, 22);
		frame.getContentPane().add(sliderB);
		
		JSlider sliderC = new JSlider();
		sliderC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				ladoC.setText(Integer.toString(sliderC.getValue()));
			}
		});
		sliderC.setMaximum(20);
		sliderC.setValue(0);
		sliderC.setBounds(127, 92, 200, 22);
		frame.getContentPane().add(sliderC);
		
		JLabel lblNewLabel_1 = new JLabel("Segmento a");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(22, 24, 95, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblSegmentoB = new JLabel("Segmento b");
		lblSegmentoB.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSegmentoB.setBounds(22, 60, 95, 22);
		frame.getContentPane().add(lblSegmentoB);
		
		JLabel lblSegmentoC = new JLabel("Segmento c");
		lblSegmentoC.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSegmentoC.setBounds(22, 92, 95, 22);
		frame.getContentPane().add(lblSegmentoC);
				
		JPanel panel = new JPanel();
		panel.setBounds(40, 182, 394, 146);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JLabel msgTipoTriangulo = new JLabel("Tipo de tri\u00E2ngulo");
		panel.add(msgTipoTriangulo);
		msgTipoTriangulo.setForeground(Color.GRAY);
		msgTipoTriangulo.setFont(new Font("Arial", Font.PLAIN, 20));
		msgTipoTriangulo.setHorizontalAlignment(SwingConstants.CENTER);
		msgTipoTriangulo.setBounds(0, 83, 394, 53);
		
		JLabel msgTriangulo = new JLabel("Tri\u00E2ngulo");
		msgTriangulo.setFont(new Font("Arial", Font.PLAIN, 20));
		msgTriangulo.setHorizontalAlignment(SwingConstants.CENTER);
		msgTriangulo.setForeground(Color.GRAY);
		msgTriangulo.setBounds(0, 10, 394, 53);
		panel.add(msgTriangulo);
		
		
		
		JButton botaoVerificar = new JButton("Verificar");
		botaoVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				int a = sliderA.getValue();
				int b = sliderB.getValue();
				int c = sliderC.getValue();
				
				
				if(a*b*c !=0) 
					panel.setVisible(true);
					
				if (a < b+c && b < a+c && c < b+a  ) {
					
					msgTriangulo.setForeground(Color.BLUE);
					msgTriangulo.setText("Estes valores formam um triângulo!!!");
				
					if(a==b && b==c) {
						
						msgTipoTriangulo.setForeground(Color.green);
						msgTipoTriangulo.setText("O triângulo formado é equilátero!!!");
						
					} else if (a==b && b!=c || c==b && a!=c || a==c && b!=c) {
						
						msgTipoTriangulo.setForeground(Color.GREEN);
						msgTipoTriangulo.setText("O triângulo formado é isósceles!!!");
						
					} else {
						
						msgTipoTriangulo.setForeground(Color.GREEN);
						msgTipoTriangulo.setText("O triângulo formado é escaleno!!!");
						
					}
					
					
				} else {
					
					msgTriangulo.setForeground(Color.RED);
					msgTriangulo.setText("Estes valores não formam um triângulo!!!");
					msgTipoTriangulo.setText(" ");
				}
				
				
				
				
					
			}
		});
		botaoVerificar.setFont(new Font("Tahoma", Font.BOLD, 16));
		botaoVerificar.setBounds(157, 130, 141, 42);
		frame.getContentPane().add(botaoVerificar);
		
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaTriangulo window = new telaTriangulo();
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
	public telaTriangulo() {
		initialize();
		panel.setVisible(false);
		
	}
	
	
}
