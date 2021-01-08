package icehs.science.chapter10;

public class Truck extends Car{
	private int maxWeight;
	
	
	public Truck(int maxWeight) {
		super();
		this.maxWeight = maxWeight;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
	
	
}
