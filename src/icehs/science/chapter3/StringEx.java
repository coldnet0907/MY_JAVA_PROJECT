package icehs.science.chapter3;

public class StringEx {

	public static void main(String[] args) {
		String name = "����ȯ";
		String school = "����õ�����б�";
		String fullName = name + school;
		String strYear = "2020";
		int nextYear = Integer.parseInt(strYear) + 1;
		String ndYear = 1 + strYear;
		
		
		System.out.println("���� : " + name);
		System.out.println("�Ҽ��б��� : " + school);
		System.out.println("��ü�̸� : " + fullName);
		System.out.println("���� : " + strYear + "��");
		System.out.println("���� : " + nextYear + "��");
		System.out.println("�ǹ� �� ���� : " + ndYear + "��");
	}

}