package second_home_work;

import java.util.Random;
import java.util.Scanner;
//���������� �������� ��� �������� ������ �� 2 ������� (1-� ������� ������ 3-�, 2-� ����� 4-� � �.�.)
public class Task2_12 {
	public static void main(String[] args) {
		System.out.print("������� ������ �������:" + " ");
		Scanner size = new Scanner(System.in);
		Random rand = new Random();

		int size_arr = size.nextInt();
		int[] arr = new int[size_arr];
		size.close();
		for (int i = 0; i < size_arr; i++) {
			arr[i] = rand.nextInt(20);
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");

		int k = 2;
		int[] arr2 = new int[size_arr];
		arr2[0] = arr[size_arr - 2];
		arr2[1] = arr[size_arr - 1];
		for (int i = 0; i < size_arr - 2; i++) {
			arr2[i + k] = arr[i];

		}
		for (int x : arr2)
			System.out.print(x + " ");
	}


}
