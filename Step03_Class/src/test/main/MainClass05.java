package test.main;
/*
 * 	Rect ��� �̸��� Ŭ������ ������� �Ѵ�.
 * 
 * 	�ش� Ŭ������ ��ü�� �����ϰ�
 * 
 * 	�簢���� ����(width), ����(height) �� �ʵ忡 �����ϰ�
 * 
 * 	showArea() �� ȣ���ϸ� �簢���� ���̰� �ܼ�â�� ��µɼ� �ֵ���
 * 
 * 	Rect Ŭ������ ������ ������.
 */

import test.mypac.Rect;

public class MainClass05 {
	public static void main(String[] args) {
		Rect r1=new Rect();
		r1.height=10;
		r1.width=20;
		r1.showArea();
		//�޼ҵ尡 �������ִ� ���� ������ ��ƺ���
		int area=r1.getArea();
	}
}
