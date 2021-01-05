package icehs.science.chapter06;

public class Overloading {
	
	public void addition(int a, int b)
	{
		int result = a + b;
		System.out.println(result);
	}
	public void addition(double a, double b)
	{
		double result = a + b;
		System.out.println(result);
	}
	public void addition(String a, String b)
	{
		String result = a + b;
		System.out.println(result);
	}
}
