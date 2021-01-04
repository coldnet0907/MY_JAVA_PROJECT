package icehs.sciense.chapter06;

public class ChocolateTest {

	public static void main(String[] args) {
		Chocolate choco = new Chocolate();
		choco.name = "가나초콜릿";
		choco.type = "마일드";
		choco.price = 2200;
		choco.printChocolateInfo();

		String chocoName = choco.getName();
		int totalPrice = choco.calculateTotalPrice(20);
		
		System.out.println(chocoName + " 20개 " + totalPrice + "원");
		choco.changeChocolateInfo("크런키", 2500);
	}

}
