package icehs.science.chapter10;

public class CarTest {
	public static void main(String[] args) {
		Car[] cars = {new Car(), new Car()};
		cars[0].setOilSize(10);
		cars[0].go(20);
		((Taxi)cars[0]).setMaxNum(4);
		
		cars[1].setOilSize(10);
		((Truck)cars[1]).setMaxWeight(100);
		cars[1].go(30);
	}
}
