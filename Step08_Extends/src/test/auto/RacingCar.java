package test.auto;

public class RacingCar extends Car{

	public RacingCar(Engine engine) {
		super(engine);	//super 는 Car 의 생성자.
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void drive() {
		
		
		/*
		 * 	재정의(오버라이드) 한 부모 메소드를 호출해야 할지 말지는
		 * 	상황에 따라 다르다.
		 * 	어떤 경우에는 부모의 메소드를 호출해 주지 않으면 객체가
		 * 	제대로 동작을 안하는 경우가 있다.
		 * 	그런 경우에는 부모의 메소드를 반드시 호출해 주어야 한다.
		 */
		//super 를 붙였기에 부모객체 Car 에 있는 drive() 랑
		//새로 오버라이드 해준 객체 drive() 둘다 출력이 된다.
		super.drive();
		System.out.println("조금 더 가속을 붙여서 엄청 빠르게 달려요");
	}

}
