package zuoye;
/**
 * 
 * ClassName:OddTest
 * <p>
 * Function: 测试类
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015	2015年12月7日		下午7:17:32
 *
 * @see
 */
public class OddTest {
	public static void main(String[] args) {
		Odd odd = new Odd(58);
		if (OddPrint.print(odd)) {
			
			System.out.println(odd.odd+"\t"
					+ "是奇数");
		}else{
			System.out.println(odd.odd+"\t是偶数");
			
		}
		
	}
	
}