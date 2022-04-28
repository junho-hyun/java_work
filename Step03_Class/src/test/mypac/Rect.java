package test.mypac;

public class Rect {
	public int width;
	public int height;
	//면적을 콘솔에 출력하는 메소드
	public void showArea() {
		//면적 얻어내기
		int area=this.width*this.height;
		//콘솔에 출력하기
		System.out.println("사각형의 넓이는: "+area);
	}
	//면적을 메소드를 호출한 곳으로 리턴해주는 메소드
	public int getArea() {
		int area=width*height;
		return area;
	}
}
