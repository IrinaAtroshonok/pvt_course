package second_home_work;

import java.util.Scanner;
//������ 3-� ������� �������� �� 2 (2-�� ���������)
public class Task2_3 {
	public static void main(String[] args) {
		System.out.print("������� ������ �������:" + " ");
		Scanner size = new Scanner(System.in);
		int size_arr = size.nextInt();
		size.close();
		double[] arr = new double[size_arr];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
			System.out.println(arr[i]);
		}
		System.out.println(" ");
//������ �����
//		for (int i = 2; i < size_arr; i += 3) {
//			arr[i] = arr[i] * 2;
//			System.out.println(arr[i]);
//		}
//		System.out.println(" ");

// ������ �����

		int count = 1;
		for (int i = 0; i < size_arr; i++) {
			if (count % 3 == 0) {
				arr[i] = arr[i] * 2;
				System.out.println(arr[i]);
			}
			count++;
		}

	}

}
