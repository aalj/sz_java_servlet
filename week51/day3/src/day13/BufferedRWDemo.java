/**
 * BufferedRWDemo.java
 * day13
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月16日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * ClassName:BufferedRWDemo Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月16日 上午11:25:06
 *
 * @see
 * 
 */
public class BufferedRWDemo {

	public static void main(String[] args) {

		try {
			BufferedReader reader = new BufferedReader(new   FileReader("I:\\abc\\endnota.txt"));
			
			BufferedWriter wr = new BufferedWriter(new FileWriter("I:\\abc\\cde"));
			String temp =null;
			temp=reader.readLine();
			while ((temp=reader.readLine())!=null){
				wr.write(temp);
				wr.newLine();
			}
			reader.close();
			wr.flush();
			wr.close();
			
			
		} catch (IOException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}
