package com.ben11.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.uob.aml.kyc.util.DBConnection;

public class TestDBConnection {

	public static void main(String[] args) throws SQLException {
		DBConnection db = new DBConnection();
		Connection connection = db.getConnection();
		connection.close();
	}

}
