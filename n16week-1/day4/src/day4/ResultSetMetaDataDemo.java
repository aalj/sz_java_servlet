/**
 * Day5.java
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

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import day2.util.DBconnection;

/**
 * 
 * ClassName:ResultSetMetaDataDemo<br/>
 * 
 * Function: TODO ADD FUNCTION<br/>
 * 
 * Reason: TODO ADD REASON<br/>
 *
 * @author Stone
 * @version
 * @since Ver 1.1
 * @Date 2016 2016年1月7日 上午10:19:13
 *
 * @see
 */
public class ResultSetMetaDataDemo {
	public static void main(String[] args) throws Exception {
		// ResultSetMetaData的一些方法
		// 通过RuseilSet获得ResultSetMetaData对象，反过来知道ResultSet信息
		Connection connection = DBconnection.getConnection();
		String sql = "Select * from student ;";
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		ResultSet executeQuery = prepareStatement.executeQuery();
		ResultSetMetaData metaData = executeQuery.getMetaData();
		System.out.println(metaData.getColumnCount());
		System.out.println(metaData.getColumnType(5));
		System.out.println(metaData.getColumnTypeName(5));
		System.out.println(metaData.getColumnName(1));
		connection.close();
		prepareStatement.close();
		executeQuery.close();
	}

}
