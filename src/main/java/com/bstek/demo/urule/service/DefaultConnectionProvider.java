package com.bstek.demo.urule.service;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.stereotype.Service;

import com.bstek.urule.console.database.datasource.ConnectionProvider;

//@Service(ConnectionProvider.BEAN_ID)
public class DefaultConnectionProvider implements ConnectionProvider {

	@Override
	public Connection getConnection() {
		Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/urule?useUnicode=true&characterEncoding=UTF-8", "root",
                    "password");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
	}

}

