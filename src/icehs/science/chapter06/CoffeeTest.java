package icehs.science.chapter06;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee ame = new Coffee();
		Coffee latte = new Coffee();
		Coffee macci = new Coffee();
		ame.name = "�Ƹ޸�ī��";
		ame.price = 3500;
		ame.printCoffeeInfo();
		
		latte.name = "ī�� ���";
		latte.price = 4000;
		latte.printCoffeeInfo();
		
		macci.name = "ī��� �����ƶ�";
		macci.price = 4500;
		macci.printCoffeeInfo();
		
		int priceSum = ame.getPrice() + latte.getPrice() + macci.getPrice();
		System.out.println("�հ� : " + priceSum + "��");
	}

}
