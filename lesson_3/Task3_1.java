package home_work_3;

import java.util.Scanner;
//Найти минимальное число из 2 чисел, вернуть минимальное

public class Task3_1 {
	public static void main(String[] args) {
		System.out.print("Введите первое число" + " ");
		Scanner number1 = new Scanner(System.in);
		int num_1 = number1.nextInt();

		System.out.print("Введите второе число" + " ");
		Scanner number2 = new Scanner(System.in);
		int num_2 = number2.nextInt();

		System.out.println("Минимальное число =" + " " + minNumber(num_1, num_2));
		number1.close();
		number2.close();
	}

	public static int minNumber(int number1, int number2) {
		int min_numb = 0;
		if (number1 < number2) {
			min_numb = number1;
		} else {
			min_numb = number2;
		}

		return min_numb;
	}

}
