package second_home_work;

import java.util.Random;
import java.util.Scanner;
//����� ����� ������������-������������� ��������� � �������
public class Task2_9 {
	public static void main(String[] args) {
		System.out.print("������� ������ �������:" + " ");
		Scanner size = new Scanner(System.in);
		int size_arr = size.nextInt();
		Random rand = new Random();
		size.close();
		int[] arr = new int[size_arr];
		// ���������� ������� ������
//		for (int i = 0; i < size_arr; i++) {
//			System.out.print("�������" + " " + (i + 1) + " " + "������� �������:" + " ");
//			Scanner element = new Scanner(System.in);
//			int element_n = element.nextInt();
//			arr[i] = element_n;
//		}

		// ���������� ������� �������������
		for (int i = 0; i < size_arr; i++) {
			arr[i] = rand.nextInt(20);
			System.out.println(arr[i]);
		}
		System.out.println(" ");

		int min = arr[0];
		int min_numb = 0;
		int max = arr[0];
		int max_numb = 0;
		for (int i = 1; i < size_arr; i++) {
			if (min > arr[i]) {
				min = arr[i];
				min_numb = i;
			}

			if (max < arr[i]) {
				max = arr[i];
				max_numb = i;
			}
		}
		System.out.print("����� ������������ ��������:" + " ");
		for (int i = 0; i < size_arr; i++) {
			if (arr[min_numb] == arr[i]) {
				{
					System.out.print(i + "; ");
				}

			}
		}
		System.out.println(" ");
		System.out.print("����� ������������� ��������:" + " ");
		for (int i = 0; i < size_arr; i++) {
			if (arr[max_numb] == arr[i]) {
				{
					System.out.print(i + "; ");
				}

			}
		}
	}

}
