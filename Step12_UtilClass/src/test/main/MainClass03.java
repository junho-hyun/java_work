package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 *  Scanner ��ü�� �̿��ؼ� �ݺ��� ���鼭 ģ�� �̸��� 3�� �Է� �޾Ƽ�
		 *  �Է¹��� �̸��� ArrayList ��ü�� ������� ������ �ϴ� ���α׷����� �� ������.
		 *  
		 *  
		 *  -hint
		 *  Scanner scan=new Scanner(System.in);
		 */
		
		//Ű����� ���� �Է� ���� ��ü
		Scanner scan=new Scanner(System.in);
		//�Է¹��� ���ڿ��� ������ ��ü
		ArrayList<String> names=new ArrayList<>();
		
		for(int i=0; i<3; i++) {
			System.out.println("�̸� �Է� : ");
			String name=scan.nextLine();
			names.add(name);
			// �̷��� �ۼ��ص� �ȴ�. names.add(scan.nextLine());
		}
		
		//����� ������ �ݺ��� ���鼭 ������� ����ϱ�
		for(int i=0; i<names.size(); i++) {
			//i��° item
			// .get() �޼ҵ尡 �������ִ� type �� String �� ������? ArrayList<String> �̱� �����̴�.
			String tmp=names.get(i);
			System.out.println(tmp);
		}
		
		System.out.println("-----------");
		
		//Ȯ�� for ��		���� i ��, index ���� �ʿ� ���� �� ����Ѵ�. ������� ������ ��� �� ��.
		for(String tmp:names) {
			System.out.println(tmp);
		}
	}
	
}
