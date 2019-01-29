package home_work_4;

public class Person {
	public String name;
	public String surname;
	public int age;
	public String phone;

	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return this.surname;
	}

	public int getAge() {
		return this.age;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void printAllInformatation(String name, String surname, int age, String phone) {
		System.out.println(name + ", " + surname + ", " + age + ", " + phone);
	}

	public void printName(String name, String surname) {
		System.out.println(name + " " + surname);
	}

	public boolean isAdult(int age) {
		boolean areYouBigBoy;
		int mansAge =18;
		if (age > mansAge) {
			areYouBigBoy = true;
		} else {
			areYouBigBoy = false;
		}
		return areYouBigBoy;
	}
}
