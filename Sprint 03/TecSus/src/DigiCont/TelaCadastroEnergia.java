package DigiCont;

import DAO.CadastroAguaDAO;



import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.DropMode;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;


public class TelaCadastroEnergia {

	JFrame frmTelaCadastroEnergia;
	private JTextField tFConsumo;
	private ImageIcon imageIcon;
	private JLabel lblIconAgua;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_2;
	private JTextField textField_4;
	private JLabel lblNewLabel_1_3;
	private JTextField textField_5;
	private JLabel lblNewLabel_1_4;
	private JTextField textField_6;
	private JLabel lblNewLabel_1_2_2;
	private JTextField textField_7;
	private JLabel lblNewLabel_3;
	private JTextField textField_8;
	private JLabel lblNewLabel_1_2_3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroEnergia window = new TelaCadastroEnergia();
					window.frmTelaCadastroEnergia.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCadastroEnergia() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaCadastroEnergia = new JFrame();
		frmTelaCadastroEnergia.setResizable(false);
		frmTelaCadastroEnergia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelaCadastroEnergia.getContentPane().setBackground(Color.WHITE);
		frmTelaCadastroEnergia.setForeground(Color.LIGHT_GRAY);
		frmTelaCadastroEnergia.setTitle("TELA CADASTRO ENERGIA");
		frmTelaCadastroEnergia.setBounds(100, 100, 960, 720);
		frmTelaCadastroEnergia.getContentPane().setLayout(null);
		frmTelaCadastroEnergia.setLocationRelativeTo(null);
		

		
		JLabel lblNewLabel = new JLabel("N\u00FAmero Instala\u00E7\u00E3o:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(121, 135, 140, 28);
		frmTelaCadastroEnergia.getContentPane().add(lblNewLabel);
		
		tFConsumo = new JTextField();
		tFConsumo.setHorizontalAlignment(SwingConstants.CENTER);
		tFConsumo.setBounds(121, 163, 140, 20);
		frmTelaCadastroEnergia.getContentPane().add(tFConsumo);
		tFConsumo.setColumns(10);

		
		imageIcon = new ImageIcon("img/IconAgua.png");
		lblIconAgua = new JLabel(new ImageIcon("C:\\Users\\assen\\eclipse-workspace\\TecSus\\img\\IconEnergia.png"));
		lblIconAgua.setBounds(10, 10, 30, 30);
		frmTelaCadastroEnergia.getContentPane().add(lblIconAgua);
		
		JLabel lblNewLabel_1 = new JLabel("Valor Total:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(304, 135, 140, 28);
		frmTelaCadastroEnergia.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(304, 163, 140, 20);
		frmTelaCadastroEnergia.getContentPane().add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("Data Vencimento:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(486, 135, 140, 28);
		frmTelaCadastroEnergia.getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(486, 163, 140, 20);
		frmTelaCadastroEnergia.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("M\u00EAs da Conta:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(668, 135, 140, 28);
		frmTelaCadastroEnergia.getContentPane().add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(668, 163, 140, 20);
		frmTelaCadastroEnergia.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Data Emiss\u00E3o:");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2_1.setBounds(121, 282, 140, 28);
		frmTelaCadastroEnergia.getContentPane().add(lblNewLabel_1_2_1);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(121, 310, 140, 20);
		frmTelaCadastroEnergia.getContentPane().add(textField_3);
		
		lblNewLabel_2 = new JLabel("Leitura Anterior:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(304, 282, 140, 28);
		frmTelaCadastroEnergia.getContentPane().add(lblNewLabel_2);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(304, 310, 140, 20);
		frmTelaCadastroEnergia.getContentPane().add(textField_4);
		
		lblNewLabel_1_3 = new JLabel("Leitura Atual:");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(486, 282, 140, 28);
		frmTelaCadastroEnergia.getContentPane().add(lblNewLabel_1_3);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		textField_5.setBounds(486, 310, 140, 20);
		frmTelaCadastroEnergia.getContentPane().add(textField_5);
		
		lblNewLabel_1_4 = new JLabel("N\u00BA Dias Faturamento:");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(661, 282, 160, 28);
		frmTelaCadastroEnergia.getContentPane().add(lblNewLabel_1_4);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setColumns(10);
		textField_6.setBounds(668, 310, 140, 20);
		frmTelaCadastroEnergia.getContentPane().add(textField_6);
		
		lblNewLabel_1_2_2 = new JLabel("Prev Prox Leitura:");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2_2.setBounds(121, 401, 140, 28);
		frmTelaCadastroEnergia.getContentPane().add(lblNewLabel_1_2_2);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setColumns(10);
		textField_7.setBounds(121, 429, 140, 20);
		frmTelaCadastroEnergia.getContentPane().add(textField_7);
		
		lblNewLabel_3 = new JLabel("Aviso:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(255, 401, 140, 28);
		frmTelaCadastroEnergia.getContentPane().add(lblNewLabel_3);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setColumns(10);
		textField_8.setBounds(304, 429, 504, 20);
		frmTelaCadastroEnergia.getContentPane().add(textField_8);
		
		lblNewLabel_1_2_3 = new JLabel("PER\u00CDODO DE FATURAMENTO");
		lblNewLabel_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2_3.setBounds(322, 243, 323, 28);
		frmTelaCadastroEnergia.getContentPane().add(lblNewLabel_1_2_3);
		

		
		
	
	}
		}
