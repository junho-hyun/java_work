package test.main;

import test.mypac.Remocon;
import test.mypac.Remote;

public class MainClass02 {
	public static void main(String[] args) {
		//���� Ŭ������ test.mypac ��Ű���� ���� useRemocon() �޼ҵ带 ���⼭ ȣ���� ������.
		Remocon r1=new Remote();
		useRemocon(r1);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
