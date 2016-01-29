/**
 * CollectionsDemo.java
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

package day11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * ClassName:CollectionsDemo
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月14日		下午2:43:07
 *
 * @see 	 

 */
public class CollectionsDemo {


	public static void main(String[] args) throws ParseException {
		List<Student> student = new ArrayList<>();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		student.add(new Student("ee", sdf.parse("1996-6-26")));
		student.add(new Student("dd", sdf.parse("1995-5-25")));
		student.add(new Student("aa", sdf.parse("1992-2-22")));
		student.add(new Student("cc", sdf.parse("1994-4-24")));
		student.add(new Student("bb", sdf.parse("1993-3-23")));
		System.out.println(student);
		//reverse 反转
		Collections.reverse(student);
		System.out.println(student);
		//shuffle 乱序
		Collections.shuffle(student);
		System.out.println(student);
		//
		Collections.sort(student);
		System.out.println(student);
		
		 List<Student> sstudent = Collections.synchronizedList(student);
		 
	}

}

