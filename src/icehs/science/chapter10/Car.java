package icehs.science.chapter10;

public class Car {

	private int oilSize;
	
	public void go(int distance)
	{
		System.out.println(distance + "km �̵��մϴ�.");
		System.out.println("���� : " + oilSize);
	}

	public int getOilSize() {
		return oilSize;
	}

	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}
}
