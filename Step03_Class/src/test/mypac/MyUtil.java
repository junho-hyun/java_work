package test.mypac;

public class MyUtil {
	//필드
	public static String version;
	//메소드
		 //static 이 붙는다면 다른곳에서 MyUtil.send() 라고만 써도 사용 가능	
	public static void send() {
		System.out.println("전송합니다.");
		/*미리 준비된 객체. out 위의 println 은 new PrintStream() 에서 나오거다.
		*System. 은 class type
		*System.out 은 PrintStream type
		*System.out.println() 은 그냥 호출 type 이 따로 없다.
		*
		* 필드에는 다른 객체에 참조값을 가지고 있을 수도 있다.
		*
		*
		*/
	}
}
