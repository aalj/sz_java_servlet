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

import java.util.Date;
import java.util.List;

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
public class Student implements Comparable<Student> {
	private List<Course> cou;
	public List<Course> getCou() {
		return cou;
	}

	public void setCou(List<Course> cou) {
		this.cou = cou;
	}

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
	/**
	 * 学生平时成绩
	 */
	private List<Integer> pingshiCou;
	/**
	 * 学生期中成绩
	 */
	private List<Integer> qizhongCou;
	/**
	 * 学生实习成绩
	 */
	private List<Integer> shixiCou;
	/**
	 * 学生期末成绩
	 */
	private List<Integer> qimoCou;
	/**
	 * 学生总评成绩
	 */
	private List<Integer> zongpingCou;

	public List<Integer> getPingshiCou() {
		return pingshiCou;
	}

	public List<Integer> getQizhongCou() {
		return qizhongCou;
	}

	public List<Integer> getShixiCou() {
		return shixiCou;
	}

	public List<Integer> getQimoCou() {
		return qimoCou;
	}

	public String getName() {
		return name;
	}
	/**
	 * 
	 * getZongpingCou:(计算学生每一科的总评成绩)
	 *
	 * @param  @return    设定文件
	 * @return double    DOM对象
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	public List<Integer> getZongpingCou() {
		//平时所有科目的成绩
		List<Integer> p1 = this.getPingshiCou();
		//期末所有科目成绩的
		List<Integer> qimoCou2 = this.getQimoCou();
		//期中所有科目成绩
		List<Integer> qizhongCou2 = this.getQizhongCou();
		//实习的所有科目成绩
		List<Integer> shixiCou2 = this.getShixiCou();
//		Course c =null;
		for (int i=0;i<p1.size();i++) {
//				c = new Course();
//				c.setCouName(cou.get(i).getCouName());//对总评学科名字进行赋值
				int a = ((p1.get(i)+//得到一科的平时成绩
						qimoCou2.get(i)+//得到期末成绩
						qizhongCou2.get(i)+//得到期中成绩
						shixiCou2.get(i))/4);//得到实习成绩 同时球平均值
				
				zongpingCou.add(a);
				
		}
		return zongpingCou;
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

	/**
	 * 
	 * addCou:(对每个学生的成绩进行填写,)
	 *
	 * @param pingshiCou
	 *            学生的品势成绩
	 * @param qizhongCou
	 *            学生的期中成绩
	 * @param shixiCou
	 *            学生的实习成绩
	 * @param qimoCou
	 *            学生的期末成绩
	 * @return void DOM对象
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public void addCouG(List<Integer> pingshiCou, List<Integer> qizhongCou,
			List<Integer> shixiCou, List<Integer> qimoCou) {
		this.pingshiCou = pingshiCou;
		this.qizhongCou = qizhongCou;
		this.shixiCou = shixiCou;
		this.qimoCou = qimoCou;
		
		
	}

	public Student(String name, int age, int studentNum,List<Course> cou) {
		super();
		this.name = name;
		this.age = age;
		this.studentNum = studentNum;
		this.cou = cou;
		

	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {

		return age - (o.getAge());

	}

}
