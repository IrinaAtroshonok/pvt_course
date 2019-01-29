package second_home_work;

import java.util.Random;
import java.util.Scanner;
//�� �������� ������� ��������� ������, ��������� ��� ���������� ������� ��� �������. ��� ����� �������:
//- ������� ��� �������� � ������ � �������� �������
//- ����� ����������� � ������������ ��������

public class Add_1 {
	public static void main(String[] args) {
		System.out.print("������� ���������� ����� �������");
		Scanner row = new Scanner(System.in);
		int row_arr = row.nextInt();

		System.out.print("������� ���������� �������� �������");
		Scanner column = new Scanner(System.in);
		int column_arr = column.nextInt();
		row.close();
		column.close();

		int[][] arr = new int[row_arr][column_arr];
		Random rand = new Random();

		for (int i = 0; i < row_arr; i++) {
			for (int j = 0; j < column_arr; j++) {
				arr[i][j] = rand.nextInt(100);
			}
		}
//����� ��������� � ������ �������
		for (int i = 0; i < row_arr; i++) {
			for (int j = 0; j < column_arr; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
//����� ��������� � �������� �������		
		for (int i = row_arr - 1; i >= 0; i--) {
			for (int j = column_arr - 1; j >= 0; j--) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
//����������� ������� �������			
		int min = arr[0][0];
		for (int i = 0; i < row_arr; i++) {
			for (int j = 0; j < column_arr; j++) {
				if (min > arr[i][j]) {
					min = arr[i][j];
				}
			}
		}
		System.out.println("����������� ������ �������:" + min);
//������������ ������� �������			
		int max = arr[0][0];
		for (int i = 0; i < row_arr; i++) {
			for (int j = 0; j < column_arr; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		System.out.println("������������ ������ �������:" + max);
	}

}
