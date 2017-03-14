package br.com.farmacia.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.farmacia.domain.Fornecedores;
import br.com.farmacia.factory.ConexaoFactory;

public class FornecedoresDAO {

	public void salvar(Fornecedores f) throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO forncedores  ");
		sql.append("(descricao)");
		sql.append("VALUES (?)");
		
		Connection conexao = ConexaoFactory.conectar();
	
		PreparedStatement comando = conexao.prepareStatement(sql.toString());	
		comando.setString(1, f.getDescricao());
		comando.executeUpdate();
	}
	
	public static void main(String[] args) {
		Fornecedores f1 = new Fornecedores();
		f1.setDescricao("desc 1");
		Fornecedores f2 = new Fornecedores();
		f2.setDescricao("desc 2");
		
		FornecedoresDAO dao = new FornecedoresDAO();
		try {
			dao.salvar(f1);
			dao.salvar(f2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
