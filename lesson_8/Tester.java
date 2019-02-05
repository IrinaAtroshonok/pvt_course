package home_work_8;

public class Tester {
	public String name = "Ivan";
	private String surName = "Ivanov";
	protected int expirienceInYears = 10;
	String englishLevel = "B1";
	private double salary = 200;

	// 1. Перегрузить в этом классе 3 конструктора, каждый из которых будет
	// последовательно вызывать другой используя this(...); Конструктор с наибольшим
	// числом параметров сделать с уровнем доступа отовсюду.

	public Tester() {

	}

	Tester(String name, String surname, int expirienceInYears) {
		this.name = name;
		this.surName = surname;
		this.expirienceInYears = expirienceInYears;
	}

	protected Tester(String name, String surname, int expirienceInYears, String englishLevel) {
		this(name, surname, expirienceInYears);
		this.englishLevel = englishLevel;
	}

	public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
		this(name, surname, expirienceInYears, englishLevel);
		this.salary = salary;
	}

//2. Написать для каждого поля get- и set- методы с уровнем доступа только внутри пакета.

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getSurName() {
		return surName;
	}

	void setSurName(String surName) {
		this.surName = surName;
	}

	int getExpirienceInYears() {
		return expirienceInYears;
	}

	void setExpirienceInYears(int expirienceInYears) {
		this.expirienceInYears = expirienceInYears;
	}

	String getEnglishLevel() {
		return englishLevel;
	}

	void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

//3. Написать метод с уровнем доступа только внутри класса, который будет возвращать salary*2
	private double countSalary() {
		return this.salary * 2;
	}

//4. Написать метод с уровнем доступа только внутри пакета, который будет возвращать количество опыта в месяцах;

	int expirienceInMonth() {
		return this.expirienceInYears * 22;
	}

//	5. Написать метод с уровнем доступа внутри пакета и для наследников в других пакетах, который выводит на экран имя и фамилию;

	protected void printNameSurname(String name, String surName) {
		setName(name);
		setSurName(surName);
		System.out.println("Name: " + getName() + " Surnme: " + getSurName());
	}

//6. Написать метод с уровнем доступа отовсюду, который в одну строку будет выводить всю информацию о пользователе.

	public void printAllInformation(String name, String surname, int expirienceInYears, String englishLevel,
			double salary) {
		setName(name);
		setSurName(surName);
		setExpirienceInYears(expirienceInYears);
		setEnglishLevel(englishLevel);
		setSalary(salary);
		System.out.println("Name: " + getName() + " Surnme: " + getSurName() + "Expirience in years: "
				+ getExpirienceInYears() + " English Level: " + getEnglishLevel() + " Salary: " + getSalary());
	}
}
