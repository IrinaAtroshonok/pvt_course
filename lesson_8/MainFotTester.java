package home_work_8;

public class MainFotTester {
	public static void main() {
//	7. � ������ main ������� ������ (������), �������� � ��� �� ������ ��� � Tester, ������� ������ ������ Tester,
//		��������� ����� �� ������������� �������������. ������������������ ���������������� ����� ���� ������� ������ Tester, 
//		���� ��� ��������. ���� ���������� - �������� ����������� ������. 		
		String name = "Ira";
		String surName = "Atr";
		int expirience = 3;
		String level = "B2";
		double salary = 300;

		Tester tester1 = new Tester(name, surName, expirience);

		Tester tester = new Tester();
		System.out.println(tester.getName());
		tester.setName(name);
		System.out.println(tester.getSurName());
		tester.setSurName(surName);
		System.out.println(tester.getEnglishLevel());
		tester.setEnglishLevel(level);
		System.out.println(tester.getExpirienceInYears());
		tester.setExpirienceInYears(5);
		System.out.println(tester.getSalary());
		tester.setSalary(salary);
		System.out.println(tester.countSalary()); // private ����� ����� ������ ������ ������, ��� ������
		System.out.println(tester.expirienceInMonth());
		tester.printNameSurname(name, surName);
		tester.printAllInformation(name, surName, expirience, level, salary);

	}
}
