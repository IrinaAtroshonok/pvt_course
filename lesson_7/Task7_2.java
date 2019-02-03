package home_work_7;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//2. ¬вести n строк с консоли. ”пор€дочить и вывести строки в пор€дке возрастани€ (убывани€) значений их длины.
public class Task7_2 {

	public static void main(String[] args) throws IOException {
		System.out.print("¬ведите количество строк: ");
		Scanner scanner = new Scanner(System.in);
		int arrsize = scanner.nextInt();

		String[] arrString = new String[arrsize];
		Scanner scanner1 = new Scanner(System.in); // ввела потому, что иначе он в первую строку подставл€ет пробел
		for (int i = 0; i < arrsize; i++) {
			System.out.print("¬ведите строку номер " + (i + 1) + ": ");
			arrString[i] = scanner1.nextLine();
		}
//в пор€дке возрастани€
		for (int i = 1; i < arrsize; i++) {
			for (int j = i; j > 0; j--) {
				String temporary;
				if (arrString[j - 1].length() > arrString[j].length()) {
					temporary = arrString[j];
					arrString[j] = arrString[j - 1];
					arrString[j - 1] = temporary;
				} else {
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arrString));

// в пор€дке убывани€
		for (int i = 1; i < arrsize; i++) {
			for (int j = i; j > 0; j--) {
				String temporary;
				if (arrString[j - 1].length() < arrString[j].length()) {
					temporary = arrString[j];
					arrString[j] = arrString[j - 1];
					arrString[j - 1] = temporary;
				} else {
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arrString));
		scanner.close();
		scanner1.close();
	}
}
