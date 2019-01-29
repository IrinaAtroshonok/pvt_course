package second_home_work;

import java.util.ArrayList;
//Создать список ArrayList, заполнить его строковыми или числовыми значениями. при помощи цикла for each:
//- вывести все элементы списка
//- к каждому из элементов прибавить любое число (или строку, если список строковый)
//- удалить последовательно все элементы
//- удалить сразу все элементы

public class Add_2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(26);
		list.add(30);

//Вывод всех элементов
		System.out.println("Вывод всех элементов");
		for (Integer i : list) {
			System.out.println(i);
		}
		System.out.println(" ");

//Прибавление числа к каждому элементу
		int n = 2;
		System.out.println("Прибавление" + " " + n + " " + "к каждому элементу");
		for (Integer i : list) {
			i = i + n;
			System.out.println(i);
		}
		System.out.println(" ");

//Удаление всех элементов последовательно	
		System.out.println("Удаление всех элементов последовательно");
		while (list.size() != 0) {
			list.remove(0);
			for (Integer i : list) {
				System.out.println(i);
			}
			System.out.println(" ");
		}

// Удаление всех элементов сразу 
//		list.clear();
//		list.removeAll(list); //работает гораздо медленне 

		System.out.println("Список пуст.");
	}

}
