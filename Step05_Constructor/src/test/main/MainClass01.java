package test.main;

import test.mypac.Member;
import test.mypac.Student;

public class MainClass01 {
	public static void main(String[] args) {
		//������ ��Ƶ��� ���� �����ڴ� �ٽ� ��� �� �� ����.
		new Student();
		//������ �ϴ°� �ƴ϶� ������ �� ����ϰ� �ʹٸ� ������ ��Ƶ���.
		Student s1=new Student();
		//�����ڸ� �ϳ��� ���Ǹ� �ϸ� default �����ڴ� �������.
		new Member(1, "�豸��", "�뷮��");
		//���� ���� �������� ��� �ʹٸ�
		Member m1=new Member(2, "�ذ�", "��ŵ�");
		
		s1.study();
		//������ .study()�� �ѹ��� ����� �Ŷ��. (��ȸ������ ����)
		//���� ������ ��� ����ϴ°� �ƴ϶� ��ü�� . �� ����ϸ� �ȴ�.
		new Student().study();
		
		//�����ڸ� ���� �ҷ����� ����� �� �ִ�.(�����ڸ� �������� �� ��.)
		//������ �ȵ����� �����ڸ� �ϳ� �� ������⿡ ����. �ȵǴ� ������
		//������ �̹� new Member�� ����� ������ ��Ƶΰ� ����߱� ������.(�����߱⿡?)
		new Member();
		//���ڿ� �ƹ��͵� ������ num=0,null,null . �ƹ��͵� ���� �ʴ´�.
		Member m3=new Member();
	}
}
