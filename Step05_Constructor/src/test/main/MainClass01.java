package test.main;

import test.mypac.Member;
import test.mypac.Student;

public class MainClass01 {
	public static void main(String[] args) {
		//변수에 담아두지 않은 생성자는 다시 사용 할 수 없다.
		new Student();
		//생성만 하는게 아니라 생성후 또 사용하고 싶다면 변수에 담아두자.
		Student s1=new Student();
		//생성자를 하나라도 정의를 하면 default 생성자는 사라진다.
		new Member(1, "김구라", "노량진");
		//위의 예를 참조값에 담고 싶다면
		Member m1=new Member(2, "해골", "행신동");
		
		s1.study();
		//하지만 .study()를 한번만 사용할 거라면. (일회용으로 사용시)
		//굳이 변수에 담아 사용하는게 아니라 객체에 . 찍어서 사용하면 된다.
		new Student().study();
		
		//생성자만 따로 불러내서 사용할 수 있다.(생성자를 다중정의 할 시.)
		//원래는 안되지만 생성자를 하나 더 만들었기에 가능. 안되는 이유는
		//위에서 이미 new Member를 만들어 변수에 담아두고 사용했기 때문에.(정의했기에?)
		new Member();
		//인자에 아무것도 없으면 num=0,null,null . 아무것도 들어가지 않는다.
		Member m3=new Member();
	}
}
