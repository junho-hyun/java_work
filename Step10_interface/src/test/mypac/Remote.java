package test.mypac;

public class Remote implements Remocon {

	@Override
	public void up() {
		System.out.println("À§");
	}

	@Override
	public void down() {
		System.out.println("¾Æ·¡");
	}

}