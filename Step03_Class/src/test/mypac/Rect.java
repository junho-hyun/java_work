package test.mypac;

public class Rect {
	public int width;
	public int height;
	//������ �ֿܼ� ����ϴ� �޼ҵ�
	public void showArea() {
		//���� ����
		int area=this.width*this.height;
		//�ֿܼ� ����ϱ�
		System.out.println("�簢���� ���̴�: "+area);
	}
	//������ �޼ҵ带 ȣ���� ������ �������ִ� �޼ҵ�
	public int getArea() {
		int area=width*height;
		return area;
	}
}
