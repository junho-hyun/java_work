package test.mypac;
/*
 *  [ ������ ]
 *  
 *  1. Ŭ������� �����ϴ�
 *  2. �޼ҵ� ���� ���� ������ ���� type �� ����.
 *  3. ��ü�� �����Ҷ� (new �� ��) ȣ��ȴ�.
 *  4. ��ü�� �����ϴ� ������ ���� �غ� �۾��� �� �� �����ϴ�.
 *  5. �����ڸ� ��������� ���� ���� �ʾƵ� �⺻ �����ڴ� �ִٰ� ���ֵȴ�.
 */
public class Student {
	//������		�� return Ÿ���� �����鼭 class ��� �����ϴ�.
	//�Ʒ� public Student() �� �⺻�������δ�. �����ϴ°� �ɼ��̴�.(���ص���)��� �ִٰ� ���ֵȴ�.
	public Student() {
		System.out.println("Student Ŭ������ ������ ȣ���");
	}
	
	//�޼ҵ�		�� return Ÿ���� �ִ�.
	public void study() {
		System.out.println("���θ� �ؿ�");
	}
	public void goSchool() {
		System.out.println("�б��� ����");
	}
}
