/**
 * EmployeeTest.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月7日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

/*
 * 3、（**封装、继承、super）某公司的雇员分为以下若干类：
	Employee：这是所有员工总的父类，属性：员工的姓名,员工的生日月份。		方法：getSalary(int month) 根据参数月份来确定工资，如果该月员工过生日，则公司会额外奖励100 元。
	SalariedEmployee：Employee 的子类，拿固定工资的员工。属性：月薪
	HourlyEmployee：Employee 的子类，按小时拿工资的员工，每月工作超出160 小时的部分按照1.5 倍工资发放。属性：每小时的工资、每月工作的小时数
	SalesEmployee：Employee 的子类，销售人员，工资由月销售额和提成率决定。属性：月销售额、提成率
	BasePlusSalesEmployee：SalesEmployee 的子类，有固定底薪的销售人员，工资由底薪加上销售提成部分。属性：底薪。
	根据要求创建SalariedEmployee、HourlyEmployees、SaleEmployee 和BasePlusSalesEmployee四个类的对象各一个，并计算某个月这四个对象的工资。
	注意：要求把每个类都做成完全封装，不允许非私有化属性。

 */
/**
 * ClassName:EmployeeTest Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月7日 下午4:51:50
 *
 * @see
 * 
 */
public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new SalariedEmployee(5000);
		System.out.println("输出固定工资员工的工资\t"+employee.getSalary());
		employee = new HourlyEmployee(15,170);
		System.out.println("输出小时拿工资的员工的工资\t"+employee.getSalary());
		employee = new SalesEmployee(100000,15);
		System.out.println("输出工资由月销售额和提成率决定的员工的工资\t"+employee.getSalary());
		employee = new BasePlusSalesEmployee(5000,100000,5);
		System.out.println("输出有固定底薪的销售人员，工资由底薪加上销售提成部分的员工的工资\t"+employee.getSalary());
		
		
	}

}

/**
 * 
 * ClassName:Employee
 * <p>
 * Function: 员工类 抽象类
 * <p>
 * Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015 2015年12月7日 下午4:54:39
 *
 * @see
 */
abstract class Employee {
	private String name = null;
	private int month = 0;

	abstract double getSalary();
}

/**
 * 
 * ClassName:SalariedEmployee
 * <p>
 * Function: 那固定工资的员工
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015 2015年12月7日 下午4:55:36
 *
 * @see
 */
class SalariedEmployee extends Employee {
	private double salary = 0;

	public SalariedEmployee(double salary) {
		this.salary = salary;

	}

	@Override
	double getSalary() {

		return salary;

	}

}

class HourlyEmployee extends Employee {
	private double hourSalary = 0;
	private double hours = 0;

	public HourlyEmployee(double hourSalary, double hours) {
		this.hourSalary = hourSalary;
		this.hours = hours;
	}

	@Override
	double getSalary() {
		if (hours > 160) {
			return 160 * hourSalary + (hours - 160) * 1.5 * hourSalary;
		} else {
			return hours * hourSalary;
		}

	}

}

class SalesEmployee extends Employee {
	/**
	 * 月销售额
	 */
	   double salemon = 0;
	/**
	 * 提成率 百分率
	 */
	  double royalty = 0;

	public SalesEmployee(double salemon, double royaity) {
		this.salemon = salemon;
		this.royalty = royaity;

	}

	@Override
	double getSalary() {

		return salemon * royalty / 100;

	}

}
/**
 * 
 * ClassName:BasePlusSalesEmployee
 * <p>
 * Function: 有固定底薪的销售人员
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015	2015年12月7日		下午6:17:42
 *
 * @see
 */
class BasePlusSalesEmployee extends SalesEmployee {
	//底薪
	private double basicSalary = 0;

	public BasePlusSalesEmployee(double basicSalary,double salemon, double royaity) {
		//通过调用父类的构造方法得到 月销售额,以及提成率
		super(salemon, royaity);
		this.basicSalary = basicSalary;

	}
	/**
	 * 
	 * getSalary:(这里用一句话描述这个方法的作用)
	 * <p>
	 * TODO(这里描述这个方法适用条件 – 可选)
	 * <p>
	 * TODO(这里描述这个方法的执行流程 – 可选)
	 * <p>
	 * TODO(这里描述这个方法的使用方法 – 可选)
	 * <p>
	 * TODO(这里描述这个方法的注意事项 – 可选)
	 *
	 * @param  @return    设定文件
	 * @return double  工资由底薪加上销售提成部分
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	@Override
	double getSalary() {
		return basicSalary+this.royalty+this.salemon/100 ;

	}

}