package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		//국어점수
		int kor=95;
		//영어점수
		int eng=100;
		
		//국어 점수와 영어 점수의 평균을 구해서 변수에 담고 그 결과를 콘솔창에 출력해 보세요.
		float avg = (kor + eng) / 2f;
		System.out.println("평균:"+avg);
		
	// 혹은 double avg=(kor+eng)/2d or 2.0;
	// 자바에서는 정수끼리 연산하면 정수만 나온다.

	}
}
