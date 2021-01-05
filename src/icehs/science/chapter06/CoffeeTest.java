package icehs.science.chapter06;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee ame = new Coffee();
		Coffee latte = new Coffee();
		Coffee macci = new Coffee();
		ame.name = "아메리카노";
		ame.price = 3500;
		ame.printCoffeeInfo();
		
		latte.name = "카페 라뗴";
		latte.price = 4000;
		latte.printCoffeeInfo();
		
		macci.name = "카라멜 마끼아또";
		macci.price = 4500;
		macci.printCoffeeInfo();
		
		int priceSum = ame.getPrice() + latte.getPrice() + macci.getPrice();
		System.out.println("합계 : " + priceSum + "원");
	}

}
