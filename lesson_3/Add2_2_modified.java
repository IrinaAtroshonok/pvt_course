package home_work_3;

import java.util.ArrayList;
//Создать список ArrayList, заполнить его строковыми или числовыми значениями. при помощи цикла for each:
//- вывести все элементы списка
//- к каждому из элементов прибавить любое число (или строку, если список строковый)
//- удалить последовательно все элементы
//- удалить сразу все элементы

public class Add2_2_modified {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(26);
		list.add(30);

		getElements(list);
		addNumberToAllElements(list);
		deleteAllElementsConsistently(list);
		deleteAllElements(list);

	}

//Вывод всех элементов
	public static void getElements(ArrayList<Integer> anyList) {
		System.out.println("Вывод всех элементов:");
		for (Integer i : anyList) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
	}

//Прибавление числа к каждому элементу
	public static void addNumberToAllElements(ArrayList<Integer> anyList) {
		int n = 2;
		System.out.println("Прибавление" + " " + n + " " + "к каждому элементу:");
		for (Integer i : anyList) {
			i = i + n;
			System.out.print(i + " ");
		}
		System.out.println(" ");
	}

//Удаление всех элементов последовательно	
	public static void deleteAllElementsConsistently(ArrayList<Integer> anyList) {
		System.out.println("Удаление всех элементов последовательно:");
		while (anyList.size() != 0) {
			anyList.remove(0);
			for (Integer i : anyList) {
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}
		System.out.println("Список пуст.");
	}

	// Удаление всех элементов сразу
	public static void deleteAllElements(ArrayList<Integer> anyList) {
		System.out.println("Удаление всех элементов сразу:");
		anyList.clear();
//		list.removeAll(list); //работает гораздо медленне 
		System.out.println("Список пуст.");
	}
}
