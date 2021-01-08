package icehs.science.chapter10;

public class Student extends Person {
	
	String departMent;
	
	@Override
	void eat()
	{

		System.out.println("혼자 먹어요.");
	}
	
	void study()
	{
		System.out.println("공부를 합니다.");
	}
}
