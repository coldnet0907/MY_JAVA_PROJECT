package icehs.science.chapter09;

public class Animal {

	private int age;
	private String kind;
	
	public Animal(int age, String kind) {
		super();
		this.age = age;
		this.kind = kind;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void intro()
	{
		System.out.println("나이 : " + age + "살");
		System.out.println("종류 : " + kind);
	}
	
	public void run()
	{
		System.out.println("달려라!!!");
	}
}
