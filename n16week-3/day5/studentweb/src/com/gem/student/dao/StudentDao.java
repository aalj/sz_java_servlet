package com.gem.student.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gem.student.entity.Student;
import com.gem.student.util.DBConnection;


//关键类：与数据库有关的代码都写在此处
public class StudentDao {
	//详细设计，需要什么样的方法，由需求确定
	//保存学生信息的方法,
	public void save(Student student)  {
		Connection conn = null;
		PreparedStatement prep = null;
		try {
			//1、联数据库
			conn = DBConnection.getConnection();
			//2、SQL语句
			String sql = "insert into student("+
					"name,sno,password,sex,polity,birthday,brief) "
					+" values(?,?,?,?,?,?,?) ";
			//3、获得PreparedStatement对象
			prep = conn.prepareStatement(sql);
			//4、设置？的值
			prep.setString(1,student.getName());
			prep.setString(2, student.getSno());
			prep.setString(3, student.getPwd());
			prep.setInt(4, student.getSex());
			prep.setInt(5, student.getPolity());
			//student.getBirthday();  java.util.Data
			prep.setDate(6, 
					new java.sql.Date(student.getBirthday().getTime()));
			
			prep.setString(7, student.getBrief());
			//5、执行SQL语句
			prep.executeUpdate();
		}catch(Exception e) {
			//一定要处理异常，异常的信息要存在日志文件
			//转化为你应用程序的异常，再抛出
			throw new RuntimeException(e);
		}
		finally{
			//6、关闭资源
			try {
				if(prep!=null) prep.close();
				if(conn!=null) conn.close();
			}catch(Exception e) {
				throw new RuntimeException(e);
			}
		}
	}
	
	//根据主键获得学生信息
	public Student getStudentByID(int id)  {
		
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs = null;
		try {
			//1、联数据库
			conn = DBConnection.getConnection();
			//2、SQL语句
			//2、
			String sql = "select * from student where id=?";
			//3、
			prep = conn.prepareStatement(sql);
			//4、
			prep.setInt(1,id);
			//5、执行SQL语句
			rs = prep.executeQuery();
			//6、处理查询结果
			//创建一个学生对象
			Student s = new Student();
			// 取到数据 ==》 装到一个学生对象中
			if(rs.next()) {
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setSno(rs.getString("sno"));
				s.setPwd(rs.getString("password"));
				s.setSex(rs.getInt("sex"));
				s.setPolity(rs.getInt("polity"));
				//java.util.Date  java.sql.Date
				s.setBirthday(rs.getDate("birthday"));
				s.setBrief(rs.getString("brief"));
			}
			return s;
		}catch(Exception e) {
			//一定要处理异常，异常的信息要存在日志文件
			//转化为你应用程序的异常，再抛出
			throw new RuntimeException(e);
		}
		finally{
			//6、关闭资源
			try {
				if(prep!=null) prep.close();
				if(conn!=null) conn.close();
				if(rs!=null) rs.close();
			}catch(Exception e) {
				throw new RuntimeException(e);
			}
		}
		
		
		
		
		
		
	}
	//修改,作业
	public void update(Student s) {
		
	}
	
