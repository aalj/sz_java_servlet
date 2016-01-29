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
public class StudentManTwo {
	private static StudentManTwo stu;
	// 用来装学生信息，通过学号来一一对应
	private Map<Course, List<Score>> stuInfo = new HashMap<Course, List<Score>>();

	private StudentManTwo() {

		// TODO Auto-generated constructor stub

	}

	public static StudentManTwo getIns() {
		if (stu == null) {
			stu = new StudentManTwo();
		}

		return stu;
	}

	public void addScore(Course course) {
		// 判断map集合中是否存在这门课程,不存在需要重建List集合存放成绩,
		// 存在就讲成绩添加到元List集合中
		List<Score> list;
		if (stuInfo.containsKey(course.getCouName() )) {
			list = stuInfo.get(course.getCouName());
		}else{
			list = new ArrayList<>();
		}
		list.add(course.getScore());
	}

 




}
