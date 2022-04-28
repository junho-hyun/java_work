package test.main;

import test.mypac.Weapon;

public class MainClass04 {
	
	//내부 클래스(inner class)
	static class YourWeapon extends Weapon{
		@Override
		public void attack() {
			System.out.println("공중 공격을 해요!");
		}
	}
	//static main() 메소드
	
	//static 영역에 올라가기 때문에 static 영역에 있는 애들만 사용 가능하다.
	//위의 class YourWearpon class 앞에 static을 붙여줘야지만 
	//아래의 main 메소드를 사용 할 수 있다. 
	//(main method 는 static 이 들어가기에)
	public static void main(String[] args) {
		Weapon w1=new YourWeapon();
		useWeapon(w1);
		
		//local inner class ( method 안에 만드는 class )
		class OurWeapon extends Weapon{

			@Override
			public void attack() {
				System.out.println("지겹다 이제 아무나 공격하자!");
			}
		}
		
		Weapon w2=new OurWeapon();
		useWeapon(w2);
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		
	}
}






