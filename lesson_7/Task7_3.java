package home_work_7;

import java.io.IOException;
import java.util.Scanner;

//3. ������ n ����� � �������. ������� �� ������� �� ������, ����� ������� ������ (������) �������, � ����� �����.
public class Task7_3 {
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

		int sumLength = 0;
		for (int i = 0; i < arrsize; i++) {
			sumLength = sumLength + arrString[i].length();
		}
		int averageLength = sumLength / arrsize;
		for (int i = 0; i < arrsize; i++) {
			if (arrString[i].length() < averageLength) { // ����� ������� ������ �������
				System.out.print(arrString[i]);
			}
			System.out.println(" ");
			if (arrString[i].length() > averageLength) { // ����� ������� ������ �������
				System.out.print(arrString[i]);
			}
		}
		scanner.close();
		scanner1.close();
	}
}
