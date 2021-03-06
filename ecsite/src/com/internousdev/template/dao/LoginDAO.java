package com.internousdev.template.dao;

import java.sql.Connection; /*JDBCによるDBの接続*/
import java.sql.PreparedStatement;/*SQL文を編集したり実行したりする表す*/
import java.sql.ResultSet;/*sqlの実行結果をJAVAベースの戻り値で返す*/

import com.internousdev.template.dto.LoginDTO;
import com.internousdev.template.util.DBConnector;

public class LoginDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private LoginDTO loginDTO = new LoginDTO();

	public LoginDTO getLoginUserInfo(String loginUserId, String loginPassword){


		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();/* データベースとの接続 DAOクラスでは絶対やる*/
		LoginDTO loginDTO = new LoginDTO();
		String sql = "SELECT * FROM login_user_transaction where login_id = ? AND login_pass = ?";
						/* 指定したテーブルからデータを引っ張り出す */


		try{		/*通常実行される文*/
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, loginUserId);	/*sqlのデータをjavaで使えるように変換*/
			preparedStatement.setString(2, loginPassword);	/*sqlのデータをjavaで使えるように変換*/

			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()){
				loginDTO.setLoginId(resultSet.getString("login_id"));
				loginDTO.setLoginPassword(resultSet.getString("login_pass"));
				loginDTO.setUserName(resultSet.getString("user_name"));

				if(!(resultSet.getString("login_id").equals(null))){
					loginDTO.setLoginFlg(true);
				}
			}
	}catch(Exception e){	/* 例外発生時に実行するされる文 */
		e.printStackTrace();
	}
		return loginDTO;

	}

	public LoginDTO getLoginDTO(){
		return loginDTO;
	}
}
