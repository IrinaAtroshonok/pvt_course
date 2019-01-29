package home_work_3;

import java.util.Random;
//Проверить четное число или нечетное, вернуть boolean результат

public class Task3_2 {
	public static void main(String[] args) {
		Random random = new Random();
		int intrandnumb = 100;
		int number = random.nextInt(intrandnumb);
		System.out.println("Случайное число="+ " "+ number);
		System.out.println("Четное?" + " " + evenOddNumber(number));
	}

	public static boolean evenOddNumber(int number) {
		boolean numbreturn;
		if (number % 2 == 0) {
			numbreturn = true;
		} else {
			numbreturn = false;
		}
		return numbreturn;
	}

}
