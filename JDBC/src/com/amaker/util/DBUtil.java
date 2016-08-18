
package com.amaker.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DBUtil {
	public  static void main(String[] args)
	{
		//主方法测试
		DBUtil tool= new DBUtil();
		Connection con= tool.getConnection();
		System.out.println(con);
	}
	public Connection getConnection()
	{
		try{
			//注册数据库驱动Driver是类的名称
			Class.forName ("com.mysql.jdbc.Driver") ;
			   //建立数据库连接
	        //参数一：协议jdbc：子协议mysql//地址：端口/数据库名称,参数二：用户名，参数三：密码
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc_db", "root", "dyn123456");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public void closeConnection(Connection con)
	{
	
			if(con!=null)
			{
				try
				{
					con.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
	
		
	}
}
