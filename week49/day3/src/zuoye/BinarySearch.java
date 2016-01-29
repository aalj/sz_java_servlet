/**
 * BinarySearch.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月2日 		view
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

import java.util.Arrays;

/**
 * ClassName:BinarySearch
 * <p>
 * Function: 二分查找法
 *
 * @author   view
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月2日		下午7:58:50
 *
 * @see 	 

 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,5,2,25,6,4,764,23,6,7,3,25,26,456,};
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i+"\t");
		}
		System.out.println();
		int temp =search(arr,4);
		if(temp>=0){
			System.out.println("查找的数的索引是  "+temp);
		}else{
			System.out.println("没有找到该数,但是该数可以插入到"+temp*-1+"位");
		}
	}

	private static int  search(int[] arr,int num) {
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

}

