package com.uob.aml.kyc.dao;

public interface LoginDao {
	public boolean validate(String username, String userpasswd);
}
