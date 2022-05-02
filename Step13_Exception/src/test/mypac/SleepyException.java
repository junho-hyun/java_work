package test.mypac;

public class SleepyException extends RuntimeException{
	//MainClass05
	
	//생성자
	public SleepyException(String msg) {
		//예외 메세지를 생성장의 인자로 전달 받아서 부모 생성자에 전달한다.
		super(msg);
	}
}
