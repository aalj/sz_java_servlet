/**
 * EmployeeManagement.java
 * employeeManagement
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月12日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package employeeManagement;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:EmployeeManagement Function: TODO ADD FUNCTION Reason: TODO ADD
 * REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月12日 上午9:50:17
 *
 * @see
 * 
 */
public class EmployeeManagement {
	static EmployeeManagement empman;
	/**
	 * 名字信息标识符
	 */
	final static int NAME_INT = 0;
	/**
	 * 年龄信息标识符
	 */
	final static int AGE_INT = 1;
	/**
	 * 员工编号标识符
	 */
	final static int ENO_INT = 2;
	/**
	 * 员工工资标识符
	 */
	final static int SALARY_INT = 3;
	static List<Employee> list = new ArrayList<>();
	private Employee checkEmp;
	

	private EmployeeManagement() {

	}

	public static EmployeeManagement getIns() {
		if (empman == null) {
			empman = new EmployeeManagement();
		}

		return empman;
	}

	/**
	 * 
	 * adEmp:(员工添加方法)
	 *
	 * @param @param
	 *            e
	 * @param @return
	 *            设定文件
	 * @return boolean 是否添加成功
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public boolean addEmp(Employee e) {
		boolean temp = true;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getEno().equals(e.getEno())) {
				//对是否有员工进行标识
				temp = false;
				return false;
			}
		}
		//根据标识为判断标识,然后决定是否添加list
		if (temp) {
			return list.add(e);//true
		}else{
			return false;
		}

	}

	/**
	 * 
	 * delEmp:(删除员工的方法)
	 *
	 * @param @param
	 *            eno
	 * @param @return
	 *            设定文件
	 * @return boolean 是否删除成功
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public   boolean delEmp(String eno) {
		//通过员工标号判断是否有该员工
		if (checkEmp(eno)!=null) {
			
			//遍历list集合
			for (int i = 0; i < list.size(); i++) {
				//判断员工号相等的员工
				if(list.get(i).getEno().equals(eno))
				{
					//移除员工
					list.remove(i);
					return true;
				}
			}
		}
		return false;
	}
	/**
	 * 
	 * checkEmp:(通过员工标号判断是否有该员工)
	 * TODO(这里描述这个方法的注意事项 – 可选)
	 *
	 * @param  @param eno
	 * @param  @return    设定文件
	 * @return Employee    查询到的员工
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	public Employee checkEmp(String eno){
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getEno().equals(eno))
			{
				return list.get(i);
			}
		}
		return null;
	}

	/**
	 * 
	 * reEmp:(修改员工信息)
	 * 
	 * @param 修改的信息标识
	 * @param eno
	 * @param @return
	 *            设定文件
	 * @return boolean DOM对象
	 * @throws MyException 
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public boolean reEmp(String eno, int a,String inf) throws MyException {
		Employee c;
		switch (a) {
		case NAME_INT://修改员工姓名
			c = checkEmp(eno);
			c.setName(inf);
			return true;
		case AGE_INT://修改员工年龄
			try {
				
				int parseInt = Integer.parseInt(inf);
				c = checkEmp(eno);
				c.setAge(parseInt);
				return true;
			} catch ( NumberFormatException e) {
				throw new MyException("输入的年龄应该全部是数字");
				//TODO
			}finally {
				return false;
			}
			
			
			
			
		case SALARY_INT://修改员工工资
			  c = checkEmp(eno);
			  try {
					
					double pa = Double.parseDouble(inf);
					c = checkEmp(eno);
					c.setSalary(pa);
					return true;
				} catch ( NumberFormatException e) {
					throw new MyException("输入的年龄应该全部是数字");
					//TODO
				}finally {
					return false;
				}
		case ENO_INT://修改员工编号
			  c = checkEmp(eno);
			  c.setEno(eno);
			return true;

		default:
			return false;
		}
	}

}
