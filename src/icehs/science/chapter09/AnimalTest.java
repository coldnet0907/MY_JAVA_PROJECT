package icehs.science.chapter09;

public class AnimalTest {
	public static void main(String[] args) {
		
		Cat cat = new Cat(3, "其福矫救", "具克捞");
		
		cat.intro1();
		cat.intro();
		cat.run();
		cat.hunt();
		cat.play();
		
		System.out.println();
		
		Dog d1 = new Dog(2, "矫海府救倾胶虐", "港港捞"); 
		d1.intro1();
		d1.intro();
		d1.run();
		d1.hunt();
	}
}
