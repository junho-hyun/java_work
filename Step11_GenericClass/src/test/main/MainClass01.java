package test.main;

import test.mypac.Apple;
import test.mypac.Banana;
import test.mypac.FruitBox;

public class MainClass01 {
	public static void main(String[] args) {
		// Generic ũ������ Apple �� �����ؼ� Fruit ��ü �����ϱ�
		FruitBox<Apple> box1=new FruitBox<Apple>();
		// �޼ҵ��� ���ڷ� Apple type �����ϱ�
		box1.setItem(new Apple());
		// �޼ҵ尡 �������ִ� Apple type �޾Ʊ�
		Apple item1=box1.getItem();
	
		// Generic Ŭ������ Banana�� �����ؼ� FruitBox ��ü�� �����ؼ� ���� ����� �۾��� �غ�����.
						//new �Ҷ��� ��� ���� ���� ���� �� ������ �ȴ�.
		FruitBox<Banana> box2=new FruitBox<>();
		box2.setItem(new Banana());
		Banana item2=box2.getItem();
		
		
	}
	
}