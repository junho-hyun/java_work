package test.mypac;
/*
 * 	���ο� ������ ����� ���
 * 
 * 	1. Thread Ŭ������ ��� ���� Ŭ������ �����Ѵ�.
 * 	2. run() �޼ҵ带 �������̵� �Ѵ�.
 * 	3. run() �޼ҵ� �ȿ��� ���ο� �����忡�� �ؾ� �� �۾��� �ڵ��Ѵ�.
 *  4. ���� Ŭ������ ��ü�� �����ϰ� �ش� ��ü�� start() �޼ҵ带 ȣ���ϸ�
 *     ���ο� �����尡 ���۵ȴ�.
 *     
 *     3,4���� Frame02 ���� �۾���.
 */
public class CountThread extends Thread{
	//run ctrl+space 
	@Override
	public void run() {
		//run �޼ҵ� ������ ���ο� �۾� ������ �ȴ�.
		int count=0;
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count++;
			System.out.println("���� ī��Ʈ:"+count);
			if(count==10) {
				break;
			}
		}
	}
}
