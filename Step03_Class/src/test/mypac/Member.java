package test.mypac;

public class Member {
	//�ʵ�
	public int num=1;
	public String name="�豸��";
	public String addr="�뷮��";		
	
	//�޼ҵ�
	public void showInfo() {
		//�ʵ忡 ����� �������Ʒ��� ���� �������� ���ܼ�â�� ����ϴ� �ڵ带 �ۼ��� ������.
		//��ȣ:1, �̸�:�豸��, �ּ�:�뷮��
		System.out.println("��ȣ:"+this.num+",�̸�:"+this.name+",�ּ�:"+this.addr);
	}
}


// public class Member {
//	public int num=;
//	public String name;
//	public String addr=;	
// }  	�̷��� �Ǹ� int ���� ���� �ϸ� �⺻�� 0�� ����
//		String �� �����ϸ� name��addr ���� null �� �⺻������ ����ȴ�.
// 		���� �⺻���� ���� ������ ������ �����ϸ� �ȴ�.	

