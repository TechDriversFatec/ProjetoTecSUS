package DigiCont;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 960, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JButton btnCadastrarFor = new JButton("Cadastrar");
		btnCadastrarFor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastrarFor.setBounds(282, 189, 129, 40);
		frame.getContentPane().add(btnCadastrarFor);
		
		JButton btnEditarForn = new JButton("Editar");
		btnEditarForn.setBounds(282, 260, 129, 40);
		frame.getContentPane().add(btnEditarForn);
		
		JButton btnCadastrarCli = new JButton("Cadastrar");
		btnCadastrarCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				TelaCadastro window = new TelaCadastro();
				window.frmTelaCadastro.setVisible(true);	

			}
			
		});
		
		btnCadastrarCli.setBounds(562, 189, 129, 40);
		frame.getContentPane().add(btnCadastrarCli);
		
		JButton btnEditarCli = new JButton("Editar");
		btnEditarCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaEditar window = new TelaEditar();
				window.frame.setVisible(true);
			}
		});
		btnEditarCli.setBounds(562, 260, 129, 40);
		frame.getContentPane().add(btnEditarCli);
		
		JButton btnRelatorioCli = new JButton("Relat\u00F3rio");
		btnRelatorioCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				TelaRelatorio window = new TelaRelatorio();
				window.frame.setVisible(true);
			
			}
		});
		btnRelatorioCli.setBounds(562, 326, 129, 40);
		frame.getContentPane().add(btnRelatorioCli);
	}
	
	 
}
