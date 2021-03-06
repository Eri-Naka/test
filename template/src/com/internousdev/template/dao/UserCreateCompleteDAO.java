package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;
import com.internousdev.template.util.DateUtil;

public class UserCreateCompleteDAO {
	private DateUtil dateUtil = new DateUtil();

	private String sql = "INSERT INTO login_user_transaction(login_id,login_pass,user_name,insert_date)VALUES(?,?,?,?)";

	public void createUser(String loginUserId,String loginUserPassword,String userName)throws

	SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		try{
			PreparedStatement preparedStatment = connection.prepareStatement(sql);
			preparedStatment.setString(1, loginUserId);
			preparedStatment.setString(2, loginUserPassword);
			preparedStatment.setString(3, userName);
			preparedStatment.setString(4, dateUtil.getDate());

			preparedStatment.execute();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}



}
