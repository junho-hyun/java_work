package test.main;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 *		Scanner ��ü�� �̿��ؼ� ���ڿ��� 5�� �Է� �޴´�.
		 *		�Է� ���� ���ڿ��� ���ʴ�� �迭�� ����Ǿ�� �Ѵ�.
		 *		��δ� �Է� ���� �� for ���� �̿��ؼ� �迭�� �����
		 *		��� ���ڿ��� �ܼ�â�� ������� ����ϴ� �ڵ带 �ۼ��� ������.
		 */
		Scanner scan=new Scanner(System.in);
		String[] str=new String[5];
		
		for(int i=0; i<str.length; i++) {
			System.out.println("���ڿ� �Է�:");
			String msg=scan.nextLine();
			str[i]=msg;

			
			//str[i]=scan.nextLine();
			
			//System.out.println(str[i]+" ");
			
			//�ȿ��ٰ� �ᵵ ����������� ���� ���� ������������ �ۿ��ٰ� �ϳ� ��
			//�����ؾ� �Ѵ�.
		}
		for(int i=0; i<str.length; i++) {
			String tmp=str[i];
			System.out.println(tmp);
		}
		
		
	}
}
