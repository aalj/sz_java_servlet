/**
 * Student.java
 * day11
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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName:Student Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月14日 下午2:43:53
 *
 * @see
 * 
 */
public class StudentTwo  {

	/**
	 * 学生姓名
	 */
	private String name;
	/**
	 * 学生年龄
	 */
	private int age;
	/**
	 *学生学号 
	 */
	private int studentNum;
	

	private Map<Course, List<Score>> stuInfo = new HashMap<Course, List<Score>>();
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
		stuInfo.put(course, list);
	};
	public void test(){
		StudentTwo stu = new StudentTwo("李华", 12, 45);
		stu.addScore(new Course("数学", new Score(1, 25)));
		stu.addScore(new Course("数学", new Score(2, 35)));
		stu.addScore(new Course("数学", new Score(3, 45)));
		stu.addScore(new Course("数学", new Score(4, 25)));
		
		stu.addScore(new Course("语文", new Score(1, 60)));
		stu.addScore(new Course("语文", new Score(2, 60)));
		stu.addScore(new Course("语文", new Score(3, 60)));
		stu.addScore(new Course("语文", new Score(4, 60)));
		
		stu.addScore(new Course("化学", new Score(1, 80)));
		stu.addScore(new Course("化学", new Score(2, 80)));
		stu.addScore(new Course("化学", new Score(3, 80)));
		stu.addScore(new Course("化学", new Score(4, 80)));
		
		stu.addScore(new Course("物理", new Score(1, 56)));
		stu.addScore(new Course("物理", new Score(2, 56)));
		stu.addScore(new Course("物理", new Score(4, 25)));
		stu.addScore(new Course("物理", new Score(3, 90)));
		
		stu.addScore(new Course("生物", new Score(1, 60)));
		stu.addScore(new Course("生物", new Score(1, 60)));
		stu.addScore(new Course("生物", new Score(2, 60)));
		stu.addScore(new Course("生物", new Score(3, 60)));
		stu.addScore(new Course("生物", new Score(4, 60)));
	}

	public String getName() {
		return name;
	}
	public StudentTwo(String name, int age, int studentNum) {
		this.name = name;
		this.age = age;
		this.studentNum = studentNum;
		this.stuInfo = stuInfo;
	}








}
