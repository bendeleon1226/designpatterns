package com.ben11.test;

import java.util.List;

import com.uob.aml.kyc.dao.AntiMoneyLaunderingDao;
import com.uob.aml.kyc.dao.impl.AntiMoneyLaunderingDaoImpl;
import com.uob.aml.kyc.model.AMLUser;

public class TestUserQuery {

	public static void main(String[] args) {
		AntiMoneyLaunderingDao amldao = new AntiMoneyLaunderingDaoImpl();
		List<AMLUser> userList = amldao.getUsers();
		for(AMLUser amluser: userList){
			System.out.println("ID: " + amluser.getId());
			System.out.println("Username: " + amluser.getUsername());
			System.out.println("First Name: " + amluser.getFirstName());
			System.out.println("Last Name: " + amluser.getLastName());
			System.out.println("Email: " + amluser.getEmail());
			System.out.println();
		}
	}

}
