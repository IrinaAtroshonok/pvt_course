package lesson_8;

import home_work_8.Tester;

public class ForTester {
	public static void main() {
// 7�. ��������� ������������� ��������, ������ ����� � ������� main ������� � ������ �����.
		String name = "Ira";
		String surName = "Atr";
		int expirience = 3;
		String level = "B2";
		double salary = 300;

		Tester tester1 = new Tester(name, surName, expirience);// friendly ����������� �������� ������� ������ � ��� ��
																// ������
		Tester tester = new Tester();

		System.out.println(tester.getName()); // friendly ����� �������� ������� ������ � ��� �� ������
		tester.setName(name); // friendly ����� �������� ������� ������ � ��� �� ������
		System.out.println(tester.getSurName()); // friendly ����� �������� ������� ������ � ��� �� ������
		tester.setSurName(surName); // friendly ����� �������� ������� ������ � ��� �� ������
		System.out.println(tester.getEnglishLevel()); // friendly ����� �������� ������� ������ � ��� �� ������
		tester.setEnglishLevel(level); // friendly ����� �������� ������� ������ � ��� �� ������
		System.out.println(tester.getExpirienceInYears()); // friendly ����� �������� ������� ������ � ��� �� ������
		tester.setExpirienceInYears(5); // friendly ����� �������� ������� ������ � ��� �� ������
		System.out.println(tester.getSalary()); // friendly ����� �������� ������� ������ � ��� �� ������
		tester.setSalary(salary); // friendly ����� �������� ������� ������ � ��� �� ������
		System.out.println(tester.countSalary()); // private ����� ����� ������ ������ ������, ��� ������
		System.out.println(tester.expirienceInMonth()); // friendly ����� �������� ������� ������ � ��� �� ������
		tester.printNameSurname(name, surName); // protected ����� �������� �������, ����������� � ��� �� ������ �
												// ����������- � ������ �������
		tester.printAllInformation(name, surName, expirience, level, salary);
	}
}
