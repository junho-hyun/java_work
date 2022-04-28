package test.main;

import test.mypac.Car;
import test.mypac.MyObject;
import test.mypac.Radio;
import test.mypac.Speaker;

public class MainClass01 {
	public static void main(String[] args) {
		//MyObject 클래스에 정의된 3개의 메소드를 차례로 호출하는 code를 작성해 보세요.
		MyObject mo=new MyObject();
		mo.walk();
		int num=mo.getNumber();
		String greet=mo.getGreeting();
		Car car=mo.getCar();
		
		// .setNum()	.setName()	.useCar() 메소드 3개를 호출하는 code 를 작성해 보세요.
		mo.setNum(1);
		mo.setName("김구라");
		mo.useCar(car);
	// mo.useCar(new Car()); 새로 생성해서 넣는 것도 가능하다.
		
		//.listenMusic() 메소드를 호출하는 code 를 작성해 보세요
		mo.listenMusic(new Radio(), new Speaker());
		
	}
	
}
