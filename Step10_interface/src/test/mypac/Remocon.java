package test.mypac;
/*
 * 	[ interface ]
 * 
 * 	- 생성자가 없다 (단독 객체 생성 불가)
 * 	- 구현된 메소드는 가질 수 없다 ( 추상 메소드만 가질 수 있다 )
 *  - 필드는 static final 상수만 가질 수 있다.
 *  - data type 의 역활을 할 수 있다.
 *  - interface type 의 참조값이 필요하면 구현(implements) 클래스를 만들어서
 *    객체를 생성해야 한다.
 *  - 클래스 상속은 단일 상속이지만, 인터페이스는 다중 구현이 가능하다  
 */

public interface Remocon {
	// 필드는 static final 필드만 가질 수 있다.(따라서 static final 이라는 구절?생략 가능)
	// 그러므로 public String COMPANY="LG"; 라고만 입력해도 된다.
	// final 필드명은 관례상 다 대문자로만 한다.
	// final = 상수에 있는 값은 바뀌지 않는다.(바꿀 수 없다)
	// 상수에 들어가 있는 값은 보통 대문자이기에 대문자가 보인다면 상수구나 라고 알아두자.
	public static final String COMPANY="LG";
	//public String COMPANY="LG";
	

	//interface 에서 메소드는 추상 메소드만 정의 할 수 있다.
	//(대괄호를 사용해 대괄호안에 정의를 아무것도 안해준것을 추상 메소드라 한다.)
	public void up();
	public void down();
}
