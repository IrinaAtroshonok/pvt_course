package home_work_3;

import java.util.Random;
//Возвести число в квадрат, вернуть результат возведения

public class Task3_3 {
	public static void main(String[] args) {
		int intrandnumb = 10;
		Random random = new Random();
		int number = random.nextInt(intrandnumb);
		System.out.println("Случайное число=" + " " + number);
		System.out.println("Число в квадрате=" + " " + numberPow(number));
	}

	public static int numberPow(int number) {
		return (int) Math.pow(number, 2);
	}

}
