package dto;

public class SalesDto {
	private int num;
	private String kinds;
	private String price;
	
	public SalesDto() {}
	
	public SalesDto(int num, String kinds, String price) {
		super();
		this.num=num;
		this.kinds=kinds;
		this.price=price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num=num;
	}
	public String getKinds() {
		return kinds;
	}
	public void setKinds(String kinds) {
		this.kinds=kinds;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price=price;
	}

}
