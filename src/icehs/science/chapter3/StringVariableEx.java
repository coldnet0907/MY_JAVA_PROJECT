package icehs.science.chapter3;

public class StringVariableEx {
	
	public static void main(String[] args) {
		
		String name = "정재환";
		String mathScore = "96";
		int englishScore = 82;
		
		int parseMathScore = Integer.parseInt(mathScore);
		
		System.out.println("이름 : " + name);
		System.out.println("수학 점수 : " + mathScore);
		System.out.println("영어 점수 : " + englishScore);
		System.out.println("____________");
		System.out.println(mathScore + englishScore);
		System.out.println(parseMathScore + englishScore);

	}

}
