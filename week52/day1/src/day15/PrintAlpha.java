package day15;

/**
 * ClassName:PrintAlpha Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Mystery
 * @version
 * @since Ver 1.1
 * @Date 2015��12��21�� ����10:18:59
 *
 * @see
 * 
 */
public class PrintAlpha {
	// ����һ����־�������ֵ�˭
	boolean flag = true;// �ֵ������д
	// ���ַ���
	// 1.��ͳ������synchronized wait notifyAll
	// 2.�·�����Lock Condition awaint signalAll
	// �����д���ַ�,������this������

	public synchronized void printUpper(char ch) {
		// �Ƿ����ֵ�����,while
		while (!flag) {
			// û���ֵ��ң���
			try {
				// ���ĸ�����(this)�ϵȣ���ǰ�߳�Thread.currentThread()������this����ȴ�����
				// �ͷ����е���
				this.wait();
			} catch (InterruptedException e) {

				// TODO Auto-generated catch block
				e.printStackTrace();

			}

		}
		// ����ֵ��ң���
		System.out.print(ch);
		// ����־λ
		flag = !flag;
		// ֪ͨ��this�����ϵȴ��Ķ���ȥ��ȡthis�������
		this.notifyAll();
	}

	// ���Сд���ַ�
	public synchronized void printLower(char ch) {
		// �Ƿ����ֵ�����,while
		while (flag) {
			// û���ֵ��ң���
			try {
				// ���ĸ�����(this)�ϵȣ���ǰ�߳�Thread.currentThread()������this����ȴ�����
				// �ͷ����е���
				this.wait();
			} catch (InterruptedException e) {

				// TODO Auto-generated catch block
				e.printStackTrace();

			}

		}
		// ����ֵ��ң���
		/*�Ժ�����޸�**/
		System.out.print(ch);
		// ����־λ
		flag = !flag;
		// ֪ͨ��this�����ϵȴ��Ķ���ȥ��ȡthis�������
		this.notifyAll();
	}

}