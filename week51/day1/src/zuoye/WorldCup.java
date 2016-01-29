/**
 * WorldCup.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月14日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * 从命令行读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队。如果该
年没有举办世界杯，则输出：没有举办世界杯。（提示将数据放在Map集合中，key为年份，value为寇军）
附：世界杯冠军以及对应的夺冠年份，截止到2014 年为止，历届世界杯冠军

 */
/**
 * ClassName:WorldCup Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月14日 下午3:51:04
 *
 * @see
 * 
 */
public class WorldCup {
	static Map<String, String> world = new HashMap<>();

	public static void main(String[] args) {
		addMap();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("输入任意年份,用于查询当年的世界杯冠军");
			String next = scan.next();
			if (next.matches("^[1-2]{1}[019]{1}[0-9]{2}$")) {
				String string = world.get(next);
				if (string != null) {
					System.out.println(string);
				} else {
					System.out.println("该年没有比赛");
				}
			}
			System.out.println("输入任意一只球队查询,该球队获奖情况");
			next = null;
			//获取map集合的key  Set集合
			Set<String> keySet = world.keySet();
			//创建一个list集合用于,临时储存通过获取球队名得到的获奖时间
			List<String> list = new ArrayList<>();
			next = scan.next();
			System.out.println(next);
			//通过遍历key Set 然后比较该球队在历时比赛中是否获奖的时间
			for (String string : keySet) {
				System.out.println(string);
				if (next.equals(world.get(string))) {
					//把查询到的获奖时间村到临时容器里面
					list.add(string);
				}
			}
			if (list.size()>0) {
				System.out.println(list);
			}else{
				
				System.out.println("该球队在比赛历时上没有获得过冠军");
			}
			
		}

	}

	private static void addMap() {
		world.put("2014", "中国");
		world.put("2010", "西班牙");
		world.put("2006", "意大利");
		world.put("2002", "巴西");
		world.put("1998", "法国");
		world.put("1994", "巴西");
		world.put("1990", "德国");
		world.put("1986", "阿根廷");
		world.put("1982", "意大利");
		world.put("1978", "阿根廷");
		world.put("1974", "德国");
		world.put("1970", "巴西");
		world.put("1966", "英格兰");
		world.put("1962", "巴西");
		world.put("1958", "巴西");
		world.put("1954", "德国");
		world.put("1950", "乌拉圭");
		world.put("1938", "意大利");
		world.put("1934", "意大利");
		world.put("1930", "乌拉圭");
	}

}
