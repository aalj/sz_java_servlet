/**
 * ConnectionDemo.java
 * day2
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2016年1月5日 		Stone
 *
 * Copyright (c) 2016, TNT All Rights Reserved.
*/

package day2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.corba.se.impl.ior.GenericTaggedComponent;

import day2.util.DBconnection;

/**
 * ClassName:ConnectionDemo
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone
 * @version  
 * @since    Ver 1.1
 * @Date	 2016年1月5日		上午10:13:14
 *
 * @see 	 

 */
public class ConnectionDemo {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		//连接MYSQL数据库
		//1、注册驱动程序
		//2、
		
//		createStatement--executeUpdate 用于操纵数据表  executeQuery用于查询数据表
//		prepareStatement--executeUpdate 用于操纵数据表  executeQuery用于查询数据表
//		
		
		Connection conn = DBconnection.getConnection();
		Statement statement = DBconnection.getConnection().createStatement();
//		statement.executeUpdate("insert into battest (name) values('weizhi2');");
		//executeUpdate 执行修改的修改的语句 增删改
		//删除数据
//		statement.executeUpdate("delete from battest where id =3;");
		//修改数据
		statement.executeUpdate("alter table student modify sno varchar(50) unique;");
		PreparedStatement pre = conn.prepareStatement("select* from battest;");
//		pre.executeUpdate("insert into battest (name) values('位置3');");
		ResultSet executeQuery = pre.executeQuery();
		
		while (executeQuery.next()) {
			int id =executeQuery.getInt(1);
			String name =executeQuery.getString(2);
			System.out.println(id+"\t"+name);
		}
		
		
		
		conn.close();
		pre.close();
		
		
	}

}

