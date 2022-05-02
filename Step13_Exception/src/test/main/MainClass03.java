package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		try {
			//스레드를 5초 동안 잡아 놓기
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		System.out.println("main 메소드가 종료되었습니다.");
	}
}
