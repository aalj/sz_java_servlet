/**
 * ResultSetDemo.java
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
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import day2.util.DBconnection;

/**
 * ClassName:ResultSetDemo
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone
 * @version  
 * @since    Ver 1.1
 * @Date	 2016年1月7日		上午11:05:02
 *
 * @see 	 

 */
public class ResultSetDemo {

	public static void main(String[] args) throws Exception  {
		//获得可滚动可更新的ResultSet
		//通过这个ResultSet对象，可以做增删改操作
		//获得链接对象
		Connection connection = DBconnection.getConnection();
		String sql = "select * from student;";
		PreparedStatement pre = connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
		//得到可滚动可更新的ResultSet
		ResultSet rs = pre.executeQuery();
		//移动到第四行
		rs.absolute(3);
		System.out.println(rs.getString("name"));
		//删除当前行
//		rs.next();
//		rs.deleteRow();
		//修改数据
//		rs.updateString("name","res" );
//		//提交
//		rs.updateRow();
//		System.out.println(rs.getString("name"));
		
		//插入新行，移动到插入行
		//填每一列数据
		rs.moveToInsertRow();
		rs.updateString("name", "inhang");
		rs.updateString("sno", "2114");
		rs.updateInt("sex", 1);
		rs.updateString("password", "4589");
		rs.updateInt("polity", 1);
		rs.updateDate("birthday", new java.sql.Date(new java.util.Date().getTime()));
		rs.updateString("brief", "afsdfasdfasdfasdfas");
		
		rs.insertRow();
		rs.moveToCurrentRow();
		
		
		
		
		
		
		
		
		connection.close();
		pre.close();
		rs.close();
	}

}

