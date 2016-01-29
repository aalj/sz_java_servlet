/**
 * AccountTest.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月10日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/*
 * 1）写一个帐户Account类，有属性姓名及余额。
   2）自定义一个异常类，定义一个带字符串参数的构造方法。
   3）写一个ATM类，实现一个取钱方法，传入Account对象及所取金额，如果帐户余额不够，则抛出上面的自定义异常，否则显示所需的钱，并修改帐户余额。
   4）测试ATM类上的取钱方法。

 */
/**
 * ClassName:AccountTest Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月10日 下午4:47:53
 *
 * @see
 * 
 */
public class ATMTest {

	public static void main(String[] args) {
		ATM atm = new ATM();
		try {
			System.out.println(atm.getMon(new Account("花花", 100), 200));
		} catch (MyException e) {
			
			e.printStackTrace();
			
		}

	}

}

class MyException extends Exception {
	public MyException() {

	}

	public MyException(String message) {
		super(message);

	}
}

/**
 * 
 * ClassName:Account
 * <p>
 * Function:写一个帐户Account类，有属性姓名及余额
 * <p>
 * Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015 2015年12月10日 下午4:50:50
 *
 * @see
 */
class Account {
	private String name = null;
	private double mon = 0;

	public Account() {

	}

	public Account(String name, double mon) {
		super();
		this.name = name;
		this.mon = mon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMon() {
		return mon;
	}

	public void setMon(double mon) {
		this.mon = mon;
	}

}

/**
 * 
 * ClassName:ATM
 * <p>
 * Function:
 * 写一个ATM类，实现一个取钱方法，传入Account对象及所取金额，如果帐户余额不够，则抛出上面的自定义异常，否则显示所需的钱，并修改帐户余额。
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015 2015年12月10日 下午4:51:18
 *
 * @see
 */
class ATM {
	public double getMon(Account ac, double myMon) throws MyException {
		if (ac.getMon()-myMon>=0) {
			ac.setMon(ac.getMon()-myMon);
			return myMon;
			
		}else{
			throw new MyException("余额不足");
		}

	}

}