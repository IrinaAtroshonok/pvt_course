package home_work_7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//5. ������ n ���� � �������. ����� ���������� ����, ���������� ������ ������� ���������� ��������,
//� ����� ��� � ���������� ���� � ������ ������ ������� � ��������� ����.
public class Task7_5 {
	public static void main(String[] args) throws IOException {
		System.out.print("������� ���������� �����: ");
		Scanner scanner = new Scanner(System.in);
		int arrsize = scanner.nextInt();

		String[] arrString = new String[arrsize];
		for (int i = 0; i < arrsize; i++) {
			System.out.print("������� ����� ����� " + (i + 1) + ": ");
			arrString[i] = scanner.next();
		}
		scanner.close();
// ����� ���������� ����, ���������� ������ ������� ���������� ��������
		int countLatinWords = 0;
		ArrayList<String> listLatinWords = new ArrayList<>();
		for (int i = 0; i < arrsize; i++) {
			String word = arrString[i];
			if ((isItLatinWord(word)) == true) {
				listLatinWords.add(arrString[i]);
				countLatinWords = countLatinWords + 1;
			}
		}
		System.out.println("���������� ����, ���������� ������ ������� ���������� ��������:" + countLatinWords);
// C���� ��� � ���������� ���� � ������ ������ ������� � ��������� ����
		int coutWords = 0;
		for (String word : listLatinWords) {
			if ((vowelsConsonants(word)) == true) {
				coutWords = coutWords + 1;
			}
		}
		System.out.println("���������� ���� � ������ ������ ������� � ��������� ����: " + coutWords);
	}

	public static boolean isItLatinWord(String word) {
		Pattern p = Pattern.compile("[a-zA-Z]+");
		Matcher m = p.matcher(word);
		return (m.matches());
	}

	public static boolean vowelsConsonants(String word) {
		int vowelsCount;
		int consonantsCount;
		vowelsCount = word.replaceAll("[^aeiouA,E,I,O,U]", "").length();
		consonantsCount = word.replaceAll("[aeiouA,E,I,O,U]", "").length();
		return (vowelsCount == consonantsCount);

	}
}