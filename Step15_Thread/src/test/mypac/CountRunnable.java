package test.mypac;
/*
 * 	���ο� ������ ����� ���2
 * 
 * 	1. Runnable �������̽��� ������ Ŭ������ �����Ѵ�.
 * 	2. run() �޼ҵ带 ���� �������̵� �Ѵ�.
 * 	3. Thread Ŭ������ ��ü�� �����ϸ鼭 �ش� Ŭ������ ���� ��ü�� �������� ���ڷ� �����Ѵ�.
 *  4. Thread Ŭ������ ���� ��ü�� start() �޼ҵ带 ȣ���ؼ� �����带 ���� ��Ų��.
 *  
 *  3,4 ���� Frame03
 */
public class CountRunnable implements Runnable {
	
	//������ �߻� �޼��尡 �ϳ�! run() �ϳ� �̱� ������
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
