/**
 * ArrayUtils.java
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

import org.junit.Test;

/**
 * （方法与数组）创建一个ArrayUtil类，在该类中定义并实现如下方法， 本例数组都是指数值类型（例如int类型）的数组。
 * 1）、求数组最大值（提示，方法签名为public int max(int [] arr）)， 2）、判断整数n是否在数组中，如果n 在数组中存在，则返回n
 * 的下标；如果 不存在，则返回-1。 3)、使用递归算法实现二分查找
 */
public class ArrayUtils {

	/**
	 * 
	 * searchNum:(判断某个数知否在数组里面)
	 *
	 * @param @param
	 *            arrayNum
	 * @param @param
	 *            num
	 * @param @return
	 *            设定文件
	 * @return int 如果查询的数在数组里面,
	 *         <p>
	 *         则返回该数的索引,如果不在则返回-1
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public int searchNum(int[] arrayNum, int num) {
		arrayNum = this.arySrot(arrayNum);

		int end = arrayNum.length - 1;
		int start = 0;
		int mid = (end + start) / 2;
		while (end>=start) {
			mid = (start + end) / 2;
			if (num > arrayNum[mid]) {
				start = mid + 1;
			} else if (num < arrayNum[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
			
		}

		return -1;
	}
	public   int  search(int[] arr,int num) {
		arr = this.arySrot(arr);
//		for (int i : arr) {
//			System.out.print(i+"\t");
//		}
		int start = 0;
		int end = arr.length-1;
		int mid = (start+end)/2;
		while (end>=start) {
			mid = (start+end)/2;
			if(num>arr[mid]){
				start = mid+1;
			}else if(num<arr[mid]){
				end  = mid-1;
				
			}else{
				return mid;
			}
		}
		
		
		//通过返回值可以得到需要在那个位置添加数
		return -start-1;
	}

	/**
	 * 
	 * arySrot:(通过选择排序的方式对数组进行排序)
	 *
	 * @param @param
	 *            arr
	 * @param @return
	 *            设定文件
	 * @return int[] 返回数组,数组从大到小排序
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public int[] arySrot(int[] arr) {
		for(int i = 0;i<arr.length;i++){
			int index = i;
			int num = arr[i];
			for(int j = i+1;j<arr.length;j++){
				if(num>arr[j]){//通过比较记录最小数的角标
					index= j;  //以及记录相应的值
					num=arr[j];
				}
			}
			
			if(index!=i){
				int temp = arr[i];
				arr[i]=num;
				arr[index]=temp;
			}
		}
//		for (int i = 0; i < arr.length; i++) {
//			int index = i;
//			int array = arr[i];
//			for (int j = i+1; j < arr.length; j++) {
//				if (array > arr[j]) {
//					index = j;
//					array = arr[j];
//
//				}
//				if (index != i) {
//					int temp = arr[i];
//					arr[i] = array;
//					arr[index] = temp;
//				}
//			}
//		}
		return arr;
	}
	@Test
public void test(){
		int[]aa={6,9,8,7,5,6,5,6,2,3,1};
		int[] a =this.arySrot(aa);
	for (int i : a) {
		System.out.print(i+"\t");
	}
}
	/**
	 * 
	 * arrayToMax:(返回数组的最大值)
	 *
	 * @param @param
	 *            arr
	 * @param @return
	 *            设定文件
	 * @return int 数组里面的最大自
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public int arrayToMax(int[] arr) {
		return this.arySrot(arr)[0];

	}

	/**
	 * 
	 * recursionBinarySearch:(使用递归的方式进行二分查找)
	 *
	 * @param 设定文件
	 
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	/**
	 * 
	 * recursionBinarySearch:(使用递归的方式进行二分查找)
	 *
	 * @param  @param arr  查询的数组
	 * @param  @param low  数组的第一位
	 * @param  @param hight 数组的最后一位
	 * @param  @param key  需要查找的数
	 * @param  @return    设定文件
	 * @return void 返回查找到的数的索引
	 *         <p>
	 *         否则返回该数可以添加到的位置的负数
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	public int recursionBinarySearch(int[] arr, int low, int hight, int key) {

		int mid = (hight + low) / 2;
		if (low < hight) {
			if (key == arr[mid]) {
				return mid;
			} else if (key > arr[mid]) {
				return recursionBinarySearch(arr, mid + 1, hight, key);
			} else {
				return recursionBinarySearch(arr, low, mid - 1, key);
			}
		} else {

			return -1;
		}

	}

}
