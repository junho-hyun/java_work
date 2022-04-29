package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;

public class MainClass05 {
	public static void main(String[] args) {
		//1. Car type �� ������ �� �ִ� ArrayList ��ü�� �����ؼ�
		//�������� List �������̽� type �������� cars �� ��� ������.
		List<Car> cars=new ArrayList<>();
		
		//2. Car ��ü(3��)�� �����ؼ� List ��ü�� ������ ������
		cars.add(new Car("�غ�"));
		cars.add(new Car("�ΰ�Ƽ"));
		//cars.add(new Car("������Ƽ")); �Ʒ� ó�� ��뵵 ����
		Car c1=new Car("������Ƽ");
		cars.add(c1);
		
		//3. �ݺ��� for ���� �̿��ؼ� List ��ü�� ����� ��� Car ��ü��
		//	 dirve() �޼ҵ带 ������� ȣ���� ������.
		for(Car tmp : cars) {
			tmp.drive();
		}
	}
}
