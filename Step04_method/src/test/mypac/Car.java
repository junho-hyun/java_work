package test.mypac;
// 여기의 정확한 package 명은 test.mypac.Car 

/*
 *  class 의 역활
 *  
 *  1. 객체의 설계도 역활
 *  
 *  2. data type 역활
 *  
 *  3. static 필드와 메소드를 포함하는 역활
 */

public class Car {
	//저장소(field)   클래스에 생선된 변수는 필드.
	public String name;
	
	//달리는 기능(method)
	public void drive() {
		System.out.println(this.name+" 이(가)달려요!");
	}				//여기서 this 는 field(필드)를 가르킨다. (자기 자신의 참조값)
					//drive() 생선한 곳에 들어가 있는 name 지금
					//위 string 에 들어갈 name 
	//멈추는 기능(method)
	public void stop() {
		System.out.println("멈춰요!");
		
	}
}