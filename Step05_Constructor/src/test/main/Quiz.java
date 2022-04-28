package test.main;

import java.util.Random;

public class Quiz {
	public static void main(String[] args) {
		/*
		 * 랜덤한 무작위 숫자를 얻어내고 싶다면
		 * Random 객체를 활용해야 한다.
		 * 따라서 new Random() 해서 객체를 생성후
		 * 객체의 메소드를 이용해서 무작위 숫자를 얻어내 보자
		 */
		
		
		//0~10 사이의 랜덤한 정수 하나를 얻어내서 ranNum 이라는 지역 변수에 담아 보세요.
		Random ran=new Random();
		int ranNum = ran.nextInt(11);
		System.out.println(ranNum);
		
		//1~45 사이의 랜덤한 정수 하나를 얻어내서 ranNum 라는 지역 변수에 담아 보세요.
		int ranNum2 = ran.nextInt(4)+1;
		System.out.println(ranNum2);
		
		//true or false 중에 랜덤한 boolean 값을 얻어내서 isRun 이라는 지역 변수에 담아 보세요.
		boolean isRun = ran.nextBoolean();
		System.out.println(isRun);
		
		/*
		 * 이미 java 에서 제공되는 클래스를 import 해서 
		 * 객체를 생성하고 그 객체의 non static 메소드를
		 * 활용해서 작업을 했다.
		 */
		
	}
}
