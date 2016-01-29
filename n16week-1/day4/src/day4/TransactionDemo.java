/**
 * TransactionDemo.java
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
 * ClassName:TransactionDemo
 * Function: JDBC的手动提交
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone
 * @version  
 * @since    Ver 1.1
 * @Date	 2016年1月7日		下午3:35:19
 *
 * @see 	 

 */
public class TransactionDemo {

	public static void main(String[] args) {
		Connection conn = DBconnection.getConnection();
		PreparedStatement pre  = null;
		try{
			String sql = "delete from student where id =1;";
			  pre = conn.prepareStatement(sql);
			pre.executeUpdate();
			//如果发生错误，进行回滚
			
			conn.commit();
		}catch(Exception e){
			try {
				conn.rollback();
			} catch (SQLException e1) {
				
				//
				e1.printStackTrace();
				
			}
			e.printStackTrace();
		}finally{
			try{
				if (conn != null)
					conn.close();
				if(pre!=null)pre.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}

