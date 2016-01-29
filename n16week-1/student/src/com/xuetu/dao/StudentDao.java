/**
 * StydentDao.java
 * com.xuetu.dao
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2016年1月6日 		Stone
 *
 * Copyright (c) 2016, TNT All Rights Reserved.
*/

package com.xuetu.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xuetu.entity.Student;
import com.xuetu.util.DBconnection;

/**
 * ClassName:StydentDao Function: 关键类</br>
 * Reason: 与数据库有关的代码写在此处
 *
 * @author Stone
 * @version
 * @since Ver 1.1
 * @Date 2016年1月6日 上午10:57:27
 *
 * @see
 * 
 */
public class StudentDao {
	// 详细设计：需要什么样的方法，有需求决定
	/**
	 * 
	 * save:(保存学生信息的方法)<br/>
	 *
	 * @param @param
	 *            student 设定文件
	 * @return void DOM对象
	 * @throws SQLException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public void save(Student student) {
		Connection conn = null;
		PreparedStatement pre = null;
		try {
			conn = DBconnection.getConnection();
			String sql = " insert into student(name,sno,password,sex,polity,birthday,brief) values(?,?,?,?,?,?,?)";
			pre = conn.prepareStatement(sql);
			pre.setString(1, student.getName());
			pre.setString(2, student.getSno());
			pre.setString(3, student.getPassword());
			pre.setInt(4, student.getSex());
			pre.setInt(5, student.getPolity());

			// util 的Date转换成 sql 的Date
			pre.setDate(6, new java.sql.Date(student.getBirthday().getTime()));
			pre.setString(7, student.getBrief());
			pre.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (pre != null) {
					pre.close();
				}
			} catch (SQLException e) {

				//
				e.printStackTrace();

			}
		}

	}

	

	/**
	 * 
	 * getStudentById:(根据主键获得学生信息)<br/>
	 *
	 * @param 设定文件
	 * @return void DOM对象
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public Student getStudentById(int id) {
		try {
			Connection conn = DBconnection.getConnection();
			String sql="select * from student where id = ?";
			PreparedStatement pre = conn.prepareStatement(sql);
			pre.setInt(1, id);
			ResultSet query = pre.executeQuery();
			Student  s= new Student ();
			if(query.next()){
				s.setName(query.getString("name"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			
		}
		// TODO
		return null;
	}

	/**
	 * 
	 * update:(修改学生信息)<br/>
	 *
	 * @param @param
	 *            student 设定文件
	 * @return void DOM对象
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public void update(Student student) {

	}

	/**
	 * 
	 * delStudent:(删除学生)<br/>
	 *
	 * @param id
	 *            设定文件
	 * @return void DOM对象
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public void delStudent(List<Integer> id) {

	}
	
	
	/**
	 * 根据学好找到这个学生
	 * getStudentBySno:(根据学好找到这个学生)<br/>
	 *
	 * @param  @return    设定文件
	 * @return Student    DOM对象
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
		public Student  getStudentBySno(String sno){
			
			return null;
		}
		
		
		public List<Student> getOagedStudents(int page,int num){
			
			List<Student> list = null;
			Connection conn  = null;
			PreparedStatement pre = null;
			try {
				list = new ArrayList<>();
				conn = DBconnection.getConnection();
				String sql = "select * from student limit ?,?";
				pre = conn.prepareStatement(sql);
				pre.setInt(1, (page-1)*num);
				pre.setInt(2, num);
				ResultSet que = pre.executeQuery();
				Student s= null;
				while(que.next()){
					s= new Student();
					s.setId(que.getInt("id"));
					s.setName(que.getString("name"));
					s.setSno(que.getString("sno"));
					s.setPassword(que.getString("password"));
					s.setSex(que.getInt("sex"));
					s.setBirthday(que.getDate("birthday"));
					s.setBrief(que.getString("brief"));
					s.setPolity(que.getInt("polity"));
					list.add(s);
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				try{
					
				if(conn!=null)conn.close();
				if(pre!=null)pre.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			return list;
		}
		

}
