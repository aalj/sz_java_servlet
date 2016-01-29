/**
 * Account.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月16日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * ClassName:Account Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月16日 下午8:59:41
 *
 * @see
 * 
 */
public class Account1 {
	private long id;
	private String name;
	private String password;

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", password=" + password + "]";
	}

	public Account1() {
		// 第一次,文件没有,id=10000(初值) 作为这个对象的id
		// Account的id保存,每次创建这个对象
		// 从这个文件中取出id 作为我的这个对象的id
		// id+1
		try {
			File file = new File("src/zuoye/Account1.txt");
			// 判断文件是否存在
			if (file.exists()) {// 文件存在
				DataInputStream dataInputStream  = 
						new DataInputStream(new FileInputStream(file));
				id = dataInputStream.readLong();
				dataInputStream.close();
			} else {//文件不存在
				id= 10001;
			}
			DataOutputStream dataOutputStream = 
					new DataOutputStream(new FileOutputStream(file));//FileNotFoundException
			dataOutputStream.writeLong(id+1);//报IO异常
			dataOutputStream.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {
			
			e.printStackTrace();
			
		}

		// idToAdd();

	}

	public void idToAdd() {
		System.out.println(id);
		try {
			File f = new File("src/zuoye/Account1.txt");
			DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(f));

			DataInputStream inputStream = new DataInputStream(new FileInputStream(f));
			id = inputStream.readInt();
			if (id < 10000) {

				outputStream.writeInt(10000);

				outputStream.flush();
				System.out.println(id);

			}
			outputStream.writeLong(++id);
			inputStream.close();
			outputStream.close();
		} catch (EOFException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

	public Account1(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