	//删除学生,批量删除,作业
	//删除学生,批量删除  int[] id = {3,5,9,8};
    // delete from student where id in (3,5,9,8);
	//将数组 转换 为 in语法要求的格式
	public void delete(int[] id) {
		String sql = "delete from student where id in(";
		for(int i=0;i<id.length;i++) {
			sql = sql + id[i];
			if(i<id.length-1) {
				sql += ",";
			}
		}
		sql += ")";
		System.out.println(sql);
		
	} 
	//获得所有学生对象
	public List<Student>   getAll() {
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs = null;
		List<Student> students = new ArrayList<Student>();
		try {
			//1、联数据库
			conn = DBConnection.getConnection();
			//2、SQL语句
			String sql = "select * from student";
			//3、获得PreparedStatement对象
			prep = conn.prepareStatement(sql);
			//4、设置？的值
			
			//5、执行SQL语句
			rs = prep.executeQuery();
			//6、处理查询结果，			
			while(rs.next()) {
				//对每一条记录，==》转换为一个新的学生对象
				Student s = new Student();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setSno(rs.getString("sno"));
				s.setPwd(rs.getString("password"));
				s.setSex(rs.getInt("sex"));
				s.setPolity(rs.getInt("polity"));
				//java.util.Date  java.sql.Date
				s.setBirthday(rs.getDate("birthday"));
				s.setBrief(rs.getString("brief"));
				//将学生对象加到集合中
				students.add(s);
			}
		}catch(Exception e) {
			//一定要处理异常，异常的信息要存在日志文件
			//转化为你应用程序的异常，再抛出
			throw new RuntimeException(e);
		}
		finally{
			//6、关闭资源
			try {
				if(rs!=null) rs.close();
				if(prep!=null) prep.close();
				if(conn!=null) conn.close();
			}catch(Exception e) {
				throw new RuntimeException(e);
			}
		}
		return students;
	}
	
	
	//根据学号找到这个学生对象
	//如果学生没有，返回null
	public Student getStudentBySno(String sno) {
		return null;
	}
	
	
	//分页查询,显示是第几页curPage，每页显示的记录个数pageSize
	//select * from student limit ?,?
	// 第3页,每页4条记录
	//select * from student limit 8,4;
	//? 值是多少 
	//? 值是多少
	public List<Student> getPagedStudents(int curPage,int pageSize) {
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs = null;
		List<Student> students = new ArrayList<Student>();
		try {
			//1、联数据库
			conn = DBConnection.getConnection();
			//2、SQL语句
			String sql = "select * from student limit ?,?";
			//3、获得PreparedStatement对象
			prep = conn.prepareStatement(sql);
			//4、设置？的值
			prep.setInt(1,(curPage-1)*pageSize);
			prep.setInt(2, pageSize);
			//5、执行SQL语句
			rs = prep.executeQuery();
			//6、处理查询结果，			
			while(rs.next()) {
				//对每一条记录，==》转换为一个新的学生对象
				Student s = new Student();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setSno(rs.getString("sno"));
				s.setPwd(rs.getString("password"));
				s.setSex(rs.getInt("sex"));
				s.setPolity(rs.getInt("polity"));
				//java.util.Date  java.sql.Date
				s.setBirthday(rs.getDate("birthday"));
				s.setBrief(rs.getString("brief"));
				//将学生对象加到集合中
				students.add(s);
			}
		}catch(Exception e) {
			//一定要处理异常，异常的信息要存在日志文件
			//转化为你应用程序的异常，再抛出
			throw new RuntimeException(e);
		}
		finally{
			//6、关闭资源
			try {
				if(rs!=null) rs.close();
				if(prep!=null) prep.close();
				if(conn!=null) conn.close();
			}catch(Exception e) {
				throw new RuntimeException(e);
			}
		}
		return students;
	}
	
	
	//模糊查询
	public List<Student> getStudentsByName(String name) {
		return null;
	}
	//获得所有学生和个数
	public int getCount() {
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs = null;
		int count = 0;
		try {
			//1、联数据库
			conn = DBConnection.getConnection();
			//2、SQL语句
			String sql = "select count(*) c from student ";
			//3、获得PreparedStatement对象
			prep = conn.prepareStatement(sql);
			//4、设置？的值
			//5、执行SQL语句
			rs = prep.executeQuery();
			//6、处理查询结果，			
			if(rs.next()) {
				count = rs.getInt("c");
			}
		}catch(Exception e) {
			//一定要处理异常，异常的信息要存在日志文件
			//转化为你应用程序的异常，再抛出
			throw new RuntimeException(e);
		}
		finally{
			//6、关闭资源
			try {
				if(rs!=null) rs.close();
				if(prep!=null) prep.close();
				if(conn!=null) conn.close();
			}catch(Exception e) {
				throw new RuntimeException(e);
			}
		}
		return count;
	}
	
	

}
