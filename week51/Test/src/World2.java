import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class World2 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Map<String,String> a=new HashMap<String,String>();
//    	 a.put("2014","中国");
//    	 a.put("2010","西班牙");
//    	 a.put("2006","意大利");
//    	 a.put("2002","巴西");
//    	 a.put("1998","法国");
//    	 a.put("1994","巴西");
//    	 a.put("1990","德国");
//    	 a.put("1986","阿根廷");
//    	 a.put("1982","意大利");
//    	 a.put("1978","阿根廷");
//    	 a.put("1974","德国");
//    	 a.put("1970","巴西");
//    	 a.put("1966","英格兰");
//    	 a.put("1962","巴西");
//    	 a.put("1958","巴西");
//    	 a.put("1954","德国");
//    	 a.put("1950","乌拉圭");
//    	 a.put("1938","意大利");
//    	 a.put("1934","意大利");
//    	 a.put("1930","乌拉圭");
    	 System.out.println("请输入国家:");
    	 String c=new Scanner(System.in).next();;
    	 Set<String> d=a.keySet();
    	 int f=0;
    	 System.out.println(c);
    	 for(String e:d)
    	 {
    		 System.out.println(a.get(e));
    		 if(a.get(e).equals(c))
	  		 {
	  			 System.out.print(e+" ");
	  			 f++;
	   		 }
    	 }
    	 if(f==0)
    	 {
    		 System.out.print("没有得过世界杯");
    	 }
	}
}
