package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	//
	static Weapon w1=new Weapon() {
		// { } 안에 작성된건 method이고 method 는 class 안에 만들 
		// 수 있기에 이것은 익명의 class 가 생성되었다라고 부른다.
		@Override
		public void attack() {
			System.out.println("뭔진 모르겠지만 공격하자!");
		}
		
	};
	
	public static void main(String[] args) {
		useWeapon(w1);
		
		//익명의 class 생성. 추상
		Weapon w2=new Weapon() {

			@Override
			public void attack() {		
				System.out.println("오잉 이것도 공격하네?");
			}
			
		};
		
		useWeapon(w2);
		
		//추상 클래스 타입 즉석에서 얻어내기.
		useWeapon(new Weapon() {

			@Override
			public void attack() {		
				System.out.println("오잉 이것도 공격하네?");
			}
			
		});
	}
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
