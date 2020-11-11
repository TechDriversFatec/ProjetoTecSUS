package DAO;


import DigiCont.CadastroEnegia;
import java.sql.*;
import java.util.*;

public class CadastroEnergiaDAO {
	
	 private Connection connection;
		public String ContaLuzID;
		public String ContaLuzValorTotal;
		public String ContaLuzDataVencimento; 
		public String ContaLuzMes;
		public String ContaLuzEmissao;
		public String ContaLuzAnterior; 
		public String ContaLuzAtual;
		public String ContaLuzDiasFaturamento;
		public String ContaLuzStatus;
		public String ContaLuzPrevisaoProximaLuz;
		public String ContaLuzValorFornecedor;
		public String ContaLuzDataFaturamento;
		public String ContaLuzAviso;
		public String ContaLuzFiscalCFOP;
		public String ContaLuzFiscalGrupo;
		public String ContaLuzFiscalSubGrupo;
		public String ContaLuzFiscalClasse;
		public String ContaLuzFiscalSubClasse;
		public String ContaLuzFiscalMulta;
		public String ContaLuzFiscalJurosMulta;
		public String ContaLuzFiscalTipoFornecimento;
		public String ContaLuzFiscalModalidadeTarifaria;
		
		
		public CadastroEnergiaDAO(){ 
	    	
	        this.connection = new Conexao().getConnection();
	        
	    } 
	 
	 public void adiciona(CadastroEnegia cadenergiadao){ 
	        String sql = "INSERT INTO contaluz(ContaLuzID, ContaLuzValorTotal, ContaLuzDataVencimento, ContaLuzMes, ContaLuzEmissao, ContaLuzAnterior, ContaLuzAtual, ContaLuzDiasFaturamento, ContaLuzPrevisaoProximaLuz, ContaLuzAviso) VALUES(?,?,?,?,?,?,?,?,?,?)";
	        try { 
	            PreparedStatement stmt = connection.prepareStatement(sql);
	            stmt.setString(1, cadenergiadao.getContaLuzID());
	            stmt.setString(2, cadenergiadao.getContaLuzValorTotal());
	            stmt.setString(3, cadenergiadao.getContaLuzDataVencimento());
	            stmt.setString(4, cadenergiadao.getContaLuzMes());
	            stmt.setString(5, cadenergiadao.getContaLuzEmissao());
	            stmt.setString(6, cadenergiadao.getContaLuzAnterior());
	            stmt.setString(7, cadenergiadao.getContaLuzAtual());
	            stmt.setString(8, cadenergiadao.getContaLuzDiasFaturamento());
	            stmt.setString(9, cadenergiadao.getContaLuzPrevisaoProximaLuz());
	            stmt.setString(10, cadenergiadao.getContaLuzAviso());


	            stmt.execute();
	            stmt.close();
	        } 
	        catch (SQLException u) { 
	            throw new RuntimeException(u);
	        } 
	      
	 }
	 

	        public List<CadastroEnegia> read(){
	        	
	        	connection  = new Conexao().getConnection();
	        	PreparedStatement stmt = null;
	        	ResultSet rs = null;
	        	
	        	List<CadastroEnegia> energiadao = new ArrayList<>();
	        	
	        	try {
	        		stmt = connection.prepareStatement("SELECT * FROM contaluz");
	        		rs = stmt.executeQuery();
	        		while (rs.next()) {
	        			CadastroEnegia cadenergia = new CadastroEnegia();
	        			cadenergia.setContaLuzID(rs.getString("ContaLuzID"));
	        			cadenergia.setContaLuzValorTotal(rs.getString("ContaLuzValorTotal"));
	        			cadenergia.setContaLuzDataVencimento(rs.getString("ContaLuzDataVencimento"));
	        			cadenergia.setContaLuzMes(rs.getString("ContaLuzMes"));
	        			cadenergia.setContaLuzEmissao(rs.getString("ContaLuzEmissao"));
	        			cadenergia.setContaLuzAnterior(rs.getString("ContaLuzAnterior"));
	        			cadenergia.setContaLuzAtual(rs.getString("ContaLuzAtual"));
	        			cadenergia.setContaLuzDiasFaturamento(rs.getString("ContaLuzDiasFaturamento"));
	        			cadenergia.setContaLuzPrevisaoProximaLuz(rs.getString("ContaLuzPrevisaoProximaLuz"));
	        			cadenergia.setContaLuzAviso(rs.getString("ContaLuzAviso"));
	        			cadenergia.add(energiadao);
	        		}	        			
	        	}
	        		
	        		catch (SQLException u) { 
	    	            throw new RuntimeException(u);
	    	        }

	        		return energiadao;
	        	
	        	
	        }
	        
	    } 
	    
	 