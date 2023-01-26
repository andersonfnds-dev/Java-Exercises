package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {
	
	public static void main(String[] args) throws SQLException, IOException{
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "create table if not exists pessoas ( "
				+ "codigo int auto_increment primary key, "
				+ "nome varchar(80) not null "
				+ " )";
				
		
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		System.out.println("Comando efetuado com sucesso");
		conexao.close();
	}

}
