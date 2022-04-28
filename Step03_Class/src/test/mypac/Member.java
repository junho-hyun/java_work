package test.mypac;

public class Member {
	//필드
	public int num=1;
	public String name="김구라";
	public String addr="노량진";		
	
	//메소드
	public void showInfo() {
		//필드에 저장된 내용을아래와 같은 형식으로 출콘솔창에 출력하는 코드를 작성해 보세요.
		//번호:1, 이름:김구라, 주소:노량진
		System.out.println("번호:"+this.num+",이름:"+this.name+",주소:"+this.addr);
	}
}


// public class Member {
//	public int num=;
//	public String name;
//	public String addr=;	
// }  	이렇게 되면 int 에는 선언만 하면 기본값 0이 들어간다
//		String 에 선언하면 name과addr 에는 null 이 기본값으로 저장된다.
// 		최초 기본값에 따라 무엇을 넣을지 선택하면 된다.	

