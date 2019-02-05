package lesson_8;

import home_work_8.Tester;

public class ForTester {
	public static void main() {
// 7а. Повторить вышеописанные действия, однако класс с методом main вынести в другой пакет.
		String name = "Ira";
		String surName = "Atr";
		int expirience = 3;
		String level = "B2";
		double salary = 300;

		Tester tester1 = new Tester(name, surName, expirience);// friendly конструктор доступен классам только в том же
																// пакете
		Tester tester = new Tester();

		System.out.println(tester.getName()); // friendly метод доступен классам только в том же пакете
		tester.setName(name); // friendly метод доступен классам только в том же пакете
		System.out.println(tester.getSurName()); // friendly метод доступен классам только в том же пакете
		tester.setSurName(surName); // friendly метод доступен классам только в том же пакете
		System.out.println(tester.getEnglishLevel()); // friendly метод доступен классам только в том же пакете
		tester.setEnglishLevel(level); // friendly метод доступен классам только в том же пакете
		System.out.println(tester.getExpirienceInYears()); // friendly метод доступен классам только в том же пакете
		tester.setExpirienceInYears(5); // friendly метод доступен классам только в том же пакете
		System.out.println(tester.getSalary()); // friendly метод доступен классам только в том же пакете
		tester.setSalary(salary); // friendly метод доступен классам только в том же пакете
		System.out.println(tester.countSalary()); // private метод виден только внутри класса, где создан
		System.out.println(tester.expirienceInMonth()); // friendly метод доступен классам только в том же пакете
		tester.printNameSurname(name, surName); // protected метод доступен классам, находящимся в том же пакете и
												// подклассам- в других пакетах
		tester.printAllInformation(name, surName, expirience, level, salary);
	}
}
