/**
 * OddInterface.java
 * zuoye
 *
 * Function�� TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2015��12��7�� 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

/**
 * ClassName:OddInterface Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015��12��7�� ����7:02:43
 *
 * @see
 * 
 */
public interface OddInterface {
	/**
	 * 
	 * isOddNumber:(�ж�һ�����Ƿ�������)
	 * <p>
	 * TODO(����������������������� �C ��ѡ)
	 * <p>
	 * TODO(�����������������ִ������ �C ��ѡ)
	 * <p>
	 * TODO(�����������������ʹ�÷��� �C ��ѡ)
	 * <p>
	 * TODO(�����������������ע������ �C ��ѡ)
	 *
	 * @param @return
	 *            �趨�ļ�
	 * @return boolean ����������true ���򷵻�false
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	boolean isOddNumber();
}
/**
 * 
 * ClassName:Odd
 * <p>
 * Function: ͨ��ʵ�ֽӿ�,Ȼ��ͨ�������ж�һ�����Ƿ�������
 * <p>
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015	2015��12��7��		����7:14:42
 *
 * @see
 */
class Odd implements OddInterface {

	int odd = 0;

	public Odd(int odd) {
		this.odd = odd;
		// TODO Auto-generated constructor stub

	}
/**
 * �÷������������������,�����ж�,�������������true ������������false
 * @return �������������true ������������false
 */
	@Override
	public boolean isOddNumber() {
		if (odd % 2 == 0) {
			return false;
		} else {
			return true;

		}

	}

}

/**
 * 
 * ClassName:OddPrint
 * <p>
 * Function: ��ӡһ�����Ƿ�������
 * <p>
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015	2015��12��7��		����7:12:33
 *
 * @see
 */
class OddPrint{
	public static boolean print(OddInterface oddInterface){
		//ͨ���ӿڵ���ʵ����ķ���,�õ������ķ���ֵ
		if ( oddInterface.isOddNumber()) {
			return true;
		} else {
			return false;

		}
		
		
		
	}
}

