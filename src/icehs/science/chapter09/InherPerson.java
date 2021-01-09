package icehs.science.chapter09
;

public class InherPerson {
	public static void main(String[] args) {
		
		Person person[] = {new Person(), new Student(), new Teacher()};
		
		for(int i = 0; i < person.length; i++)
		{
			person[1].eat();
			person[1].sleep();
			System.out.println();
		}
		
	}
}
