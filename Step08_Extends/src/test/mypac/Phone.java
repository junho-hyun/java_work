package test.mypac;
			//extends Object 를 하지 않아도 한것 처럼 자동으로 된다.
			//안써도 Object는 상속받는다.
public class Phone extends Object{
	//생성자
	public Phone() {
		System.out.println("Phone 생성자 호출됨");
	}
	
	//전화거는 메소드
	public void call() {
		System.out.println("전화를 걸어요");
	}
}
