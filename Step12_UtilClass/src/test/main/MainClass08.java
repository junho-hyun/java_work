package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass08 {
	public static void main(String[] args) {
		//sample ������
		Map<String,String> dic=new HashMap<>();
		dic.put("house", "��");
		dic.put("phone", "��ȭ��");
		dic.put("car", "�ڵ���");
		dic.put("pencil", "����");
		dic.put("eraser", "�����");
		
		/*
		 * �˻��� �ܾ �Է��ϼ���:house
		 * house �� ���� ���Դϴ�.
		 * 
		 * �˻��� �ܾ �Է��ϼ���:gura
		 * gura �� ��Ͽ� �����ϴ�.
		 */
		
		//Scanner ��ü�� �̿��ؼ� �ܾ �Է� �޴´�.
		Scanner scan=new Scanner(System.in);
		System.out.print("�˻��� �ܾ �Է��ϼ���: ");
		String msg=scan.nextLine();
		//Map ��ü�� �ش� Ű������ ����� ���� �ִ��� �о�� ����
		String mean=dic.get(msg);
		
		if(mean == null) {//ã�� �ܾ ���� ���
			System.out.println(msg+"�� ��Ͽ� �����ϴ�.");
		}else {//ã�� �ܾ �ִ� ���
			System.out.println(msg+"�� ���� "+mean+"�Դϴ�.");
		}
		
		//if(dic.containsKey(msg)) {
		//	System.out.println(msg+" �� ���� "+dic.get(msg)+" �Դϴ�.");
		//}else {
		//	System.out.println(msg+" �� ��Ͽ� �����ϴ�.");
		//}
	
	}
}
