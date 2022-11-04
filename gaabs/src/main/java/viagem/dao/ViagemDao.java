package viagem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import viagem.model.viagem;

public class ViagemDao {
	public void cadastrarViagem(viagem viagem) {
		String sql = "INSERT INTO viagem VALUES (null,?,?,?,?,?,?)";
		PreparedStatement pStatement = null;
		Connection conn = null;
		try {
			conn = new ViagemMysqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setString(1, viagem.getDataIda());
			pStatement.setString(2, viagem.getDataVolta());
			pStatement.setString(3, viagem.getOrigem());
			pStatement.setString(4, viagem.getDestino());
			pStatement.setString(5, viagem.getFormaPagamento());
			pStatement.setFloat(6, viagem.getValorPago());		
			pStatement.execute();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pStatement != null) {
					pStatement.close();
				}
			}catch (Exception e2) {
				e2.printStackTrace();
			}
			
			try {
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
