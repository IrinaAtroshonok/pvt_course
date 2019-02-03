package home_work_7;

import java.io.IOException;
import java.util.Scanner;

//1. ������ n ����� � �������, ����� ����� �������� � ����� ������� ������. ������� ��������� ������ � �� �����
public class Task7_1 {

	public static void main(String[] args) throws IOException {
		System.out.print("������� ���������� �����: ");
		Scanner scanner = new Scanner(System.in);
		int arrsize = scanner.nextInt();

		String[] arrString = new String[arrsize];
		Scanner scanner1 = new Scanner(System.in);// ����� ������, ��� ����� �� � ������ ������ ����������� ������
		for (int i = 0; i < arrsize; i++) {
			System.out.print("������� ������ ����� " + (i + 1) + ": ");
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

		System.out.println("����� �������� ������: " + shortString + ", � ����� = " + shortString.length());

		System.out.println("����� ������� ������: " + longString + ", � ����� = " + longString.length());
		scanner.close();
		scanner1.close();

	}

}
