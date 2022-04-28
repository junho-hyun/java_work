package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass04 {
	public static void main(String[] args) {
		//SmartPhone 객체를 생성해서 Phone type p1 이라는 지역변수에 담아 보세요.
		Phone p1 = new SmartPhone();
		//p1 에 들어 있는 참조값을 이용해서 전화를 걸고 싶다면?
		p1.call();
		//p1 에 들어 있는 참조값을 이용해서 이동중에 전화를 걸고 싶다면?
		//위에서 p1 을 phone 에 넣어 주었기 때문에 (설명서)가 다르니
		//p1 을 케스팅 HandPhone 또는 SmartPhone 에 괄호에 담아 주어야 mobileCall() 이 가능하다
		HandPhone p2=(HandPhone)p1;
		p2.mobileCall();
		
		//p1 에 들어 있는 참조값을 이용해서 인터넷을 하고 싶다면?
		SmartPhone p3=(SmartPhone)p1;
		p3.doInternet();
	}
}
