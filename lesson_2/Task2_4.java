package second_home_work;

import java.util.Scanner;
//����� ���������� ������� ���������, ������� ����������. ���� ������� ��������� ��� - ������� ���������, ��� �� ���
public class Task2_4 {
	public static void main(String[] args) {
		System.out.print("������� ������ �������:" + " ");
		Scanner size = new Scanner(System.in);
		int size_arr = size.nextInt();
		size.close();
		int[] arr = new int[size_arr];
		for (int i = 0; i < size_arr; i++) {
			arr[i] = (int) (Math.random() * 10);
			System.out.println(arr[i]);
		}
		int count = 0;
		for (int i = 0; i < size_arr; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}
		if (count != 0) {
			System.out.println("���������� ������� ���������=" + count);
		} else {
			System.out.println("������� ��������� ���.");
		}
	}

}
