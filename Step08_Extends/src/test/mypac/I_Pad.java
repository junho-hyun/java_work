package test.mypac;

public class I_Pad extends SmartPhone {
	public I_Pad() {
		System.out.println("I_Pad 생성자 호출됨!");
	}
	public void actLiDar() {
		System.out.println("LiDarScanner를 사용해요");
	}
	@Override
	public void takePicture() {
		System.out.println("1000 만 화소의 고화질 사진을 찍어요!");
		
	}
}
