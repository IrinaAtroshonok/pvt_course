package home_work_8;

public class Tester {
	public String name = "Ivan";
	private String surName = "Ivanov";
	protected int expirienceInYears = 10;
	String englishLevel = "B1";
	private double salary = 200;

	// 1. ����������� � ���� ������ 3 ������������, ������ �� ������� �����
	// ��������������� �������� ������ ��������� this(...); ����������� � ����������
	// ������ ���������� ������� � ������� ������� ��������.

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

//2. �������� ��� ������� ���� get- � set- ������ � ������� ������� ������ ������ ������.

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

//3. �������� ����� � ������� ������� ������ ������ ������, ������� ����� ���������� salary*2
	private double countSalary() {
		return this.salary * 2;
	}

//4. �������� ����� � ������� ������� ������ ������ ������, ������� ����� ���������� ���������� ����� � �������;

	int expirienceInMonth() {
		return this.expirienceInYears * 22;
	}

//	5. �������� ����� � ������� ������� ������ ������ � ��� ����������� � ������ �������, ������� ������� �� ����� ��� � �������;

	protected void printNameSurname(String name, String surName) {
		setName(name);
		setSurName(surName);
		System.out.println("Name: " + getName() + " Surnme: " + getSurName());
	}

//6. �������� ����� � ������� ������� ��������, ������� � ���� ������ ����� �������� ��� ���������� � ������������.

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
