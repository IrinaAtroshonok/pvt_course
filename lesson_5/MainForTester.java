package home_work_5;

public class MainForTester {

	public static void main(String[] args) {
		String name = "Ira";
		String surname = "Atroshonok";
		int expirienceInYears = 2;
		String englishLevel = "B1-B2";
		double salary = 250.2;

		Tester tester = new Tester(name, surname, expirienceInYears, englishLevel);
		System.out.println(tester.getName() + " " + tester.getSurname() + " " + tester.getExpirienceInYears() + " "
				+ tester.getEnglishLevel());

		Tester tester1 = new Tester();
		tester1.printInformation(name, surname);

		Tester tester2 = new Tester();
		tester2.printInformation(name, surname, expirienceInYears);

		Tester tester3 = new Tester();
		tester3.printInformation(name, surname, expirienceInYears, salary);

		// Вызов статического метода
		Tester.compareExperience(expirienceInYears);
	}
}
