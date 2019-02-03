package home_work_7;

import java.io.IOException;
import java.util.Scanner;

//7. Ввести n слов с консоли. Найти слово, состоящее только из различных символов. Если таких слов несколько, найти первое из них.
public class Task7_7 {
	public static void main(String[] args) throws IOException {
		System.out.print("Введите количество строк: ");
		Scanner scanner = new Scanner(System.in);
		int arrsize = scanner.nextInt();

		String[] arrString = new String[arrsize];
		for (int i = 0; i < arrsize; i++) {
			System.out.print("Введите слово номер " + (i + 1) + ": ");
			arrString[i] = scanner.next();
		}

		for (int i = 0; i < arrsize; i++) {
			if (chechWord(arrString[i]) == 0) {
				System.out.print("Cлово, состоящее только из различных символов: " + arrString[i]);
				break;
			}
		}

		scanner.close();
	}

	public static int chechWord(String word) {
		char[] wordChars = word.toCharArray();
		int countdifSymbl = 0;
		for (int i = 0; i < wordChars.length - 1; i++) {
			for (int j = i; j < wordChars.length - 1; j++) {
				if (wordChars[i] != wordChars[j + 1]) {
					countdifSymbl = 0;
				} else {
					countdifSymbl = countdifSymbl + 1;
				}
			}

		}
		return countdifSymbl;
	}
}
