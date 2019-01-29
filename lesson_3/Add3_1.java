package home_work_3;

import java.util.Scanner;

public class Add3_1 {
	public static void main(String[] args) {
		System.out.print("Введите размер массива:" + " ");
		Scanner size = new Scanner(System.in);
		int size_arr = size.nextInt();
		size.close();

		System.out.print("Массив:" + " ");
		int[] arr = new int[size_arr];
		for (int i = 0; i < size_arr; i++) {
			arr[i] = (int) (Math.random() * 10);
			System.out.print(arr[i] + " ");
		}
//Task2_1 Вывод массива в прямом порядке
		System.out.println(" ");
		System.out.print("Массив в прямом порядке:" + " ");
		directOrder(arr);

//Task2_1 Вывод массива в обратном порядке		
		System.out.println(" ");
		System.out.print("Массив в обратном порядке:" + " ");
		reverseOrder(arr);

//Task2_2 Вывод произведения всех элементов массива	
		System.out.println(" ");
		System.out.println("Произведение элементов=" + " " + getMultiply(arr));

//Task2_3 Вывод массива где каждый 3 элемент*2
		System.out.print("Массив, где каждый 3 элемент *2:" + " ");
		int[] result1 = therdElement(arr);
		for (int i = 0; i < result1.length; i++) {
			System.out.print(result1[i] + " ");
		}

//Task2_4 Вывод количества нулевых элементов.Если нулевых элементов нет - вывести сообщение, что их нет.
		System.out.println(" ");
		countZeroElement(arr);

//Task2_5 Вывод номеров нулевых элементов. если нулевых элементов нет - вывести сообщение, что их нет 		
		ZeroElements(arr);

// Task2_6 Вывод массива, где каждые 2 соседних элемента изменены местами
		System.out.print("Массив, где каждые 2 соседних элемента изменены местами:" + " ");
		swopElements(arr);

// Task2_7 пройти по массиву и поменять местами первый и последний, второй и предпоследний и т.д.
		System.out.println(" ");
		System.out.print("Массив, где изменены местами первый и последний, второй и предпоследний и т.д.:" + " ");
		swopElements1(arr);

// Task2_8 найти минимальный-максимальный элементы и вывести
		System.out.println(" ");
		minMaxElements(arr);

// Task2_9 найти номер минимального-максимального элементов и вывести
		minMaxElementsNumber(arr);

// Task2_10 проверить, является ли массив возрастающей последовательностью(каждое следующее число больше предыдущего)
		System.out.println(" ");
		sequenceMas(arr);

//Task2_11 заменить все элементы массива на полусумму соседних элементов
		System.out.print("Массив, где все элементы заменены на полусумму соседних элементов:" + " ");
		changeElements(arr);

// Task2_12 циклически сдвинуть все элементы вправо на 2 позиции (1-й элемент станет 3-м, 2-й стент 4-м и т.д.)
		System.out.println(" ");
		System.out.print("Массив, где все элементы сдвинуты вправо на 2 позиции:" + " ");
		moveElements(arr);

	}

//Task2_1 Массив в прямом порядке
	public static void directOrder(int[] anyMas) {
		for (int i = 0; i < anyMas.length; i++) {
			System.out.print(anyMas[i] + " ");
		}
	}

//Task2_1 Массив в обратном порядке
	public static int[] reverseOrder(int[] anyMas) {
		for (int i = anyMas.length - 1; i >= 0; i--) {
			System.out.print(anyMas[i] + " ");
		}
		return anyMas;
	}

//Task2_2 произведение всех элементов массива	
	public static int getMultiply(int[] anyMas) {
		int mult = 1;
		for (int i = 0; i < anyMas.length; i++) {
			mult = mult * anyMas[i];
		}
		return mult;
	}

//Task2_3 каждый 3-й элемент умножить на 2
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

//Task2_4 Найти количество нулевых элементов, вывести количество. если нулевых элементов нет - вывести сообщение, что их нет
	public static void countZeroElement(int[] anyMas) {
		int count = 0;
		for (int i = 0; i < anyMas.length; i++) {
			if (anyMas[i] == 0) {
				count++;
			}
		}
		if (count != 0) {
			System.out.println("Количество нулевый элементов=" + count);
		} else {
			System.out.println("Нулевых элементов нет. (Задача найти количество)");
		}
	}

//Task2_5 найти и вывести номер нулевых элементов. если нулевых элементов нет - вывести сообщение, что их нет
	public static void ZeroElements(int[] anyMas) {
		int count = 0;
		for (int i = 0; i < anyMas.length; i++) {
			if (anyMas[i] == 0) {
				System.out.println("Номер нулевого элемента:" + i + " ");
				count++;
			}
		}
		if (count == 0)
			System.out.println("Нулевых элементов нет. (Задача найти номера нулевых элементов)");
	}

//Task2_6 пройти по массиву и поменять местами каждые 2 соседних элемента
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

//Task2_7 пройти по массиву и поменять местами первый и последний, второй и предпоследний и т.д.
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

//Task2_8 найти минимальный-максимальный элементы и вывести	
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
		System.out.println("Минимальное значение:" + " " + min);
		System.out.println("Макcимальное значение:" + " " + max);
	}

//Task2_9 найти номер минимального-максимального элементов и вывести	
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
		System.out.print("Номер минимального элемента:" + " ");
		for (int i = 0; i < anyMas.length; i++) {
			if (anyMas[min_numb] == anyMas[i]) {
				{
					System.out.print(i + "; ");
				}

			}
		}
		System.out.println(" ");
		System.out.print("Номер максимального элемента:" + " ");
		for (int i = 0; i < anyMas.length; i++) {
			if (anyMas[max_numb] == anyMas[i]) {
				{
					System.out.print(i + "; ");
				}

			}
		}
	}

//Task2_10 проверить, является ли массив возрастающей последовательностью (каждое следующее число больше предыдущего)
	public static void sequenceMas(int[] anyMas) {
		for (int i = 1; i < anyMas.length; i++) {
			if (anyMas[i] > anyMas[i - 1]) {
				continue;
			} else {
				System.out.println("Массив не является возрастающей последовательностью.");
				break;
			}
		}
	}

//Task2_11 заменить все элементы массива на полусумму соседних элементов
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

//Task2_12 циклически сдвинуть все элементы вправо на 2 позиции (1-й элемент станет 3-м, 2-й стент 4-м и т.д.)	
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
