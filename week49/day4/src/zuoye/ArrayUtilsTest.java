/**
 * ArrayUtilsTest.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月3日 		view
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

/**
 * ClassName:ArrayUtilsTest Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author view
 * @version
 * @since Ver 1.1
 * @Date 2015年12月3日 下午6:37:04
 *
 * @see
 * 
 */
public class ArrayUtilsTest {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 9, 2, 3, 5, 9, 8, 7, 4, 1, 6, 9, 5, 4, 9, 8, 7, 5, 6, 3, 2, 5, 9, 456, 12, 56, 98, 4, 6,
				213 };
		ArrayUtils arrayUtils = new ArrayUtils();
		System.out.println("返回数组的最大值");
		System.out.println(arrayUtils.arrayToMax(arr));
		System.out.println("查询某一个只是否在数组里面,并且返回该数在数组里面的索引");
		System.out.println("如果在数组里面没有该数,则返回-1");
		System.out.println(arrayUtils.search(arr, 5));
		System.out.println("使用递归二分查找,并且返回该数在数组里面的索引");
		System.out.println("如果在数组里面没有该数,则返回-1");
		System.out.println(arrayUtils.recursionBinarySearch(arr, 0, arr.length-1, 5));
		
		
	}

}
