package DAO;

import DigiCont.CadastroAgua;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

import com.mysql.cj.protocol.Resultset;

public class CadastroAguaDAO {

	private Connection connection;
	public String ContaAguaRGI;
	public String ContaAguaNConta;
	public String ContaAguaGrupo;
	public String ContaAguaMesRef;
	public String ContaAguaTipoLigacao;
	public String ContaAguaTipoFaturamento;
	public String ContaAguaConsumo;
	public String ContaAguaDataLeituraAtual;
	public String ContaAguaLeituraAtual;
	public String ContaAguaDataLeituraAnterior;
	public String ContaAguaLeituraAnterior;
	public String ContaAguaObservacao;
	public String ContaAguaValorAgua;
	public String ContaAguaValorEsgoto;
	public String ContaAguaValorTotal;

	public CadastroAguaDAO() {

		this.connection = new Conexao().getConnection();

	}

	public void adiciona(CadastroAgua cadaguadao) {
		String sql = "INSERT into contaagua(ContaAguaRGI, ContaAguaNConta, ContaAguaNConta, ContaAguaGrupo,ContaAguaMesRef, ContaAguaTipoLigacao, ContaAguaTipoFaturamento, ContaAguaConsumo, ContaAguaDataLeituraAtual, ContaAguaLeituraAtual, ContaAguaDataLeituraAnterior,  ContaAguaLeituraAnterior, ContaAguaObservacao, ContaAguaValorAgua, ContaAguaValorEsgoto, ContaAguaValorTotal  ) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cadaguadao.getContaAguaRGI());
			stmt.setString(2, cadaguadao.getContaAguaNConta());
			stmt.setString(3, cadaguadao.getContaAguaGrupo());
			stmt.setString(4, cadaguadao.getContaAguaMesRef());
			stmt.setString(5, cadaguadao.getContaAguaTipoLigacao());
			stmt.setString(6, cadaguadao.getContaAguaTipoFaturamento());
			stmt.setString(7, cadaguadao.getContaAguaConsumo());
			stmt.setString(8, cadaguadao.getContaAguaDataLeituraAtual());
			stmt.setString(9, cadaguadao.getContaAguaLeituraAtual());
			stmt.setString(10, cadaguadao.getContaAguaValorAgua());
			stmt.setString(11, cadaguadao.getContaAguaValorEsgoto());
			stmt.setString(12, cadaguadao.getContaAguaValorTotal());

			stmt.execute();
			stmt.close();
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}

}
