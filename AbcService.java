package com.abc.service;

import java.sql.SQLException;

import com.abc.doa.AbcDoa;
import com.abc.model.AbcModel;

public class AbcService {
	
	public String register(AbcModel abc) throws SQLException {
		AbcDoa doa = new AbcDoa();
		return doa.register(abc);
	}

}
