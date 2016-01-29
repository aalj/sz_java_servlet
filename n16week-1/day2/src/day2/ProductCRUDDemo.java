/**
 * ProductCRUDDemo.java
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
import java.sql.Statement;

import day2.util.DBconnection;

/**
 * ClassName:ProductCRUDDemo Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone
 * @version
 * @since Ver 1.1
 * @Date 2016年1月5日 下午4:46:47
 *
 * @see
 * 
 */
public class ProductCRUDDemo {
	static Connection conn = null;

	public static void statementInsertDemo() throws ClassNotFoundException, SQLException, IOException {
		conn = DBconnection.getConnection();
		String sql = "insert into product(pno,name,price,cate) values('212','海飞丝',20,1)";
		Statement statement = conn.createStatement();
		statement.executeUpdate(sql);
		conn.close();
		statement.close();
	}

	public static void statementUpdateDemo() throws ClassNotFoundException, SQLException, IOException {
		conn = DBconnection.getConnection();
		String sql = "update product set name='jiajieshi' where id= 1;";
		Statement statement = conn.createStatement();
		statement.executeUpdate(sql);
		conn.close();
		statement.close();
	}

	public static void statementDeleteDemo() throws ClassNotFoundException, SQLException, IOException {
		conn = DBconnection.getConnection();
		String sql = "delete from product where id =1;";
		Statement statement = conn.createStatement();
		statement.executeUpdate(sql);
		conn.close();
		statement.close();
	}

	public static void preparedStatementInsertDemo() throws ClassNotFoundException, SQLException, IOException {
		conn = DBconnection.getConnection();
		String sql = "insert into product(pno,name,price,cate) values(?,?,?,?)";
		PreparedStatement pre = conn.prepareStatement(sql);
		pre.setString(1, "213");
		pre.setString(2, "lishi");
		pre.setInt(3, 22);
		pre.setInt(4, 1);
		pre.executeUpdate(sql);
		conn.close();
		pre.close();
	}

	public static void preparedStatementUpdateDemo() throws ClassNotFoundException, SQLException, IOException {
		conn = DBconnection.getConnection();
		String sql = "update product set name='?' where id= ?;";
		PreparedStatement pre = conn.prepareStatement(sql);
		pre.setString(1, "xiugai");
		pre.setInt(2, 1);
		pre.executeUpdate(sql);
		conn.close();
		pre.close();
	}

	public static void preparedStatementDeleteDemo() throws ClassNotFoundException, SQLException, IOException {
		conn = DBconnection.getConnection();
		String sql = "delete from product where id =1;";
		PreparedStatement prepareStatement = conn.prepareStatement(sql);
		prepareStatement.executeUpdate(sql);
		conn.close();
		prepareStatement.close();
	}

	public static void preparedQueryDemo() throws ClassNotFoundException, SQLException, IOException {
		conn = DBconnection.getConnection();
		String sql = "select * from product";
		PreparedStatement prepareStatement = conn.prepareStatement(sql);
		ResultSet executeQuery = prepareStatement.executeQuery();
		while(executeQuery.next()){
			int id = executeQuery.getInt("id");
			String pno = executeQuery.getString("pno");
			String name = executeQuery.getString("name");
			int price = executeQuery.getInt("price");
			int cate = executeQuery.getInt("cate");
			System.out.println(id+"\t"+pno+"\t"+name+"\t"+price+"\t"+cate);
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// statementInsertDemo();
//		statementDeleteDemo();
		preparedQueryDemo();
	}
}







