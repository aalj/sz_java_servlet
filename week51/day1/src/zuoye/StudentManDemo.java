/**
 * StudentManDemo.java
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
import java.util.List;
import java.util.Set;

import java.util.TreeSet;

/*
 * 1）列出某个学生的所有成绩；
2）列出某门课程每个学生的总评成绩，及所有学生总评成绩的总评分；
3）分区段统计某门课程的学生总评成绩，例如60 分以下的学生人数、60 至70 分的学生人数等。

 */
/**
 * ClassName:StudentManDemo
 * Function:学生成绩管理系统测试类
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月14日		下午6:17:59
 *
 * @see 	 

 */
public class StudentManDemo {

	public static void main(String[] args) {
		//想系统里面添加学生,以及学生的成绩
		StudentMan ins = StudentMan.getIns();
		System.out.println("列出某个学生的所有成绩");
		System.out.println(ins.selectCouName(1));
		System.out.println(ins.selectCouGrade(1));
		

	}
	
	

}

