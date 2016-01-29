/**
 * IODeMO.java
 * day14
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月17日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * ClassName:IODeMO Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月17日 上午8:35:33
 *
 * @see
 * 
 */
public class SerializableDemo implements Serializable {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// 对象的序列化和反序列化
		// 序列化使用ObjectOutputStream
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/day14/seat.dat"));
		// 序列化一个字符串
		// oos.writeObject("h好困呀!!!!!!!");
		// oos.writeObject(new Date());

		oos.writeObject(new Person("张华", "123456"));

		oos.close();

		// 反序列化
		 ObjectInputStream inputStream = new ObjectInputStream(new
		 FileInputStream("src/day14/seat.dat"));
		// Object string = inputStream.readObject();
		// Date data = (Date) inputStream.readObject();
		//
		// System.out.println(string +"-------"+data+"afsadfasdfasd");
				 Person readObject = (Person) inputStream.readObject();
				 System.out.println(readObject.getName()+"   "+readObject.getPwd());
		inputStream.close();

	}

}
