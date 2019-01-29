package home_work_3;

import java.util.Scanner;

public class Add3_1 {
	public static void main(String[] args) {
		System.out.print("������� ������ �������:" + " ");
		Scanner size = new Scanner(System.in);
		int size_arr = size.nextInt();
		size.close();

		System.out.print("������:" + " ");
		int[] arr = new int[size_arr];
		for (int i = 0; i < size_arr; i++) {
			arr[i] = (int) (Math.random() * 10);
			System.out.print(arr[i] + " ");
		}
//Task2_1 ����� ������� � ������ �������
		System.out.println(" ");
		System.out.print("������ � ������ �������:" + " ");
		directOrder(arr);

//Task2_1 ����� ������� � �������� �������		
		System.out.println(" ");
		System.out.print("������ � �������� �������:" + " ");
		reverseOrder(arr);

//Task2_2 ����� ������������ ���� ��������� �������	
		System.out.println(" ");
		System.out.println("������������ ���������=" + " " + getMultiply(arr));

//Task2_3 ����� ������� ��� ������ 3 �������*2
		System.out.print("������, ��� ������ 3 ������� *2:" + " ");
		int[] result1 = therdElement(arr);
		for (int i = 0; i < result1.length; i++) {
			System.out.print(result1[i] + " ");
		}

//Task2_4 ����� ���������� ������� ���������.���� ������� ��������� ��� - ������� ���������, ��� �� ���.
		System.out.println(" ");
		countZeroElement(arr);

//Task2_5 ����� ������� ������� ���������. ���� ������� ��������� ��� - ������� ���������, ��� �� ��� 		
		ZeroElements(arr);

// Task2_6 ����� �������, ��� ������ 2 �������� �������� �������� �������
		System.out.print("������, ��� ������ 2 �������� �������� �������� �������:" + " ");
		swopElements(arr);

// Task2_7 ������ �� ������� � �������� ������� ������ � ���������, ������ � ������������� � �.�.
		System.out.println(" ");
		System.out.print("������, ��� �������� ������� ������ � ���������, ������ � ������������� � �.�.:" + " ");
		swopElements1(arr);

// Task2_8 ����� �����������-������������ �������� � �������
		System.out.println(" ");
		minMaxElements(arr);

// Task2_9 ����� ����� ������������-������������� ��������� � �������
		minMaxElementsNumber(arr);

// Task2_10 ���������, �������� �� ������ ������������ �������������������(������ ��������� ����� ������ �����������)
		System.out.println(" ");
		sequenceMas(arr);

//Task2_11 �������� ��� �������� ������� �� ��������� �������� ���������
		System.out.print("������, ��� ��� �������� �������� �� ��������� �������� ���������:" + " ");
		changeElements(arr);

// Task2_12 ���������� �������� ��� �������� ������ �� 2 ������� (1-� ������� ������ 3-�, 2-� ����� 4-� � �.�.)
		System.out.println(" ");
		System.out.print("������, ��� ��� �������� �������� ������ �� 2 �������:" + " ");
		moveElements(arr);

	}

//Task2_1 ������ � ������ �������
	public static void directOrder(int[] anyMas) {
		for (int i = 0; i < anyMas.length; i++) {
			System.out.print(anyMas[i] + " ");
		}
	}

//Task2_1 ������ � �������� �������
	public static int[] reverseOrder(int[] anyMas) {
		for (int i = anyMas.length - 1; i >= 0; i--) {
			System.out.print(anyMas[i] + " ");
		}
		return anyMas;
	}

//Task2_2 ������������ ���� ��������� �������	
	public static int getMultiply(int[] anyMas) {
		int mult = 1;
		for (int i = 0; i < anyMas.length; i++) {
			mult = mult * anyMas[i];
		}
		return mult;
	}

//Task2_3 ������ 3-� ������� �������� �� 2
	public static int[] therdElement(int[] oldMas) {
		int count = 1;
		int[] newMas = new int[oldMas.length];
		for (int i = 0; i < newMas.length; i++) {
			if (count % 3 == 0) {
				newMas[i] = oldMas[i] * 2;
			} else {
				newMas[i] = oldMas[i];
			}
			count++;
		}
		return newMas;
	}

//Task2_4 ����� ���������� ������� ���������, ������� ����������. ���� ������� ��������� ��� - ������� ���������, ��� �� ���
	public static void countZeroElement(int[] anyMas) {
		int count = 0;
		for (int i = 0; i < anyMas.length; i++) {
			if (anyMas[i] == 0) {
				count++;
			}
		}
		if (count != 0) {
			System.out.println("���������� ������� ���������=" + count);
		} else {
			System.out.println("������� ��������� ���. (������ ����� ����������)");
		}
	}

//Task2_5 ����� � ������� ����� ������� ���������. ���� ������� ��������� ��� - ������� ���������, ��� �� ���
	public static void ZeroElements(int[] anyMas) {
		int count = 0;
		for (int i = 0; i < anyMas.length; i++) {
			if (anyMas[i] == 0) {
				System.out.println("����� �������� ��������:" + i + " ");
				count++;
			}
		}
		if (count == 0)
			System.out.println("������� ��������� ���. (������ ����� ������ ������� ���������)");
	}

//Task2_6 ������ �� ������� � �������� ������� ������ 2 �������� ��������
	public static void swopElements(int[] anyMas) {
		int[] temparr = new int[anyMas.length];
		for (int i = 0; i < anyMas.length - 1; i += 2) {
			temparr[i] = anyMas[i + 1];
			temparr[i + 1] = anyMas[i];
		}
		for (int x : temparr) {
			System.out.print(x + " ");
		}
	}

//Task2_7 ������ �� ������� � �������� ������� ������ � ���������, ������ � ������������� � �.�.
	public static void swopElements1(int[] anyMas) {
		int[] temparr = new int[anyMas.length];
		for (int i = 0; i < anyMas.length / 2; i++) {
			// int temp = anyMas[anyMas.length - i - 1];
			temparr[anyMas.length - i - 1] = anyMas[i];
			temparr[i] = anyMas[anyMas.length - i - 1];
			;
		}
		for (int x : temparr) {
			System.out.print(x + " ");
		}
	}

//Task2_8 ����� �����������-������������ �������� � �������	
	public static void minMaxElements(int[] anyMas) {
		int min = anyMas[0];
		int max = anyMas[0];
		for (int i = 0; i < anyMas.length; i++) {
			if (min > anyMas[i]) {
				min = anyMas[i];
			}
			if (max < anyMas[i]) {
				max = anyMas[i];
			}
		}
		System.out.println("����������� ��������:" + " " + min);
		System.out.println("���c�������� ��������:" + " " + max);
	}

//Task2_9 ����� ����� ������������-������������� ��������� � �������	
	public static void minMaxElementsNumber(int[] anyMas) {
		int min = anyMas[0];
		int min_numb = 0;
		int max = anyMas[0];
		int max_numb = 0;
		for (int i = 1; i < anyMas.length; i++) {
			if (min > anyMas[i]) {
				min = anyMas[i];
				min_numb = i;
			}

			if (max < anyMas[i]) {
				max = anyMas[i];
				max_numb = i;
			}
		}
		System.out.print("����� ������������ ��������:" + " ");
		for (int i = 0; i < anyMas.length; i++) {
			if (anyMas[min_numb] == anyMas[i]) {
				{
					System.out.print(i + "; ");
				}

			}
		}
		System.out.println(" ");
		System.out.print("����� ������������� ��������:" + " ");
		for (int i = 0; i < anyMas.length; i++) {
			if (anyMas[max_numb] == anyMas[i]) {
				{
					System.out.print(i + "; ");
				}

			}
		}
	}

//Task2_10 ���������, �������� �� ������ ������������ ������������������� (������ ��������� ����� ������ �����������)
	public static void sequenceMas(int[] anyMas) {
		for (int i = 1; i < anyMas.length; i++) {
			if (anyMas[i] > anyMas[i - 1]) {
				continue;
			} else {
				System.out.println("������ �� �������� ������������ �������������������.");
				break;
			}
		}
	}

//Task2_11 �������� ��� �������� ������� �� ��������� �������� ���������
	public static void changeElements(int[] anyMas) {
		int[] arr2 = new int[anyMas.length];
		arr2[0] = anyMas[0];
		arr2[anyMas.length - 1] = anyMas[anyMas.length - 1];
		for (int i = 1; i < anyMas.length - 1; i++) {
			int count = (anyMas[i - 1] + anyMas[i + 1]) / 2;
			arr2[i] = count;
		}
		for (int x : arr2)
			System.out.print(x + " ");
	}

//Task2_12 ���������� �������� ��� �������� ������ �� 2 ������� (1-� ������� ������ 3-�, 2-� ����� 4-� � �.�.)	
	public static void moveElements(int[] anyMas) {
		int k = 2;
		int[] arr2 = new int[anyMas.length];
		arr2[0] = anyMas[anyMas.length - 2];
		arr2[1] = anyMas[anyMas.length - 1];
		for (int i = 0; i < anyMas.length - 2; i++) {
			arr2[i + k] = anyMas[i];

		}
		for (int x : arr2)
			System.out.print(x + " ");
	}
}
