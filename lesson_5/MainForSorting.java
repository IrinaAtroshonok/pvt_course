package home_work_5;

import java.util.Arrays;
import java.util.Scanner;

public class MainForSorting {

	public static void main(String[] args) {
		System.out.print("������� ������ �������:" + " ");
		Scanner sizeArr = new Scanner(System.in);
		int size = sizeArr.nextInt();
		int[] arr = new int[size];
		sizeArr.close();
		System.out.print("������: ");
		for (int i = 0; i < size; i++) {
			arr[i] = (int) (Math.random() * 10);
			System.out.print(arr[i] + " ");
		}
//���������� ��������
		System.out.println(" ");
//	SortByInset.sorting(arr);

//���������� ��������
		System.out.println(Arrays.toString(MergeSort.sort(arr)));

//���������� �����
//		ShellSort.sortingShell(arr);
	}

}
