package test.auto;


public class CampingCar extends Car{
	//Car 는 인자로 전달받은 생성자이기 때문에 아래에 반드시 그 인자를 호출해야
	//error 가 안나고 사용할 수 있다.
	public CampingCar(Engine engie) {
		// super() 는 부모클래스의 생성자를 호출하는 것을 의미한다.
		super(engie);
		
	}
	
	//메소드
	public void sleepInCar() {
		System.out.println("차에서 잠을 자요!");
	}

}
