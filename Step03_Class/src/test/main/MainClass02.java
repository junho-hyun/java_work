package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	
	public String myName="김구라";
	
	public void test() {
		System.out.println("test() 호출됨");
	}
	
	public static void main(String[] args) {
		/*
		 * test.mypca.MyUtil.send(); 로 출력 할 수도 있다.
		 * 하지만 위에서 이미 import 해주었기 때문에 아래처럼 그냥
		 * MyUtil.send(); 만 입력해주면 된다.
		 */
		MyUtil.send();
		MyUtil.version="1.0";
		//System.out.println(this.myName);
		//this.test(); 
		/*
		 * this 는 참조값인데 class MainClass02 안에 있는 
		 * 참조값이 main() 인데 여기서 참조값을 사용 할 수 없다.
		 * 
		 * class에는 오직 하나의 static 만 생성이 되는데 그곳에서
		 * 다른 class 에 있는 참조값을 this 로는 불러 올 수 없다.
		 * 불러 오기 위해서는 그 아래에 새로운 파일을 new 하고 생성을 하거나
		 * 필드 부분 설계도에서 static 을 붙여 사용 하여야 한다.
		 */
		//예)1. 위의 참조값을 사용 하고 싶으면 new 를 이용한.
		new MainClass02().test();
		/*
		 * 에)2. 객체를 새로 만들어서 참조값에 사용을 한.
		 *	하지만 filed 에서 public static String myName="김구라";
		 *	Main static void test(){...}
		 *	static 을 붙인다면 new 를 안하고 아래와 같이 사용 가능하다
		 *	System.out.println(MainClass02.myName);
		 *	MainClass02.test();
		 *	여기서 참조할때는 MainClass02 (클래스명 생략 가능하다.)
		 *	System.out.println(myName);
		 *	test();
		 */
		
		
	}
	
}
