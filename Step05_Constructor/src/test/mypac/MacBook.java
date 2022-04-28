package test.mypac;

public class MacBook {
	//외부에서 접근 불가하도록 접근 지정자를 private 로 해서 필드 3개 선언하기
 	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	
	//생성자 ( 생성자를 하나라도 생성하면 default 생성자는 사라진다 )
	public MacBook(Cpu cpu, Memory memory, HardDisk hardDisk) {
		//지역변수가 같으므로 this. 을 생략 할 수 없다.
		this.cpu=cpu;
		this.memory=memory;
		this.hardDisk=hardDisk;
	}
	//메소드
	public void doGame() {
			//여기선 혼돈의 여지가 없기 때문에 this.을 안붙여 사용 가능하다.
			// 같은 클래스 안에 있기 때문에.
		if(cpu==null || memory==null || hardDisk==null) {
			System.out.println("부품이 부족해서 맥북이 동작을 할 수 없습니다.");
			return; // 메소드를 여기서 끝내기
		}
		System.out.println("신나는 게임을 해요!");
	}
}
