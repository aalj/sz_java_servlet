/**
 * DBconnection.java
 * day2.util
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2016年1月5日 		Stone
 *
 * Copyright (c) 2016, TNT All Rights Reserved.
*/

package day2.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.junit.Test;

/**
 * ClassName:DBconnection Function: 连接数据库 Reason: TODO ADD REASON
 *
 * @author Stone
 * @version
 * @since Ver 1.1
 * @Date 2016年1月5日 上午11:13:51
 *
 * @see
 * 
 */
public class DBconnection {
	@Test
	public static Connection getConnection() throws ClassNotFoundException, SQLException, IOException {
		// 从属性文件里面读取连接信息
		Properties p = new Properties();
		// InputStream inputStream =
		// DBconnection.class.getResourceAsStream("db.properties");
		p.load(DBconnection.class.getResourceAsStream("db.properties"));

		String driver = p.getProperty("driver");
		String url = p.getProperty("url");
		String name = p.getProperty("name");
		String pwd = p.getProperty("pwd");
		System.out.println(driver);

		// Class.forName("com.mysql.jdbc.Driver");
		// String url="jdbc:mysql://127.0.0.1:3306/school";
		// String user="root";
		// String password="woshi357+456";
		Connection connection = DriverManager.getConnection(url, name, pwd);

//		return null;
		return DriverManager.getConnection(url, name, pwd);
	}

}
