package second_home_work;

import java.util.Scanner;
//������ �� �������, ������� ��� �������� � ������ � � �������� �������
public class Task2_1 {
	public static void main(String[] args) {
		System.out.print("������� ������ �������:" + " ");
		Scanner size = new Scanner(System.in);
		int size_arr = size.nextInt();
		

		double[] arr = new double[size_arr];
		Scanner element = new Scanner(System.in);
		for (int i = 0; i < size_arr; i++) {
			System.out.print("�������" + " " + (i + 1) + " " + "������� �������:" + " ");
			int element_n = element.nextInt();
			arr[i] = element_n;
			}

		element.close();
		int i = 0;
		while (i < size_arr) {
			System.out.println(arr[i]);
			i++;
		}
		System.out.println(" ");
		size.close();
		
		int a = size_arr - 1;
		while (a >= 0) {
			System.out.println(arr[a]);
			a--;
		}
	}

}
