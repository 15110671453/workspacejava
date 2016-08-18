package com.bjrcic.test2;

import java.sql.DriverManager;

import java.sql.Connection;

public class ConnectionUtil {
	private String username;
	private String password;
	private String url;
	private String driver;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	public Connection getConnection()
	{
		try{
			Class.forName(driver);
			return DriverManager.getConnection(url,username,password);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}
	
	
}
