package icehs.science.chapter09;

public class Student extends Person {
	
	private String departMent;
	
	@Override
	void eat()
	{
		super.eat();
		System.out.println("ȥ�� �Ծ��.");
	}
	
	void study()
	{
		System.out.println("���θ� �մϴ�.");
	}
}
