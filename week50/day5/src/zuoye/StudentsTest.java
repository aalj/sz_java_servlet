/**
 * StudentsTest.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月12日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:StudentsTest Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月12日 上午9:36:29
 *
 * @see
 * 
 */
public class StudentsTest {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Tom", 18, 100, "class05"));
		list.add(new Student("Jerry", 22, 70, "class04"));
		list.add(new Student("Owen", 25, 90, "class05"));
		list.add(new Student("Jim",30,80 , "class05"));
		list.add(new Student("Steve", 28, 66, "class06"));
		list.add(new Student("Kevin", 24, 100, "class04"));
		System.out.println("计算学生的平均年龄");
		System.out.println(aveAge(list));
		System.out.println("计算学生的平均成绩");
		System.out.println(aveScores(list));
		
	}
	/**
	 * 
	 * aveAge:(计算list<Student>学生的平均年龄)
	 * @param  @return    设定文件
	 * @return double    平均年龄
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	public static double aveAge(List<Student> list){
		double temp = 0;
		double aveage = 0;
		
		for (int i = 0; i < list.size(); i++) {
			temp+=list.get(i).getAge();
		}
		
		aveage=temp/list.size();
		
		
		
		
		return aveage;
	}
	/**
	 * 
	 * aveScores:(计算list<Student>学生的平均成绩)
	 *
	 * @param  @return    设定文件
	 * @return double   平均成绩
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	public static double aveScores(List<Student> list){
		double temp = 0;
		double aveS = 0;
		
		for (int i = 0; i < list.size(); i++) {
			temp+=list.get(i).getScore();
		}
		
		aveS=temp/list.size();
		return aveS;
	}
}


class Student {
	private String name;
	private int age;
	public Student(String name, int age, double score, String classNum) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
		this.classNum = classNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getClassNum() {
		return classNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	private double score;
	private String classNum;

}
