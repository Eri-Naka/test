package endodao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import endodto.EndoDTO;
import endoutil.EndoDBC;

public class EndoDAO {

	public List<EndoDTO> selectAll(){

		EndoDBC dbConnecotr = new EndoDBC();
		Connection connection = dbConnecotr.getConnection();

		String sql = "select * from shop";

		List<EndoDTO> list = new ArrayList<EndoDTO>();

		try{
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			ResultSet resultset = preparedstatement.executeQuery();

			while (resultset.next()) {
				EndoDTO dto = new EndoDTO();

				dto.setItemname(resultset.getString("item_name"));
				dto.setPrice(resultset.getInt("price"));

				list.add(dto);
			}

		}catch (SQLException e){
			e.printStackTrace();
		}
		try{
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;

	}
}
