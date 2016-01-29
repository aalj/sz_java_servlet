/**
 * HibernateToolTest.java
 * day18.annotation
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月28日 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day18.annotation;
/**
 * ClassName:HibernateToolTest
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月28日		下午2:14:02
 *
 * @see 	 

 */
public class HibernateToolTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		

	
	Student s = new Student();
	String tableName = HibernateTool.getTableName(s);
	
	System.out.println("Student类对应的表名"+tableName);
	Teacher t= new Teacher();
	  tableName = HibernateTool.getTableName(t);
	System.out.println("Teacher类对应的表名"+tableName);
	//测试代码
	String columnName = HibernateTool.getColumnName(s, "name");
	System.out.println("对应表名是\t"+columnName);
	}
}

