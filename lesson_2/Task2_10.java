package second_home_work;

import java.util.Scanner;
//���������, �������� �� ������ ������������ ������������������� (������ ��������� ����� ������ �����������)
public class Task2_10 {
	public static void main(String[] args) {
		System.out.print("������� ������ �������:" + " ");
		Scanner size = new Scanner(System.in);
		int size_arr = size.nextInt();

		int[] arr = new int[size_arr];
		Scanner element = new Scanner(System.in);
		for (int i = 0; i < size_arr; i++) {
			System.out.print("�������" + " " + (i + 1) + " " + "������� �������:" + " ");
			int element_n = element.nextInt();
			arr[i] = element_n;
		}
		System.out.println(" ");
		element.close();
		for (int i = 1; i < size_arr; i++) {
			if (arr[i] > arr[i -1]) {
				continue;
			}
			else {System.out.println("������ �� �������� ������������ �������������������.");
				break;}
		
		}
		
		size.close();
	}

}
