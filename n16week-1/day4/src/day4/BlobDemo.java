/**
 * BlobDemo.java
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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import day2.util.DBconnection;

/**
 * 
 * ClassName:BlobDemo<br/>
 * 
 * Function:大文件的存取<br/>
 * 
 * Reason:	 TODO ADD REASON<br/>
 *
 * @author   Stone
 * @version  
 * @since    Ver 1.1
 * @Date	 2016	2016年1月7日		下午1:51:01
 *
 * @see
 */
public class BlobDemo {
//将一个图片文件插入到imgtest表img（blob）字段上
	public static void writeBlob() throws Exception{
		Connection connection = DBconnection.getConnection();
		//2.SQL语句，ingtest（id，name，img）
		String sql = "insert into imgtest (name ,img) values (?,?)";
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		prepareStatement.setString(1, "gequ");
		//"G:\SuZhou_Android\n16week-1\沙宝亮 - 最初的信仰 - 2013我是歌手第一季第十一期现场.ape"
//		File f= new File("G:\\aa.jpg");
//		InputStream ff = new FileInputStream(f);
		InputStream f = new FileInputStream("G:\\SuZhou_Android\\n16week-1\\沙宝亮 - 最初的信仰 - 2013我是歌手第一季第十一期现场.ape");
		prepareStatement.setBinaryStream(2, f);
		prepareStatement.executeUpdate();
		
		connection.close();
		prepareStatement.close();
		f.close();
	}
	
	//从imgetest表中的img字段上都出这个图片文件，另存为一个文件
	public static void readBlob() throws Exception{
		Connection connection = DBconnection.getConnection();
		String sql="select * from imgtest where id =?;";
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		prepareStatement.setInt(1, 1);
		ResultSet resultSet = prepareStatement.executeQuery();
		//6.处理查询结果，读出img字段中的数据，复制到另一个文件中
		if(resultSet.next()){
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			//特殊字段：img 数据类型blob
			//取出img字段上的值
			InputStream in = resultSet.getBinaryStream("img");
			System.out.println(id+","+name);
			FileOutputStream out = new FileOutputStream("G:\\aaa.ape");
			byte[] buf   = new byte[1024*1024];
			int  i = 0 ;
			while((i=in.read(buf))!=-1){
				out.write(buf,0,i);
			}
		}
		
	}
	public static void main(String[] args) throws Exception {
//		writeBlob();
		readBlob();
	}

}

