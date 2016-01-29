/**
 * BatchDemo.java
 * day4
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2016年1月7日 		Stone
 *
 * Copyright (c) 2016, TNT All Rights Reserved.
*/

package day4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import day2.util.DBconnection;

/**
 * ClassName:BatchDemo Function: 批量提交</br>
 * Reason:
 *
 * @author Stone
 * @version
 * @since Ver 1.1
 * @Date 2016年1月7日 下午4:03:12
 *
 * @see
 * 
 */
public class BatchDemo {

	public static void noneBatchUnsert() throws Exception {
		Connection connection = DBconnection.getConnection();
		String sql = "insert into battest(name) values(?)";
		long start = System.currentTimeMillis();
		//非批量处理的方式，在battest中插入200条记录
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		for (int i = 0; i <400; i++) {
			prepareStatement.setString(1, "java"+i);
			prepareStatement.executeUpdate();
			
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		connection.close();
		prepareStatement.close();
	}
	public static void BatchUnsert() throws Exception {
		Connection connection = DBconnection.getConnection();
		String sql = "insert into battest(name) values(?)";
		long start = System.currentTimeMillis();
		//非批量处理的方式，在battest中插入200条记录
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		for (int i = 0; i <400; i++) {
			prepareStatement.setString(1, "android"+i);
			prepareStatement.addBatch();
			
		}
		prepareStatement.executeBatch();
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		connection.close();
		prepareStatement.close();
	}

	public static void main(String[] args) throws Exception {
		noneBatchUnsert();
		BatchUnsert();
	}
}
