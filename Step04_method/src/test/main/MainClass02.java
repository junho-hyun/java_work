package test.main;

import test.mypac.Car;
import test.mypac.Messenger;

public class MainClass02 {
	public static void main(String[] args) {
		
		//Messenger Ŭ������ ���� static �޼ҵ� 3���� ȣ���ϴ� code�� �ۼ��� ������
		//static �޼ҵ�� new �� ���� �ʰ� Ŭ������ . �� ��� ���
		//import ���ְ� ��� ����.
		Messenger.sendMessage("send");
		Messenger.getMessage();
		Messenger.useCar(new Car());
	}
}
