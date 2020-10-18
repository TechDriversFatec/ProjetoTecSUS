package DigiCont;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.DropMode;
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

public class TelaCadastro {

	JFrame frmTelaCadastro;
	private JTextField tFConsumo;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JTextField txtMinimo;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro window = new TelaCadastro();
					window.frmTelaCadastro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaCadastro = new JFrame();
		frmTelaCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelaCadastro.getContentPane().setBackground(Color.WHITE);
		frmTelaCadastro.setForeground(Color.LIGHT_GRAY);
		frmTelaCadastro.setTitle("Tela Cadastro \u00C1gua");
		frmTelaCadastro.setBounds(100, 100, 960, 720);
		frmTelaCadastro.getContentPane().setLayout(null);
		frmTelaCadastro.setLocationRelativeTo(null);

		
		JLabel lblNewLabel = new JLabel("Consumo M3");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(102, 143, 91, 28);
		frmTelaCadastro.getContentPane().add(lblNewLabel);
		
		tFConsumo = new JTextField();
		tFConsumo.setHorizontalAlignment(SwingConstants.CENTER);
		tFConsumo.setBounds(96, 171, 103, 20);
		frmTelaCadastro.getContentPane().add(tFConsumo);
		tFConsumo.setColumns(10);
		
		JLabel tFValorTotal = new JLabel("Valor Total");
		tFValorTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tFValorTotal.setBounds(434, 143, 78, 28);
		frmTelaCadastro.getContentPane().add(tFValorTotal);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(422, 171, 103, 20);
		frmTelaCadastro.getContentPane().add(textField);
		
		JLabel lblMsDaConta = new JLabel("M\u00EAs da Conta");
		lblMsDaConta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMsDaConta.setBounds(787, 143, 91, 28);
		frmTelaCadastro.getContentPane().add(lblMsDaConta);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(781, 171, 103, 20);
		frmTelaCadastro.getContentPane().add(textField_1);
		
		lblNewLabel_1 = new JLabel("CALCULO DO VALOR DA CONTA");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(356, 254, 261, 14);
		frmTelaCadastro.getContentPane().add(lblNewLabel_1);
		
		JCheckBox checkBox01 = new JCheckBox("At\u00E9 10");
		checkBox01.setBackground(Color.WHITE);
		checkBox01.setForeground(Color.WHITE);
		checkBox01.setEnabled(false);
		checkBox01.setSelected(true);
		checkBox01.setBounds(96, 307, 70, 23);
		frmTelaCadastro.getContentPane().add(checkBox01);
		
		JCheckBox checkBox02 = new JCheckBox("11 \u00E1 20");
		checkBox02.setBackground(Color.WHITE);
		checkBox02.setForeground(Color.BLACK);
		checkBox02.setBounds(96, 345, 70, 23);
		frmTelaCadastro.getContentPane().add(checkBox02);
		
		JCheckBox checkBox03 = new JCheckBox("21 \u00E1 30");
		checkBox03.setBackground(Color.WHITE);
		checkBox03.setForeground(Color.BLACK);
		checkBox03.setBounds(96, 385, 70, 23);
		frmTelaCadastro.getContentPane().add(checkBox03);
		
		JCheckBox checkBox04 = new JCheckBox("31 \u00E1 50");
		checkBox04.setBackground(Color.WHITE);
		checkBox04.setForeground(Color.BLACK);
		checkBox04.setBounds(96, 426, 70, 23);
		frmTelaCadastro.getContentPane().add(checkBox04);
		
		txtMinimo = new JTextField();
		txtMinimo.setBackground(Color.WHITE);
		txtMinimo.setForeground(Color.WHITE);
		txtMinimo.setEditable(false);
		txtMinimo.setEnabled(false);
		txtMinimo.setHorizontalAlignment(SwingConstants.CENTER);
		txtMinimo.setText("Minimo");
		txtMinimo.setBounds(179, 308, 86, 20);
		frmTelaCadastro.getContentPane().add(txtMinimo);
		txtMinimo.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(179, 346, 86, 20);
		frmTelaCadastro.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(179, 388, 86, 20);
		frmTelaCadastro.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(179, 427, 86, 20);
		frmTelaCadastro.getContentPane().add(textField_4);
		
		JLabel lblValorgua = new JLabel("Valor \u00C1gua:");
		lblValorgua.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValorgua.setBounds(402, 323, 78, 28);
		frmTelaCadastro.getContentPane().add(lblValorgua);
		
		JLabel lblValorEsgoto = new JLabel("Valor Esgoto:");
		lblValorEsgoto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValorEsgoto.setBounds(402, 389, 91, 28);
		frmTelaCadastro.getContentPane().add(lblValorEsgoto);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setBounds(490, 329, 86, 20);
		frmTelaCadastro.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setColumns(10);
		textField_6.setBounds(490, 395, 86, 20);
		frmTelaCadastro.getContentPane().add(textField_6);
		
		JLabel lblValorTotal = new JLabel("Valor Total:");
		lblValorTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValorTotal.setBounds(633, 359, 78, 28);
		frmTelaCadastro.getContentPane().add(lblValorTotal);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setEnabled(false);
		textField_7.setColumns(10);
		textField_7.setBounds(721, 365, 86, 20);
		frmTelaCadastro.getContentPane().add(textField_7);
		
		JCheckBox checkBox05 = new JCheckBox("Estou ciente que todos os dados foram conferidos antes de cadastrar");
		checkBox05.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox05.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBox05.setForeground(Color.BLACK);
		checkBox05.setBackground(Color.WHITE);
		checkBox05.setBounds(214, 534, 515, 23);
		frmTelaCadastro.getContentPane().add(checkBox05);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso");
				
			}
		});
		btnCadastrar.setBackground(Color.GRAY);
		btnCadastrar.setForeground(Color.BLACK);
		btnCadastrar.setBounds(422, 610, 103, 28);
		frmTelaCadastro.getContentPane().add(btnCadastrar);
		
	

	}
}
	
