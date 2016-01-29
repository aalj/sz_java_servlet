/**
 * ArraySrot.java
 * gem.day3
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月2日 		view
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package gem.day3;

import java.util.Arrays;
import java.util.Random;

/**
 * ClassName:ArraySrot Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author view
 * @version
 * @since Ver 1.1
 * @Date 2015年12月2日 下午2:23:02
 *
 * @see
 * 
 */
public class ArraySrot {

	public static void main(String[] args) {
		int[] arr = {1,5,2,25,6,4,764,23,6,7,3,25,26,456,};
//		int[] arr = new int[10];
//		Random random = new Random();
//		for (int i = 0; i < 10; i++) {
//			arr[i] = random.nextInt(10) + 1;
//		}
//		int temp = 0;
		
		//选择排序简单方法
//		for (int i = 0; i < arr.length-1; i++) {
//			for (int j = i; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//
//				}
//			}
//		}
		//选择排序优化一下 记录需要换位的下角标
		
//		for(int i = 0;i<arr.length;i++){
//			int index = i;
//			int num = arr[i];
//			for(int j = i+1;j<arr.length;j++){
//				if(num>arr[j]){//通过比较记录最小数的角标
//					index= j;  //以及记录相应的值
//					num=arr[j];
//				}
//			}
//			
//			if(index!=i){
//				int temp = arr[i];
//				arr[i]=num;
//				arr[index]=temp;
//			}
//			
//		}
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i + ",");
		}

	}

}
