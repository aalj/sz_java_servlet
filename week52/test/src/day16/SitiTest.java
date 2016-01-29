/**
 * SitiTest.java
 * day16
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月27日 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day16;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import com.sun.swing.internal.plaf.metal.resources.metal;
import com.sun.xml.internal.ws.message.MimeAttachmentSet;

/**
 * ClassName:SitiTest Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author liang
 * @version
 * @since Ver 1.1
 * @Date 2015年12月27日 下午2:16:27
 *
 * @see
 * 
 */
public class SitiTest{
		 public static int  me (int i,int j){
			 if(j==0||i==j){
				 return 1;
			 }else{
				 return me(i-1,j-1)+me(i-1,j);
			 }
		 }
		 public static void main(String[] args) {
			for (int i = 0; i <=10 ; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(me(i,j)+"\t");
				}
				System.out.println();
			}
		}
		 
}
