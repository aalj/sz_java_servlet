/**
 * StudentMan.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月14日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName:StudentMan Function: 学生管理系统 Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月14日 下午6:05:57
 *
 * @see
 * 
 */
public class StudentMan {
	private static StudentMan stu;
	// 用来装学生信息，通过学号来一一对应
	private Map<Integer, Student> stuInfo = new HashMap<Integer, Student>();

	private StudentMan() {

		// TODO Auto-generated constructor stub

	}

	public static StudentMan getIns() {
		if (stu == null) {
			stu = new StudentMan();
		}

		return stu;
	}

	/**
	 * 
	 * addStudents:(向管理系统添加学生)
	 *
	 * @param @param
	 *            stu 传入学生对象
	 * @return void DOM对象
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public void addStudents(Student stu) {
		stuInfo.put(stu.getStudentNum(), stu);
	}

	/**
	 * 
	 * selectStu:(查询学生)
	 *
	 * @param @param
	 *            studentNum 学生的学号
	 * @param @return
	 *            设定文件
	 * @return Student DOM对象
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public Student selectStu(int studentNum) {
		return stuInfo.get(studentNum);
	}

	/**
	 * 
	 * getAllStu:(得到管理系统里面的全部学生)
	 * 
	 * @param @return
	 *            设定文件
	 * @return Map<Integer,Student> DOM对象
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public List<Student> getAllStu() {
		List<Student> list = new ArrayList<>();
		for (int a : stuInfo.keySet()) {
			list.add(stuInfo.get(a));
		}
		return list;
	}

	/**
	 * 
	 * selectCouName:(查询某个学生的所学的所有课程名字)
	 *
	 * @param 输入学生的学号
	 * @return
	 *            设定文件
	 * @return List<String> DOM对象
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public List<String> selectCouName(int studentNum) {
		// 建立list集合用于盛放学生的课程名
		// 通过selectStu方法在管理系统里面查询到该学生
		List<String > list = new ArrayList<>();
		Student selectStu = selectStu(studentNum);
		for (Course c : selectStu.getCou()) {
			list.add(c.getCouName());
		}
		return list;

	}

	/**
	 * 
	 * selectCouGrade:(查询某个学生的所学科目的全部成绩)
	 * <br/>
	 * (所学科目与selectCouName返回的list顺序一致)
	 * <p>
	 * map集合里面,<br/>
	 * key=1表示平时成绩<br/>
	 * key=2表示期中成绩<br/>
	 * key=3表示期末成绩<br/>
	 * key=4表示实习成绩<br/>
	 * key=5表示总评成绩<br/>
	 *
	 * @param @return
	 *            设定文件
	 * @return List<String> DOM对象
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public Map<Integer,List<Integer>> selectCouGrade(int studentNum) {
		// 建立list集合用于盛放学生的课程名
		Map<Integer,List<Integer>> map = new HashMap<>();
		// 通过selectStu方法在管理系统里面查询到该学生
		Student selectStu = selectStu(studentNum);
		for (int i = 0; i < 5; i++) {
			// 通过平时成绩得到学生的全部学习的课程的list集合,然后
			map.put(1,selectStu.getPingshiCou());
			map.put(2,selectStu.getQizhongCou());
			map.put(3,selectStu.getQimoCou());
			map.put(4,selectStu.getShixiCou());
			map.put(5, selectStu.getZongpingCou( ));
		}
		return map;

	}

}
