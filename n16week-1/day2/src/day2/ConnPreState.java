/**
 * ConnPreState.java
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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.mysql.fabric.xmlrpc.base.Data;

import day2.util.DBconnection;

/**
 * ClassName:ConnPreState Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone
 * @version
 * @since Ver 1.1
 * @Date 2016年1月5日 下午2:00:53
 *
 * @see
 * 
 */
public class ConnPreState {

	public static void updateStudent(int id) throws ClassNotFoundException, SQLException, ParseException, IOException {
		Connection conn = DBconnection.getConnection();
		String sql = "update student set name=? where id =?";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, "wanger");
		statement.setInt(2, id);

		statement.executeUpdate();
	}

	public static void saveStudent(String sno) throws ClassNotFoundException, SQLException, ParseException, IOException {
		// 1、获得链接数据库的谅解对象
		// 2、准备一个SQL语句
		// 3、获得PrepareStatement对象
		// 4、设置？的值
		// 5、执行SQL语句
		// 6、关闭资源
		Connection conn = DBconnection.getConnection();
		String sql = "insert into student (name,sno,password,birthday,sex,polity,brief) " + "values(?,?,?,?,?,?,?)";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, "张三");
		statement.setString(2, sno);
		statement.setString(3, "root");
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		Date date = sdf.parse("1991-02-02");
		statement.setDate(4, new java.sql.Date(date.getTime()));
		statement.setInt(5, 0);
		statement.setInt(6, 4);
		statement.setString(7, "张三张三张三张三张三张三");
		statement.executeUpdate();
		
		conn.close();
		statement.close();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException, IOException {
		updateStudent(2);
//		saveStudent("2012032519");
		Connection conn = DBconnection.getConnection();
		PreparedStatement statement2 = conn.prepareStatement("select * from student;");
		ResultSet executeQuery = statement2.executeQuery();
		
		
		while (executeQuery.next()) {
			//getXxx("列名")
			int id = executeQuery.getInt("id");
			String name = executeQuery.getString(2);
			String sno = executeQuery.getString(3);
			String pwd = executeQuery.getString(4);
			String bir = executeQuery.getString(5);
			int sex = executeQuery.getInt(6);
			int pol = executeQuery.getInt(7);
			String pp = executeQuery.getString(8);
			System.out.println(
					id + "\t" + name + "\t" + sno + "\t" + pwd + "\t" + bir + "\t" + sex + "\t" + pol + "\t" + pp);

		}
		conn.close();
		statement2.close();
		executeQuery.close();
	}
}
