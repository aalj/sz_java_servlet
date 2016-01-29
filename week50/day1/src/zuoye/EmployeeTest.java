/**
 * EmployeeTest.java
 * zuoye
 *
 * Function�� TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2015��12��7�� 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

/*
 * 3����**��װ���̳С�super��ĳ��˾�Ĺ�Ա��Ϊ���������ࣺ
	Employee����������Ա���ܵĸ��࣬���ԣ�Ա��������,Ա���������·ݡ�		������getSalary(int month) ���ݲ����·���ȷ�����ʣ��������Ա�������գ���˾����⽱��100 Ԫ��
	SalariedEmployee��Employee �����࣬�ù̶����ʵ�Ա�������ԣ���н
	HourlyEmployee��Employee �����࣬��Сʱ�ù��ʵ�Ա����ÿ�¹�������160 Сʱ�Ĳ��ְ���1.5 �����ʷ��š����ԣ�ÿСʱ�Ĺ��ʡ�ÿ�¹�����Сʱ��
	SalesEmployee��Employee �����࣬������Ա�������������۶������ʾ��������ԣ������۶�����
	BasePlusSalesEmployee��SalesEmployee �����࣬�й̶���н��������Ա�������ɵ�н����������ɲ��֡����ԣ���н��
	����Ҫ�󴴽�SalariedEmployee��HourlyEmployees��SaleEmployee ��BasePlusSalesEmployee�ĸ���Ķ����һ����������ĳ�������ĸ�����Ĺ��ʡ�
	ע�⣺Ҫ���ÿ���඼������ȫ��װ���������˽�л����ԡ�

 */
/**
 * ClassName:EmployeeTest Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015��12��7�� ����4:51:50
 *
 * @see
 * 
 */
public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new SalariedEmployee(5000);
		System.out.println("����̶�����Ա���Ĺ���\t"+employee.getSalary());
		employee = new HourlyEmployee(15,170);
		System.out.println("���Сʱ�ù��ʵ�Ա���Ĺ���\t"+employee.getSalary());
		employee = new SalesEmployee(100000,15);
		System.out.println("��������������۶������ʾ�����Ա���Ĺ���\t"+employee.getSalary());
		employee = new BasePlusSalesEmployee(5000,100000,5);
		System.out.println("����й̶���н��������Ա�������ɵ�н����������ɲ��ֵ�Ա���Ĺ���\t"+employee.getSalary());
		
		
	}

}

/**
 * 
 * ClassName:Employee
 * <p>
 * Function: Ա���� ������
 * <p>
 * Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015 2015��12��7�� ����4:54:39
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
 * Function: �ǹ̶����ʵ�Ա��
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015 2015��12��7�� ����4:55:36
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
	 * �����۶�
	 */
	   double salemon = 0;
	/**
	 * ����� �ٷ���
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
 * Function: �й̶���н��������Ա
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015	2015��12��7��		����6:17:42
 *
 * @see
 */
class BasePlusSalesEmployee extends SalesEmployee {
	//��н
	private double basicSalary = 0;

	public BasePlusSalesEmployee(double basicSalary,double salemon, double royaity) {
		//ͨ�����ø���Ĺ��췽���õ� �����۶�,�Լ������
		super(salemon, royaity);
		this.basicSalary = basicSalary;

	}
	/**
	 * 
	 * getSalary:(������һ�仰�����������������)
	 * <p>
	 * TODO(����������������������� �C ��ѡ)
	 * <p>
	 * TODO(�����������������ִ������ �C ��ѡ)
	 * <p>
	 * TODO(�����������������ʹ�÷��� �C ��ѡ)
	 * <p>
	 * TODO(�����������������ע������ �C ��ѡ)
	 *
	 * @param  @return    �趨�ļ�
	 * @return double  �����ɵ�н����������ɲ���
	 * @throws 
	 * @since  CodingExample��Ver 1.1
	 */
	@Override
	double getSalary() {
		return basicSalary+this.royalty+this.salemon/100 ;

	}

}