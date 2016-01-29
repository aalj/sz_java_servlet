/**
 * EmployeeManTest.java
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

import java.util.Scanner;

/**
 * ClassName:EmployeeManTest Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月12日 上午10:58:41
 *
 * @see
 * 
 */
public class EmployeeManTest {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 输入标识
		int temp = 0;
		boolean flag = true;
		while (true) {
			flag  = true;
			System.out.println("欢迎进入员工管理系统");
			System.out.println("输入  1   进入系统   输入  2  退出系统");
			temp = scan.nextInt();
			EmployeeManagement ins = EmployeeManagement.getIns();
			if (temp == 1) {
				while(flag){
				
				temp = 0;
				System.out.println("进入员工管理系统");
				System.out.println("添加员工请按  1,删除员工请按  2,修改员工请按  3,显示员工请按  4,退出请按 -1");
				temp = scan.nextInt();
				switch (temp) {
				case 1:// 添加员工
					Employee out = new Employee();
					System.out.println("进入员工添加页面");
					System.out.println("请输入员工姓名");
					out.setName(scan.next());
					System.out.println("请输入员工年龄");
					out.setAge(scan.nextInt());
					System.out.println("请输入员工员工编号");
					String eno = scan.next();
					out.setEno(eno);
					System.out.println("请输入员工员工工资");
					out.setSalary(scan.nextDouble());
					// 员工添加到管理系统
					
					
					if (ins.addEmp(out)) {
						System.out.println("添加成功");
					}else{
						System.out.println("该员工已经存在");
					}
					//输出添加的信息
					System.out.println(ins.checkEmp(eno).toString());

					break;
				case 2:// 删除员工
					System.out.println("输入员工");
					String eno1 = scan.next();
					 Employee checkEmp = ins.checkEmp(eno1);
					 System.out.println(checkEmp.toString());
					System.out.println("确定删除按 1,取消按 2");
					int a = scan.nextInt();
					if (a == 1) {
						ins.delEmp(eno1);
					}else{
						System.out.println("取消删除");
						break;
						
					}
					

					break;
				case 3:// 修改员工
					System.out.println("输入员工编号,");
					String eno2= scan.next();
					System.out.println("输入更改信息类型0：名字、1：年龄、2：工号、3：工资");
					int a1= scan.nextInt();
					System.out.println("输入更改的值");
					String inf = scan.next();
					
					
					try {
						if
						(ins.reEmp(eno2, a1, inf)){
							System.out.println("信息修改成功");
							System.out.println(ins.checkEmp(eno2).toString());
						}
						else{
							System.out.println("信息修改失败");
						}
					} catch (MyException e) {
						
						e.printStackTrace();
						
					}

					break;
				case 4:// 显示员工
					for (Employee e: ins.list) {
						System.out.println(e.toString());
					}

					break;
				case -1:// 退出
					flag = false;
					continue;

				default:
					System.out.println("输入不正确");
					break;
				}
			}

			} else if (temp == 2) {
				System.exit(0);
			} else {
				System.out.println("输入错误");
			}

		}

	}

}
