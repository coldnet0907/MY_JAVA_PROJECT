package icehs.science.chapter09;

public class Teacher extends Person {

	private String subject;
	
	@Override
	void eat()
	{
		super.eat();
		System.out.println("ȥ�� �Խ��ϴ�.");
	}
	
	void teach()
	{
		System.out.println("����Ĩ�ϴ�.");
	}
}
