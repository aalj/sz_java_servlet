/**
 * OddInterface.java
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

/**
 * ClassName:OddInterface Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月7日 下午7:02:43
 *
 * @see
 * 
 */
public interface OddInterface {
	/**
	 * 
	 * isOddNumber:(判断一个数是否是奇数)
	 * <p>
	 * TODO(这里描述这个方法适用条件 – 可选)
	 * <p>
	 * TODO(这里描述这个方法的执行流程 – 可选)
	 * <p>
	 * TODO(这里描述这个方法的使用方法 – 可选)
	 * <p>
	 * TODO(这里描述这个方法的注意事项 – 可选)
	 *
	 * @param @return
	 *            设定文件
	 * @return boolean 是奇数返回true 否则返回false
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	boolean isOddNumber();
}
/**
 * 
 * ClassName:Odd
 * <p>
 * Function: 通过实现接口,然后通过方法判断一个数是否是奇数
 * <p>
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015	2015年12月7日		下午7:14:42
 *
 * @see
 */
class Odd implements OddInterface {

	int odd = 0;

	public Odd(int odd) {
		this.odd = odd;
		// TODO Auto-generated constructor stub

	}
/**
 * 该方法对内类里面的属性,进行判断,如果是奇数返回true 不是奇数返回false
 * @return 如果是奇数返回true 不是奇数返回false
 */
	@Override
	public boolean isOddNumber() {
		if (odd % 2 == 0) {
			return false;
		} else {
			return true;

		}

	}

}

/**
 * 
 * ClassName:OddPrint
 * <p>
 * Function: 打印一个数是否是奇数
 * <p>
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015	2015年12月7日		下午7:12:33
 *
 * @see
 */
class OddPrint{
	public static boolean print(OddInterface oddInterface){
		//通过接口调用实现类的方法,得到方法的返回值
		if ( oddInterface.isOddNumber()) {
			return true;
		} else {
			return false;

		}
		
		
		
	}
}

