package test.mypac;

@FunctionalInterface	
// @FunctionalInterface 이걸 앞에 붙이면 아래 메소드를 하나밖에 생성 못한다.
// 무조건 추상 메소드를 생성해야한다.
public interface Joinner {
	public String join(String one, String two);

}
