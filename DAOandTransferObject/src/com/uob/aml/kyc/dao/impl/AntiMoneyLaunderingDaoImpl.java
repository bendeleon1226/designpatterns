package com.uob.aml.kyc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.uob.aml.kyc.dao.AntiMoneyLaunderingDao;
import com.uob.aml.kyc.model.AMLUser;
import com.uob.aml.kyc.util.DBConnection;

public class AntiMoneyLaunderingDaoImpl implements AntiMoneyLaunderingDao {
	public List<AMLUser> getUsers() {
		List<AMLUser> userList = new ArrayList<AMLUser>();
		try {
			DBConnection db = new DBConnection();
			Connection connection = db.getConnection();
			
			String selectSQL = "SELECT id, username, first_name, last_name, email FROM aml_users";
			PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
			ResultSet rs = preparedStatement.executeQuery(selectSQL );
			while (rs.next()) {
				AMLUser amluser = new AMLUser();
				amluser.setId(rs.getInt("ID"));
				amluser.setUsername(rs.getString("USERNAME"));
				amluser.setFirstName(rs.getString("FIRST_NAME"));
				amluser.setLastName(rs.getString("LAST_NAME"));
				amluser.setEmail(rs.getString("EMAIL"));
				userList.add(amluser);
			}
			rs.close();
			preparedStatement.close();
			connection.close();
		} catch (SQLException se){
			se.printStackTrace();
		}
		return userList;
	}
}
