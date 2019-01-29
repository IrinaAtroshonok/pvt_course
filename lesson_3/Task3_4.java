package home_work_3;

import java.util.Random;
//Возвести число в куб, вернуть результат возведения

public class Task3_4 {
	public static void main(String[] args) {
		int intrandnumb = 10;
		Random random = new Random();
		int number = random.nextInt(intrandnumb);
		System.out.println("Случайное число" + " " + number);
		System.out.println("Число в кубе" + " " + numberPow(number));
	}

	public static int numberPow(int number) {
		return (int) Math.pow(number, 3);
	}

}
