package com.uob.aml.kyc.dao;

import java.sql.SQLException;
import java.util.List;
import com.uob.aml.kyc.model.AMLUser;

public interface AntiMoneyLaunderingDao {
	public List<AMLUser> getUsers();

}
