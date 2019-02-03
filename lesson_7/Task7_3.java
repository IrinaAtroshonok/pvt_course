package home_work_7;

import java.io.IOException;
import java.util.Scanner;

//3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.
public class Task7_3 {
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

		int sumLength = 0;
		for (int i = 0; i < arrsize; i++) {
			sumLength = sumLength + arrString[i].length();
		}
		int averageLength = sumLength / arrsize;
		for (int i = 0; i < arrsize; i++) {
			if (arrString[i].length() < averageLength) { // длина которых меньше средней
				System.out.print(arrString[i]);
			}
			System.out.println(" ");
			if (arrString[i].length() > averageLength) { // длина которых больше средней
				System.out.print(arrString[i]);
			}
		}
		scanner.close();
		scanner1.close();
	}
}
