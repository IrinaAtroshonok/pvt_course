package home_work_13;

import java.util.Scanner;

public class Massive {
	private String name;
	private int years;
	private String lastName;
	String[] array = new String[2];

	// try catch
	public void firstExcheption(int i) {
		try {
			this.years = 12 / i;
		} catch (ArithmeticException e) {
			System.out.println("деление на ноль");
		}
	}

	// несколько catch
	public void secondExcheption(String arr[]) {
		try {
			System.out.println(2 / Integer.parseInt(arr[0]));
			System.out.println(arr[1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("выход за пределы массива");
		} catch (ArithmeticException e) {
			System.out.println("деление на ноль");
		}
	}

	// multi-catch
	public void thirdExcheption(String string) {
		this.name = string;
		try {
			System.out.println(name.charAt(10));
			System.out.println(Integer.parseInt(name));
		} catch (StringIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("Либо нет такого элмента, либо невозвожно приветси к int");
		}
	}

//try-catch-finally
	public void fourthExcheption(String string) {
		this.lastName = string;
		try {
			System.out.println(lastName.charAt(10));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Ошибка StringIndexOutOfBoundsException");
		} finally {
			System.out.println("Отобразится в любом случае");
		}
	}

	// try with resources
	public void firstAddExcheption() {
		String input = "";
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ведите символ : ");
			input = scanner.nextLine();
			System.out.println("Вы ввели: " + input);
		}
	}

	// try внутри try
	public void secondAddExcheption(String arr[]) {
		try {
			for (int i = 0; i < arr.length; i++) {
				array[i] = arr[i];
			}
			try {
				int number = 0;
				for (int i = 0; i < arr.length; i++) {
					number = number + Integer.parseInt(arr[i]);
				}
			} catch (NumberFormatException e) {
				System.out.println("Не подходящий формат");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("выход за пределы массива");
		}
	}

	// метод с finally, но finally не вызывается
	public void thirdAddExcheption() {
		try {
			System.exit(0); // программа завершает своё выполнение
		} finally {
			System.out.println("Не выведется");
		}
	}
}
