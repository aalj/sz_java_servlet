package zuoye;
/**
 * 
 * ClassName:OddTest
 * <p>
 * Function: ������
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015	2015��12��7��		����7:17:32
 *
 * @see
 */
public class OddTest {
	public static void main(String[] args) {
		Odd odd = new Odd(58);
		if (OddPrint.print(odd)) {
			
			System.out.println(odd.odd+"\t"
					+ "������");
		}else{
			System.out.println(odd.odd+"\t��ż��");
			
		}
		
	}
	
}