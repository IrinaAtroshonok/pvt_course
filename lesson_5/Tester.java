package home_work_5;

public class Tester {
	public String name;
	public String surname;
	public int expirienceInYears;
	public String englishLevel;
	public double salary;

	public Tester() {

	}

	public Tester(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public Tester(String name, String surname, int years) {
		this(name, surname);
		this.expirienceInYears = years;
	}

	public Tester(String name, String surname, int years, String englevel) {
		this(name, surname, years);
		this.englishLevel = englevel;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getExpirienceInYears() {
		return expirienceInYears;
	}

	public String getEnglishLevel() {
		return englishLevel;
	}

	public double getSalary() {
		return salary;
	}

	public void printInformation(String name, String surname) {
		this.name = name;
		this.surname = surname;
		System.out.println("Name: " + name + " Surnme: " + surname);
	}

	public void printInformation(String name, String surname, int expirienceInYears) {
		this.name = name;
		this.surname = surname;
		this.expirienceInYears = expirienceInYears;
		System.out.println("Name: " + name + " Surnme: " + surname + " Expiriens: " + expirienceInYears);
	}

	public void printInformation(String name, String surname, int expirienceInYears, double salary) {
		this.name = name;
		this.surname = surname;
		this.expirienceInYears = expirienceInYears;
		this.salary = salary;
		System.out.println(
				"Name: " + name + " Surnme: " + surname + " Expiriens: " + expirienceInYears + " Salary: " + salary);
	}

	public static void compareExperience(int expirienceInYears) {
		if (expirienceInYears >= 2) {
			System.out.println("ќпыт работы от 2 лет");
		}

	}
}
