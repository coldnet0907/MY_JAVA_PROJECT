package icehs.sciense.chapter06;

public class ChocolateTest {

	public static void main(String[] args) {
		Chocolate choco = new Chocolate();
		choco.name = "�������ݸ�";
		choco.type = "���ϵ�";
		choco.price = 2200;
		choco.printChocolateInfo();

		String chocoName = choco.getName();
		int totalPrice = choco.calculateTotalPrice(20);
		
		System.out.println(chocoName + " 20�� " + totalPrice + "��");
		choco.changeChocolateInfo("ũ��Ű", 2500);
	}

}
