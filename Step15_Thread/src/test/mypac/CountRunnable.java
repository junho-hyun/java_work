package test.mypac;
/*
 * 	새로운 스레드 만드는 방법2
 * 
 * 	1. Runnable 인터페이스를 구현한 클래스를 정의한다.
 * 	2. run() 메소드를 강제 오버라이드 한다.
 * 	3. Thread 클래스로 객체를 생성하면서 해당 클래스로 만든 객체를 생성장의 인자로 전달한다.
 *  4. Thread 클래스로 만듣 객체의 start() 메소드를 호출해서 스레드를 시작 시킨다.
 *  
 *  3,4 번은 Frame03
 */
public class CountRunnable implements Runnable {
	
	//구현할 추상 메서드가 하나! run() 하나 이기 때문에
	@Override
	public void run() {
		//run 메소드 안쪽이 새로운 작업 단위가 된다.
		int count=0;
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count++;
			System.out.println("현제 카운트:"+count);
			if(count==10) {
				break;
			}
		}
	}
}
