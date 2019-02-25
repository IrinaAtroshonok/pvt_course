package core;

import java.util.ArrayList;

public class Massive {
	private int number;
	private String name = "Ira";

	public int min(int a, int b) {
		return Math.min(a, b);
	}

	public int max(int a, int b) {
		return Math.max(a, b);
	}

	public int difference(int a, int b) {
		return a - b;
	}

	public int sum(int a, int b) {
		return a + b;
	}

	public int multiplie(int a, int b) {
		return a * b;
	}

	public int devided(int a, int b) {
		int c = 0;
		try {
			c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("деление на ноль");
		}
		return c;
	}

	public ArrayList<Integer> arrayFill(int size) {
		ArrayList<Integer> newList = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			newList.add((int) (Math.random() * 10));
		}
		return newList;
	}

	public int[] arraySort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		return arr;
	}

	public String modifiedString(String string) {
		return string + name;
	}

	public int parseInteger(String string) {
		return number = Integer.parseInt(string);
	}
}
