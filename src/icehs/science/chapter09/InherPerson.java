package icehs.science.chapter09
;

public class InherPerson {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		Student st1 = new Student();
		Teacher t1 = new Teacher();
		
		p1.eat();
		p1.sleep();
		
		st1.eat();
		st1.sleep();
		st1.study();
		
		t1.eat();
		t1.sleep();
		t1.teach();
		
		
	}
}
