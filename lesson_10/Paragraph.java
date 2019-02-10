package home_work_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Paragraph implements InterfaceClass {
	public ArrayList<String> separateParagraph() {
		System.out.print(
				"Введите тест (разделитель для абзацев слово paragraph, разделитель для пердложений символ .): ");
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\\s*paragraph\\s*");

		ArrayList<String> paragraphArray = new ArrayList<>();
		while (scanner.hasNext()) {
			paragraphArray.add(scanner.next());
		}
		return (paragraphArray);
	}

	@Override
	public void printArray(ArrayList<String> paragraphArray) {
		System.out.println("Абзацы: " + paragraphArray);

	}
}
