package icehs.science.chapter10;

public class Teacher extends Person {

	private String subject;
	
	@Override
	void eat()
	{
		System.out.println("혼자 먹습니다.");
	}
	
	void teach()
	{
		System.out.println("가르칩니다.");
	}
}
