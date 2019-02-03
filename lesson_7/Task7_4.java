package home_work_7;

import java.io.IOException;
import java.util.Scanner;

//4. Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.
public class Task7_4 {
	public static void main(String[] args) throws IOException {
		System.out.print("Введите количество строк: ");
		Scanner scanner = new Scanner(System.in);
		int arrsize = scanner.nextInt();

		String[] arrString = new String[arrsize];
		for (int i = 0; i < arrsize; i++) {
			System.out.print("Введите слово номер " + (i + 1) + ": ");
			arrString[i] = scanner.next();
		}

		String word = arrString[0];
		for (int i = 1; i < arrsize; i++) {
			if (countDifSymbols(word) > countDifSymbols(arrString[i])) {
				word = arrString[i];
			}
		}
		System.out.print(word);
		scanner.close();
	}

	public static int countDifSymbols(String word) {
		char[] wordChars = word.toCharArray();
		int countdifSymbl = 0;
		for (int i = 0; i < wordChars.length - 1; i++) {
			for (int j = i; j < wordChars.length - 1; j++) {
				if (wordChars[i] != wordChars[j + 1]) {
					countdifSymbl++;
				}
			}

		}
		return countdifSymbl;
	}

}
