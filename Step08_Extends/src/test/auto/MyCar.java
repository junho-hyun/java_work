package test.auto;

public class MyCar extends Car {
	public MyCar(Engine engine) {
		super(engine);
		
	}
	
	public void AutoDrive() {
		System.out.println("자율주행모드 실행");
	}

}
//package test.auto;
//
//public class ElectricCar extends Car {
//   public ElectricCar(Engine engine) {
//      super(engine);
//   }
//   
//   public void charging() {
//      System.out.println("충전해야 굴러간다");
//   }
//}