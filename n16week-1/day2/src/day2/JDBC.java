/**
 * JDBC.java
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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * ClassName:JDBC
 * Function: 连接数据库
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone
 * @version  
 * @since    Ver 1.1
 * @Date	 2016年1月5日		上午9:03:36
 *
 * @see 	 

 */
public class JDBC {
	public static final String url = "jdbc:mysql://127.0.0.1:3306/school";
	public static final String name = "com.mysql.jdbc.Driver";
	public static final String user = "root";
	public static final String pwd = "woshi357+456";
	
	public Connection conn;
	public static PreparedStatement pre;
	public JDBC(String sql) {  
        try {  
            Class.forName(name);//指定连接类型  
            conn = DriverManager.getConnection(url, user, pwd);//获取连接  
            pre = conn.prepareStatement(sql);//准备执行语句  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  

    public void close() {  
        try {  
            this.conn.close();  
            this.pre.close();  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
    }  
	
	public static void main(String[] args) {
		JDBC jd = new JDBC("select * from student;");
		System.out.println(pre);
	}
	
	
}


