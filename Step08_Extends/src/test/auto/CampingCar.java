package test.auto;


public class CampingCar extends Car{
	//Car �� ���ڷ� ���޹��� �������̱� ������ �Ʒ��� �ݵ�� �� ���ڸ� ȣ���ؾ�
	//error �� �ȳ��� ����� �� �ִ�.
	public CampingCar(Engine engie) {
		// super() �� �θ�Ŭ������ �����ڸ� ȣ���ϴ� ���� �ǹ��Ѵ�.
		super(engie);
		
	}
	
	//�޼ҵ�
	public void sleepInCar() {
		System.out.println("������ ���� �ڿ�!");
	}

}
