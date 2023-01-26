package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	
	private Connection conexao;
	
	public int incluir(String sql, Object... atributos ) throws IOException {
		try {
			PreparedStatement stmt = getConexao()
					.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			if(stmt.executeUpdate() >0) {
				ResultSet resultado = stmt.getGeneratedKeys();
				
				if(resultado.next()) {
					return resultado.getInt(1);
				}
			}
			
			return -1;
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	private void adicionarAtributos(PreparedStatement stmt, Object[] atributos) throws SQLException {
		
		int indice = 0;
		for (Object object : atributos) {
			if(object instanceof String) {
				stmt.setString(indice, (String) object);
			} else if(object instanceof Integer) {
				stmt.setInt(indice, (Integer) object);
			}
			
			indice++;
		}
	}
	
	private Connection getConexao() throws IOException {
		try {
			if(conexao != null && !conexao.isClosed()) {
				return conexao;
			}
		} catch (SQLException e) {
			
		}
		
		conexao = FabricaConexao.getConexao();
		return conexao;
		
	}

}
