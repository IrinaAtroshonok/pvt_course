package home_work_8;

public class Tester_1 {
	private double salary = 200;

//создаем private конструктор. В другом классе объявить переменную класса Tester уже нельзя
	private Tester_1() {
		
	}

	public double countSalary() {
		return this.salary * 2;
	}
//созадем public static метод getObj, который возвращает объект этого класса. В другом классе будем его вызывать для создания объекта.
	public static Tester_1 getObj() {
		return new Tester_1();
	}
}


//2.можно метод сдеаль статическим и вызвать в другом классе через название класса (как метод getObj смотри MainForTester_1) 
//3.Использовать отражения (смотри MainForTester_1_2)