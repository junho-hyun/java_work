package test.main;

import test.mypac.Car;
import test.mypac.Messenger;

public class MainClass02 {
	public static void main(String[] args) {
		
		//Messenger 클래스에 만든 static 메소드 3개를 호출하는 code를 작성해 보세요
		//static 메소드는 new 를 하지 않고 클레스명에 . 을 찍어 사용
		//import 해주고 사용 가능.
		Messenger.sendMessage("send");
		Messenger.getMessage();
		Messenger.useCar(new Car());
	}
}
