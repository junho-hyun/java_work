package test.mypac;
	//interface 는 다중 구현이 가능하다. Remocon 이랑 Drill 구현 
public class MultiObject implements Remocon, Drill{

	@Override
	public void up() {
		System.out.println("올려요");
	}

	@Override
	public void down() {
		System.out.println("내려요");
	}

	@Override
	public void hole() {
		System.out.println("구녕을 뚫어요");
	}
	
}
