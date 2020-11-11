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
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.Box;
import javax.swing.JSeparator;

public class TelaCadastro {

	JFrame frmTelaCadastro;
	private ImageIcon imageIcon;
	protected Object frmTelaCadastroEnergia;
	private JPanel panel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JLabel lblNome;
	private JLabel lblEndereco;
	private JLabel lblhidrometro;
	private JTabbedPane tabbedPane;
	private JPanel panel1;
	private JTextField textNConta;
	private JLabel lblNDaConta;
	private JLabel lblGrupo;
	private JTextField textField_5;
	private JLabel lblCodIdentificador_3;
	private JTextField textRGI;
	private JLabel lblMesRef;
	private JTextField textField_7;
	private JLabel lblCodIdentificador_1;
	private JTextField textField_9;
	private JLabel lblTipFat;
	private JTextField textField_10;
	private JTextField textField_12;
	private JLabel lblConsumoM;
	private JLabel lblLeitAtual;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JLabel lblObservacao;
	private JTextField textField_17;
	private JPanel panel_1;
	private JLabel lblCodIdentificador_2;
	private JLabel lblCodIdentificador_4;
	private JLabel lblCodIdentificador_5;
	private JLabel lblCodIdentificador_6;
	private JLabel lblCodIdentificador_7;
	private JLabel lblCodIdentificador_8;
	private JLabel lblCodIdentificador_9;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField txtValorAgua;
	private JTextField txtValorEsgoto;
	private JTextField textField_23;

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
		frmTelaCadastro.getContentPane().setBackground(Color.WHITE);
		frmTelaCadastro.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(80, 24, 832, 94);
		panel.setLayout(null);
		frmTelaCadastro.getContentPane().add(panel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(74, 11, 242, 20);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(420, 11, 347, 20);
		panel.add(textField_1);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(115, 47, 112, 20);
		panel.add(textField_4);
		
		lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNome.setBounds(20, 6, 65, 28);
		panel.add(lblNome);
		
		lblEndereco = new JLabel("Endereco:");
		lblEndereco.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEndereco.setBounds(345, 6, 65, 28);
		panel.add(lblEndereco);
		
		lblhidrometro = new JLabel("Hidr\u00F4metro:");
		lblhidrometro.setHorizontalAlignment(SwingConstants.CENTER);
		lblhidrometro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblhidrometro.setBounds(30, 42, 75, 28);
		panel.add(lblhidrometro);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(80, 144, 832, 425);
		frmTelaCadastro.getContentPane().add(tabbedPane);
		
		panel1 = new JPanel();
		tabbedPane.addTab("Dados Conta", null, panel1, null);
		panel1.setLayout(null);
		
		textNConta = new JTextField();
		textNConta.setBounds(193, 54, 155, 20);
		textNConta.setHorizontalAlignment(SwingConstants.CENTER);
		textNConta.setColumns(10);
		panel1.add(textNConta);
		
		lblNDaConta = new JLabel("N\u00BA da Conta:");
		lblNDaConta.setBounds(215, 26, 97, 28);
		lblNDaConta.setHorizontalAlignment(SwingConstants.CENTER);
		lblNDaConta.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel1.add(lblNDaConta);
		
		lblGrupo = new JLabel("Grupo:");
		lblGrupo.setBounds(358, 26, 97, 28);
		lblGrupo.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrupo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel1.add(lblGrupo);
		
		textField_5 = new JTextField();
		textField_5.setBounds(384, 54, 45, 20);
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		panel1.add(textField_5);
		
		lblCodIdentificador_3 = new JLabel("RGI:");
		lblCodIdentificador_3.setBounds(52, 26, 97, 28);
		lblCodIdentificador_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodIdentificador_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel1.add(lblCodIdentificador_3);
		
		textRGI = new JTextField();
		textRGI.setBounds(30, 54, 155, 20);
		textRGI.setHorizontalAlignment(SwingConstants.CENTER);
		textRGI.setColumns(10);
		panel1.add(textRGI);
		
		lblMesRef = new JLabel("M\u00EAs Refer\u00EAncia:");
		lblMesRef.setBounds(484, 26, 97, 28);
		lblMesRef.setHorizontalAlignment(SwingConstants.CENTER);
		lblMesRef.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel1.add(lblMesRef);
		
		textField_7 = new JTextField();
		textField_7.setBounds(455, 54, 155, 20);
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setColumns(10);
		panel1.add(textField_7);
		
		lblCodIdentificador_1 = new JLabel("Tipo de Liga\u00E7\u00E3o:");
		lblCodIdentificador_1.setBounds(658, 26, 97, 28);
		lblCodIdentificador_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodIdentificador_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel1.add(lblCodIdentificador_1);
		
		textField_9 = new JTextField();
		textField_9.setBounds(636, 54, 155, 20);
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setColumns(10);
		panel1.add(textField_9);
		
		lblTipFat = new JLabel("Tipo de Faturamento:");
		lblTipFat.setBounds(215, 100, 120, 28);
		lblTipFat.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipFat.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel1.add(lblTipFat);
		
		textField_10 = new JTextField();
		textField_10.setBounds(198, 128, 155, 20);
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setColumns(10);
		panel1.add(textField_10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(455, 128, 155, 20);
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setColumns(10);
		panel1.add(textField_12);
		
		lblConsumoM = new JLabel("Consumo m\u00B3:");
		lblConsumoM.setBounds(472, 100, 120, 28);
		lblConsumoM.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsumoM.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel1.add(lblConsumoM);
		
		lblLeitAtual = new JLabel("Leitura Atual:");
		lblLeitAtual.setBounds(203, 223, 120, 28);
		lblLeitAtual.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeitAtual.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel1.add(lblLeitAtual);
		
		textField_13 = new JTextField();
		textField_13.setBounds(312, 227, 120, 20);
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setColumns(10);
		panel1.add(textField_13);
		
		JLabel lblData = new JLabel("Data");
		lblData.setBounds(314, 185, 120, 28);
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel1.add(lblData);
		
		JLabel lblApresentao = new JLabel("Apresenta\u00E7\u00E3o");
		lblApresentao.setBounds(205, 185, 120, 28);
		lblApresentao.setHorizontalAlignment(SwingConstants.CENTER);
		lblApresentao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel1.add(lblApresentao);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(130, 202, 0, 35);
		panel1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(232, 214, 355, 2);
		panel1.add(separator_1);
		
		JLabel lblLeitura = new JLabel("Leitura");
		lblLeitura.setBounds(461, 185, 120, 28);
		lblLeitura.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeitura.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel1.add(lblLeitura);
		
		JLabel lblLeituraAnterior = new JLabel("Leitura Anterior:");
		lblLeituraAnterior.setBounds(203, 250, 120, 28);
		lblLeituraAnterior.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeituraAnterior.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel1.add(lblLeituraAnterior);
		
		textField_14 = new JTextField();
		textField_14.setBounds(312, 254, 120, 20);
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setColumns(10);
		panel1.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setBounds(461, 254, 120, 20);
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setColumns(10);
		panel1.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setBounds(461, 227, 120, 20);
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setColumns(10);
		panel1.add(textField_16);
		
		lblObservacao = new JLabel("Observa\u00E7\u00E3o:");
		lblObservacao.setHorizontalAlignment(SwingConstants.CENTER);
		lblObservacao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblObservacao.setBounds(353, 319, 120, 28);
		panel1.add(lblObservacao);
		
		textField_17 = new JTextField();
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setColumns(10);
		textField_17.setBounds(30, 346, 767, 20);
		panel1.add(textField_17);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(444, 211, 0, 78);
		panel1.add(separator_2);
		
		panel_1 = new JPanel();
		tabbedPane.addTab("Valor Conta", null, panel_1, null);
		panel_1.setLayout(null);
		
		lblCodIdentificador_2 = new JLabel("Faixa de Consumo");
		lblCodIdentificador_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodIdentificador_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCodIdentificador_2.setBounds(30, 57, 149, 28);
		panel_1.add(lblCodIdentificador_2);
		
		lblCodIdentificador_4 = new JLabel("Consumo m\u00B3");
		lblCodIdentificador_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodIdentificador_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCodIdentificador_4.setBounds(178, 57, 149, 28);
		panel_1.add(lblCodIdentificador_4);
		
		lblCodIdentificador_5 = new JLabel("At\u00E9 10");
		lblCodIdentificador_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodIdentificador_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCodIdentificador_5.setBounds(30, 96, 149, 28);
		panel_1.add(lblCodIdentificador_5);
		
		lblCodIdentificador_6 = new JLabel("11 a 20");
		lblCodIdentificador_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodIdentificador_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCodIdentificador_6.setBounds(30, 135, 149, 28);
		panel_1.add(lblCodIdentificador_6);
		
		lblCodIdentificador_7 = new JLabel("21 a 31");
		lblCodIdentificador_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodIdentificador_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCodIdentificador_7.setBounds(30, 174, 149, 28);
		panel_1.add(lblCodIdentificador_7);
		
		lblCodIdentificador_8 = new JLabel("31 a 50");
		lblCodIdentificador_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodIdentificador_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCodIdentificador_8.setBounds(30, 213, 149, 28);
		panel_1.add(lblCodIdentificador_8);
		
		lblCodIdentificador_9 = new JLabel("acima de 51");
		lblCodIdentificador_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodIdentificador_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCodIdentificador_9.setBounds(30, 252, 149, 28);
		panel_1.add(lblCodIdentificador_9);
		
		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.setText("10");
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setColumns(10);
		textField_18.setBounds(202, 101, 106, 20);
		panel_1.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setColumns(10);
		textField_19.setBounds(202, 140, 106, 20);
		panel_1.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setEditable(false);
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setColumns(10);
		textField_20.setBounds(202, 179, 106, 20);
		panel_1.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setColumns(10);
		textField_21.setBounds(202, 218, 106, 20);
		panel_1.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setColumns(10);
		textField_22.setBounds(202, 257, 106, 20);
		panel_1.add(textField_22);
		
		JLabel lblValorAgua = new JLabel("Valor \u00C1gua");
		lblValorAgua.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorAgua.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblValorAgua.setBounds(412, 57, 149, 28);
		panel_1.add(lblValorAgua);
		
		JLabel lblValorEsgoto = new JLabel("Valor Esgoto");
		lblValorEsgoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorEsgoto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblValorEsgoto.setBounds(590, 57, 149, 28);
		panel_1.add(lblValorEsgoto);
		
		txtValorAgua = new JTextField();
		txtValorAgua.setHorizontalAlignment(SwingConstants.CENTER);
		txtValorAgua.setColumns(10);
		txtValorAgua.setBounds(434, 101, 106, 20);
		panel_1.add(txtValorAgua);
		
		txtValorEsgoto = new JTextField();
		txtValorEsgoto.setHorizontalAlignment(SwingConstants.CENTER);
		txtValorEsgoto.setColumns(10);
		txtValorEsgoto.setBounds(610, 101, 106, 20);
		panel_1.add(txtValorEsgoto);
		
		JLabel lblValorTotal = new JLabel("Valor Total");
		lblValorTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorTotal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblValorTotal.setBounds(493, 135, 149, 28);
		panel_1.add(lblValorTotal);
		
		textField_23 = new JTextField();
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setColumns(10);
		textField_23.setBounds(515, 179, 106, 20);
		panel_1.add(textField_23);
		
		JButton btnCadastro = new JButton("Cadastro");
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroAgua cadaguadao = new CadastroAgua();
				
				cadaguadao.setContaAguaRGI(textRGI.getText());
				cadaguadao.setContaAguaNConta(textNConta.getText());
				
				
				if ((tFConsumo.getText().isEmpty()) || (textFValorTotal.getText().isEmpty()) || (textMesConta.getText().isEmpty()) || (textValorAgua.getText().isEmpty())  ||  (textValorEsgoto.getText().isEmpty())) {
					   JOptionPane.showMessageDialog(null, "Os campos não podem estar vazios");
					}
				
				else {

				    CadastroAguaDAO cadagua = new CadastroAguaDAO();
				    cadagua.adiciona(cadaguadao);
				    JOptionPane.showMessageDialog(null, "Conta registrada com sucesso! ");
				}
				
				tFConsumo.setText("");
				textFValorTotal.setText("");
				textMesConta.setText("");
				textValorAgua.setText("");
				textValorEsgoto.setText("");
									
			}
		});

	
		btnCadastro.setBounds(423, 623, 107, 23);
		frmTelaCadastro.getContentPane().add(btnCadastro);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\assen\\eclipse-workspace\\TecSus\\img\\IconAgua.png"));
		lblNewLabel_1_1.setBounds(10, 11, 30, 30);
		frmTelaCadastro.getContentPane().add(lblNewLabel_1_1);
		
		JButton lblNewLabel_3 = new JButton("New label");
		lblNewLabel_3.addActionListener(new ActionListener() {

	public void actionPerformed(ActionEvent e) {
		MenuEnergia window = new MenuEnergia();
		window.frmMenuEnergia.setVisible(true);
	}
});lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\assen\\eclipse-workspace\\TecSus\\img\\IconReturn.png"));lblNewLabel_3.setForeground(Color.WHITE);lblNewLabel_3.setBackground(Color.WHITE);lblNewLabel_3.setBounds(31,611,60,54);frmTelaCadastro.getContentPane().add(lblNewLabel_3);frmTelaCadastro.setResizable(false);frmTelaCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);frmTelaCadastro.setForeground(Color.WHITE);frmTelaCadastro.setTitle("TELA CADASTRO \u00C1GUA");frmTelaCadastro.setBounds(100,100,960,720);frmTelaCadastro.setLocationRelativeTo(null);

imageIcon=new ImageIcon("img/IconAgua.png");

}}
