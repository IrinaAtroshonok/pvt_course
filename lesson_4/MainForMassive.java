package home_work_4;

import java.util.Scanner;

public class MainForMassive {

	public static void main(String[] args) {
		System.out.print("Введите размер массива:" + " ");
		Scanner sizeArr = new Scanner(System.in);
		int size = sizeArr.nextInt();
		int[] arr = new int[size];
		sizeArr.close();
		System.out.print("Массив: ");
		for (int i = 0; i < size; i++) {
			arr[i] = (int) (Math.random() * 10);
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");

		Massive massive = new Massive();
		System.out.print("Массив в прямом порядке: ");
		massive.printMassiveAsLine(arr);
		System.out.println(" ");

		System.out.print("Массив в обратном порядке: ");
		massive.printReverseMassiveAsLine(arr);
		System.out.println(" ");

		System.out.println("Сумма всех элементов массива=  " + massive.getSumOfElements(arr));

		System.out.print("Массив, где каждый элемент полученного массива умножен на 3: ");
		int[] result1 = massive.multiptyBy3(arr);
		for (int i = 0; i < result1.length; i++) {
			System.out.print(result1[i] + " ");
		}
		
		System.out.println(" ");
		System.out.println("Массив, где каждый элемент полученного массива умножен на 3: ");
		System.out.print("- в прямом порядке: ");
		massive.printMassiveAsLine(result1);
		System.out.println(" ");
		
		System.out.print("- обратном порядке: ");
		massive.printReverseMassiveAsLine(massive.multiptyBy3(arr));
		System.out.println(" ");

		System.out.print("Первоначальный массив: ");
		massive.printMassiveAsLine(arr);
		
	}

}
