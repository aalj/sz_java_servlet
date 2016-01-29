package zuoye;

/**
 * 
 * ClassName:Sushu 
 * <p>
 * Function: 素数的计算 Reason: TODO ADD REASON
 *
 * @author view
 * @version
 * @since Ver 1.1
 * @Date 2015 2015年12月1日 上午9:18:42
 *
 * @see
 * 
 */
public class Sushu {
	public static void main(String[] arg0) {
		sushu(100);
	}

	public static void sushu(int a) {
		if (a < 2) {
		}
		if (a == 2) {
			System.out.println(a);
		}
		if (a > 2) {
			for (int i = 2; i <= a; i++) {
				for (int j = 2; j <= (int) (Math.sqrt(i) + 1); j++) {
					if (i % j == 0) {
						break;
					}
					if (j == (int) (Math.sqrt(i) + 1)) {
						System.out.println(i);

					}
				}
			}

		}
	}
}