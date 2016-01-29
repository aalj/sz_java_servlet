/**
 * CallableDemo.java
 * day2
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2016年1月6日 		Stone
 *
 * Copyright (c) 2016, TNT All Rights Reserved.
*/

package day2;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import day2.util.DBconnection;

/**
 * ClassName:CallableDemo
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone
 * @version  
 * @since    Ver 1.1
 * @Date	 2016年1月6日		上午9:51:31
 *
 * @see 	 

 */
public class CallableDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
//		getnamebysno(in 学号，out 姓名)
		Connection connection = DBconnection.getConnection();
		String sql = "{call getnamebysno(?,?)}";
		
		CallableStatement call = connection.prepareCall(sql);
		//设置参数，in类型  out 先注册 然后再取值
		
		call.setString(1, "1");
		call.registerOutParameter(2, Types.VARCHAR);
//		call.setString(2, "@name");
		//执行过程
		call.execute();
		//取出out类型的的值
		
		String string = call.getString(2);
		System.out.println(string );
		
		
		
		
		
		
		
		
	}

}

