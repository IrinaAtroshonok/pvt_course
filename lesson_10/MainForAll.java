package home_work_10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainForAll {
	public static void main(String[] args) throws IOException {
		System.out.print("Введите номер буквы для замены: ");
		Scanner scanner = new Scanner(System.in);
		int lettrerPossition = scanner.nextInt();
		String symbol = "%";

		Paragraph paragraph = new Paragraph();
		ArrayList<String> paragraphArray = paragraph.separateParagraph();
		paragraph.printArray(paragraphArray);

		Sentence sentence = new Sentence();
		ArrayList<String> stringArray = sentence.Separate(paragraphArray);
		System.out.println("Строки: " + stringArray);

		Words words = new Words();
		ArrayList<String> wordArray = words.Separate(stringArray);
		String resultArray[] = words.replacementChar(wordArray, lettrerPossition, symbol);
		System.out.println("Слова с заменённым символом: " + String.join(" ", resultArray));

		scanner.close();

	}
}