package home_work_7;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//2. ������ n ����� � �������. ����������� � ������� ������ � ������� ����������� (��������) �������� �� �����.
public class Task7_2 {

	public static void main(String[] args) throws IOException {
		System.out.print("������� ���������� �����: ");
		Scanner scanner = new Scanner(System.in);
		int arrsize = scanner.nextInt();

		String[] arrString = new String[arrsize];
		Scanner scanner1 = new Scanner(System.in); // ����� ������, ��� ����� �� � ������ ������ ����������� ������
		for (int i = 0; i < arrsize; i++) {
			System.out.print("������� ������ ����� " + (i + 1) + ": ");
			arrString[i] = scanner1.nextLine();
		}
//� ������� �����������
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

// � ������� ��������
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
