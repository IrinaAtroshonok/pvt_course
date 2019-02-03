package home_work_7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//8. ������ n ���� � �������. ����� ����, ��������� ������ �� ����, ����� �����-���������. ���� ����� ���� ������ ������, ����� ������ �� ���.
public class Task7_8 {
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

// ����� �����, ��������� ������ �� ����
		ArrayList<String> listNumber = new ArrayList<>();
		for (int i = 0; i < arrsize; i++) {
			String word = arrString[i];
			if ((isNumberWord(word)) == true) {
				listNumber.add(arrString[i]);
			}
		}

// ����� �����-���������
		ArrayList<String> listPalindrom = new ArrayList<>();
		for (String word : listNumber) {
			boolean isWordPalindrome = word.equals(new StringBuilder(word).reverse().toString());
			if (isWordPalindrome) {
				listPalindrom.add(word);
			}
		}

		if (listPalindrom.size() == 1) {
			System.out.println("������� ������ ���� �����-���������: " + listPalindrom.get(0));
		} else {
			System.out.println("������ �����-���������: " + listPalindrom.get(1));
		}
	}

	public static boolean isNumberWord(String word) {
		Pattern p = Pattern.compile("[0-9]+");
		Matcher m = p.matcher(word);
		return (m.matches());
	}

}
