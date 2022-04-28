package test.main;

import test.mypac.Remocon;
import test.mypac.Remote;

public class MainClass02 {
	public static void main(String[] args) {
		//직접 클래스를 test.mypac 페키지에 만들어서 useRemocon() 메소드를 여기서 호출해 보세요.
		Remocon r1=new Remote();
		useRemocon(r1);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
