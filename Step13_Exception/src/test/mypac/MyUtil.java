package test.mypac;

public class MyUtil {
	public static void draw() {
		System.out.println("5�� ���� �׸��� �׷���!");
		//�߻��ϴ� Exception �� �޼ҵ� ������ ���� ó���� ���
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("�׸� �ϼ�!");
	}
	//�޼ҵ� �ȿ��� �߻��ϴ� Exception�� ���� ������ ���
	
	//������ �̷��� ó���� ��� �ҷ��� ����� �� try catch �� �ȿ� �־� ó���� ��� �Ѵ�.
	//��Ȳ�� ���� ���� �Ʒ� ���� ��� �ض�.(MainClass06)
	public static void send() throws InterruptedException {
		System.out.println("5�� ���� ������ �ؿ�!");
		
		Thread.sleep(5000);
		
		System.out.println("���� �Ϸ�!");
	}
}
