package home_work_7;

import java.io.IOException;
import java.util.Scanner;

//1. Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину
public class Task7_1 {

	public static void main(String[] args) throws IOException {
		System.out.print("Введите количество строк: ");
		Scanner scanner = new Scanner(System.in);
		int arrsize = scanner.nextInt();

		String[] arrString = new String[arrsize];
		Scanner scanner1 = new Scanner(System.in);// ввела потому, что иначе он в первую строку подставляет пробел
		for (int i = 0; i < arrsize; i++) {
			System.out.print("Введите строку номер " + (i + 1) + ": ");
			arrString[i] = scanner1.nextLine();
		}

		String shortString = arrString[0];
		String longString = arrString[0];

		for (int i = 0; i < arrsize - 1; i++) {
			if (shortString.length() > arrString[i + 1].length()) {
				shortString = arrString[i + 1];
			}
			if (longString.length() < arrString[i + 1].length()) {
				longString = arrString[i + 1];
			}
		}

		System.out.println("Самая короткая строка: " + shortString + ", её длина = " + shortString.length());

		System.out.println("Самая длинная строка: " + longString + ", её длина = " + longString.length());
		scanner.close();
		scanner1.close();

	}

}
