package test.main;

import test.mypac.Drill;

public class MainClass06 {
	public static void main(String[] args) {
		
		useDrill(new Drill() {
			@Override
			public void hole() {
				System.out.println("바닥에서 구멍을 뚫어요!");
			}
		});
		//위에것을 그냥 줄인것 뿐. override 한 메소드가 하나뿐이기에 가능하다.
		//추상 메소드가 하나 뿐인 경우에만 사용 가능.
		useDrill(()->{
			System.out.println("천장에 구멍을 뚫어요!");
		});
	}
	//1개의 추상 메소드로 구성되어 있는 Drill 객체를 인자로 전달받는 메소드
	public static void useDrill(Drill d) {
		d.hole();
	}
}
