package icehs.science.chapter10;

public class Teacher extends Person {

	private String subject;
	
	@Override
	void eat()
	{
		System.out.println("ȥ�� �Խ��ϴ�.");
	}
	
	void teach()
	{
		System.out.println("����Ĩ�ϴ�.");
	}
}
