package test.main;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ尡 ���� �Ǿ����ϴ�.");
		
		//Ű����� ���� �Է� ���� �� �ִ� ��ü ����
		Scanner scan=new Scanner(System.in);
		System.out.print("���ڿ� �Է�:");
		
		//���� �Է� �ް�?
		String str=scan.nextLine();
		
		//�Է� ���� ���ڿ��� �ֿܼ� ����ϰ� enter ġ��
		System.out.println(str);
		
		//����
		System.out.println("main �޼ҵ尡 ���� �˴ϴ�.");
	}
}
