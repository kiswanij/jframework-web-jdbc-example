package com.app;

import com.jk.data.dataaccess.JKDataAccessFactory;
import com.jk.data.dataaccess.core.JKDataAccess;
import com.jk.web.embedded.JKWebApplication;

public class App {
	public static void main(String[] args) {
		JKDataAccess da = JKDataAccessFactory.getDataAccessService();
		if (!da.isTableExists("PERSON")) {
			da.runScript("/script.sql");
		}
		JKWebApplication.run(8080);
	}
}