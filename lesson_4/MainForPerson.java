package home_work_4;

public class MainForPerson {

	public static void main(String[] args) {
		String name = "Ira";
		String surname = "Atroshonok";
		int age = 25;
		String phone = "+375(29)123-45-67";
		Person person = new Person();
		person.setName(name);
		person.setSurname(surname);
		person.setAge(age);
		person.setPhone(phone);
		System.out.println("Name: " + person.getName());
		System.out.println("Surname: " + person.getSurname());
		System.out.println("Age: " + person.getAge());
		System.out.println("Phone: " + person.getPhone());
		person.printAllInformatation("Ira", "Atroshonok", 25, "+375(29)123-45-67");
		person.printName(person.getName(), person.getSurname());
		System.out.println("Are you big boy? " + person.isAdult(age));
	}

}
