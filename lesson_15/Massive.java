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

	public ArrayList<Integer> arrayFill(int size) {
		ArrayList<Integer> newList = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			newList.add((int) (Math.random() * 10));
		}
		return newList;
	}

	public String modifiedString(String string) {
		return string + name;
	}

	public int parseInteger(String string) {
		return number = Integer.parseInt(string);
	}

}
