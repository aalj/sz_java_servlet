/**
 * PropertiesDemo.java
 * day11
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月14日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day11;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Set;

/**
 * ClassName:PropertiesDemo
 * Function: 说明Properties的用法
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月14日		下午2:22:46
 *
 * @see 	 

 */
public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		//说明Properties的用法
		//与一个属性文件(配置文件.properties),联合使用
		//属性文件中写的是:key(name)= value;
		//db.properties文件与一个priperty对象关联
		//通过名字,读出对应的值
		//创建Properties对象
		Properties prop = new Properties();
		//与文件关联,与文件对象的输入流关联
		InputStream resourceAsStream = PropertiesDemo.class.getResourceAsStream("db.properties");
		prop.load(new InputStreamReader(resourceAsStream, "utf-8"));
		Set<Object> dbtype = prop.keySet();
		System.out.println(dbtype);
		String dbtyp = prop.getProperty("");
	}

}

