package icehs.science.chapter06;

public class Building {
	String name; // 멤버 변수
	String address; // 멤버 변수
	int totalFloor; // 멤버 변수
	
	public void moveElevator() {
		System.out.println("엘리베이터를 운행합니다.");
	}
	
	public void changeAddress(String newAddress) {
		address = newAddress;
	}

}
