package icehs.science.chapter07;
public class ItBook {
	
	
	public ItBook(String title, int price, double discountRate) {
		super();
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
	}
	private String title;
	private int price;
	private double discountRate;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public void printItBookInfo()
	{
		System.out.println("제목 : " + this.title + ", 정가 : " + this.price + " 원, 할인율 : " + this.discountRate + "%, 할인가 : " + (int)(this.price * (100 - discountRate) / 100) );
	}
	
	
}
