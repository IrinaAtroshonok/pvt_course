package home_work_7;

import java.io.IOException;
import java.util.Scanner;

//6. Ввести n слов с консоли. Найти слово, символы в котором идут в строгом порядке возрастания их кодов.
//Если таких слов несколько, найти первое из них.
public class Task7_6 {
	public static void main(String[] args) throws IOException {
		System.out.print("Введите количество строк: ");
		Scanner scanner = new Scanner(System.in);
		int arrsize = scanner.nextInt();

		String[] arrString = new String[arrsize];
		for (int i = 0; i < arrsize; i++) {
			System.out.print("Введите слово номер " + (i + 1) + ": ");
			arrString[i] = scanner.next();
		}
		scanner.close();

		String word;
		for (int i = 0; i < arrsize; i++) {
			word = arrString[i];
			if (isWordSymbolCodesInAsc(word) == true) {
				System.out.println("Cлово, символы в котором идут в строгом порядке возрастания их кодов: " + word);
				break;
			}
		}
	}

	public static boolean isWordSymbolCodesInAsc(String word) {
		char[] wordChars = word.toCharArray();
		boolean result = false;
		if (wordChars.length < 1) {
			return false;
		}
		for (int i = 0; i < wordChars.length - 1; i++) {
			if ((wordChars[i + 1] <= wordChars[i])) {
				result = false;
			} else {
				result = true;
			}
		}
		return result;
	}

}