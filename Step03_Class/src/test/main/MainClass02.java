package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	
	public String myName="�豸��";
	
	public void test() {
		System.out.println("test() ȣ���");
	}
	
	public static void main(String[] args) {
		/*
		 * test.mypca.MyUtil.send(); �� ��� �� ���� �ִ�.
		 * ������ ������ �̹� import ���־��� ������ �Ʒ�ó�� �׳�
		 * MyUtil.send(); �� �Է����ָ� �ȴ�.
		 */
		MyUtil.send();
		MyUtil.version="1.0";
		//System.out.println(this.myName);
		//this.test(); 
		/*
		 * this �� �������ε� class MainClass02 �ȿ� �ִ� 
		 * �������� main() �ε� ���⼭ �������� ��� �� �� ����.
		 * 
		 * class���� ���� �ϳ��� static �� ������ �Ǵµ� �װ�����
		 * �ٸ� class �� �ִ� �������� this �δ� �ҷ� �� �� ����.
		 * �ҷ� ���� ���ؼ��� �� �Ʒ��� ���ο� ������ new �ϰ� ������ �ϰų�
		 * �ʵ� �κ� ���赵���� static �� �ٿ� ��� �Ͽ��� �Ѵ�.
		 */
		//��)1. ���� �������� ��� �ϰ� ������ new �� �̿���.
		new MainClass02().test();
		/*
		 * ��)2. ��ü�� ���� ���� �������� ����� ��.
		 *	������ filed ���� public static String myName="�豸��";
		 *	Main static void test(){...}
		 *	static �� ���δٸ� new �� ���ϰ� �Ʒ��� ���� ��� �����ϴ�
		 *	System.out.println(MainClass02.myName);
		 *	MainClass02.test();
		 *	���⼭ �����Ҷ��� MainClass02 (Ŭ������ ���� �����ϴ�.)
		 *	System.out.println(myName);
		 *	test();
		 */
		
		
	}
	
}
