package test.main;

import java.util.Random;

public class Quiz {
	public static void main(String[] args) {
		/*
		 * ������ ������ ���ڸ� ���� �ʹٸ�
		 * Random ��ü�� Ȱ���ؾ� �Ѵ�.
		 * ���� new Random() �ؼ� ��ü�� ������
		 * ��ü�� �޼ҵ带 �̿��ؼ� ������ ���ڸ� �� ����
		 */
		
		
		//0~10 ������ ������ ���� �ϳ��� ���� ranNum �̶�� ���� ������ ��� ������.
		Random ran=new Random();
		int ranNum = ran.nextInt(11);
		System.out.println(ranNum);
		
		//1~45 ������ ������ ���� �ϳ��� ���� ranNum ��� ���� ������ ��� ������.
		int ranNum2 = ran.nextInt(4)+1;
		System.out.println(ranNum2);
		
		//true or false �߿� ������ boolean ���� ���� isRun �̶�� ���� ������ ��� ������.
		boolean isRun = ran.nextBoolean();
		System.out.println(isRun);
		
		/*
		 * �̹� java ���� �����Ǵ� Ŭ������ import �ؼ� 
		 * ��ü�� �����ϰ� �� ��ü�� non static �޼ҵ带
		 * Ȱ���ؼ� �۾��� �ߴ�.
		 */
		
	}
}
