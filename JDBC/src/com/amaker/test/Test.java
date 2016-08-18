package com.amaker.test;

import java.sql.Connection;
import com.amaker.util.DBUtil;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class Test {
	
	public static void main (String[] args)
	{
		//写到主方法测试
		Test test=new Test();
		test.list();
	}
		public void list()
		{
			DBUtil util=new DBUtil();
			Connection con=util.getConnection();
			String sql="select * from user";
		
			
			try{
				Statement stmt =con.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				while(rs.next())
				{
					//可以用列索引 也可以用列名称
					String username=rs.getString(1);
					System.out.println(username);
				}
				
			}catch(SQLException e)
			{
				
			}
		}
	public static void create()
	{
		DBUtil util = new DBUtil();
		Connection conn = util.getConnection();
		try
		{
			Statement stmt = conn.createStatement();
			String sql=" create table user_tab(id int,name varchar(20),age int) ";
			stmt.execute(sql);
			//statement 从connection中获取一个stmt
			//执行数据定义语句 创建一个表 create table user_db;
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	
		
	}
	
	public static void add()
	{
		DBUtil util = new DBUtil();
		Connection conn = util.getConnection();
		try
		{
			Statement stmt = conn.createStatement();
			String sql=" insert into  user_tab (id ,name,age )values(1,'tom',20) ";
			stmt.executeUpdate(sql);
			//增删改 都是这个executeUpdate
			//statement 从connection中获取一个stmt
			//执行数据定义语句 创建一个表 create table user_db;
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	
		
	}
	
	public static void update()
	{
		DBUtil util = new DBUtil();
		Connection conn = util.getConnection();
		try
		{
			Statement stmt = conn.createStatement();
			String sql="update user_tab set name ='bigtom' where id =1";
			stmt.executeUpdate(sql);
			//statement 从connection中获取一个stmt
			//执行数据定义语句 创建一个表 create table user_db;
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	
		
	}
		//查询
	public static void query()
	{
		DBUtil util = new DBUtil();
		Connection conn = util.getConnection();
		try
		{
			Statement stmt = conn.createStatement();
			String sql="select id ,name from user_tab";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				int id = rs.getInt("id");
				int age = rs.getInt(3);
				String name = rs.getString("name");
						System.out.println(id+":"+name+":"+age);
			}
			//statement 从connection中获取一个stmt
			//执行数据定义语句 创建一个表 create table user_tab;
		}catch(SQLException e)
		{
			e.printStackTrace();
		}finally
		{
			
		}
	
		
	}
	
		
		
		
}
