package com.app;

import com.jk.db.dataaccess.core.JKDataAccessService;
import com.jk.db.datasource.JKDataAccessFactory;
import com.jk.web.embedded.JKWebApplication;

public class App {
	public static void main(String[] args) {
		JKDataAccessService da = JKDataAccessFactory.getDataAccessService();
		if (!da.isTableExists("person")) {
			da.runScript("/script.sql");
		}
		JKWebApplication.run(8080);
	}
}