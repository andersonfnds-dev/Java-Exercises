package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	
	public static void main(String[] args) throws SQLException, IOException{
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Informe o nome: ");
		String nome = scnr.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "insert into pessoas (nome)"		//utilizando '?' como parâmetro, a inserção de dados se torna mais segura
				+ "values (?)";				
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome); 		//setando o stmt para string, não há risco de injeção de comando sql
		
		stmt.execute();
		
		System.out.println("Comando efetuado com sucesso");
		scnr.close();
	}

}
