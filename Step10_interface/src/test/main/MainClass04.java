package test.main;

import java.util.ArrayList;

import test.mypac.Remocon;

public class MainClass04 {
	public static void main(String[] args) {
		// class or implements 에 따라사 extends,interface 로 나뉜다.
		Remocon r1=new Remocon() {
			@Override
			public void up() {
				System.out.println("올려요");
			}
			
			@Override
			public void down() {
				System.out.println("내려요");
			}
		};
		useRemocon(r1);
		
		useRemocon(new Remocon() {
			@Override
			public void up() {
				System.out.println("올려요");
			}
			
			@Override
			public void down() {
				System.out.println("내려요");
			}
		});
	}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
