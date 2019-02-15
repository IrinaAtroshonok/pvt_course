package home_work_11_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Iterator;

public class MainClassForAll {
	public static void main(String[] args) {
		Integer key = 0;
		Integer key_2 = 1;
		String title = "Заголовок Page 1";
		float id = 1;
		Button but = new Button("Редактировать", "upd");
		Button but_2 = new Button("Удалить", "del");
		Button but_3 = new Button("Сохранить", "save");
		Button but_4 = new Button("Bp", "cd");
		Field field = new Field(0, "Первое поле ввода значения");
		Field field_2 = new Field(1, "Второе поле ввода значения");
		Label label = new Label("Первая метка");
		Label label_2 = new Label("Вторая метка");

		List<String> dropDownOptions = new ArrayList<String>();
		dropDownOptions.add("Первое значение выпадающего списка");

		Dropdown dropdown1 = new Dropdown(dropDownOptions, true, "nameDropDown");

		List<String> dropDownOptions_2 = new ArrayList<String>();

		dropDownOptions_2.add("Первое значение второго выпадающего списка");
		Dropdown dropdown2 = new Dropdown(dropDownOptions_2, false, "nameDropDown_2");

		ArrayList<Button> arrayButton = new ArrayList<Button>();
		arrayButton.add(but);

		LinkedList<Field> linkedField = new LinkedList<Field>();
		linkedField.add(field);

		HashSet<Label> hashSetLabel = new HashSet<Label>();
		hashSetLabel.add(label);

		HashMap<Integer, Dropdown> hashMapDropdown = new HashMap<Integer, Dropdown>();
		hashMapDropdown.put(key, dropdown1);

		Page page = new Page(arrayButton, linkedField, hashSetLabel, hashMapDropdown, id, title);

		System.out.println("Page: " + page.toString()); // Page

		page.wrapperMethodArrayList(but_2);
		page.wrapperMethodLinkedList(field_2);
		page.wrapperMethodHashSet(label, label_2);
		page.wrapperMethodHashMap(key_2, dropdown2);
		System.out.println("Page ch: " + page.toString()); // измененный Page

		ArrayList<Button> arrayButtonForSort = new ArrayList<Button>();
		arrayButtonForSort.add(but);
		arrayButtonForSort.add(but_2);
		arrayButtonForSort.add(but_3);

		System.out.println("Сортировка");
		page.sortBubbls_1(arrayButtonForSort);

// TreeSet
		SortedSet<Label> labelTree = new TreeSet<Label>();
		labelTree.add(label); // не работает, элементы не добавляются
		labelTree.add(label_2);
		labelTree.add(new Label("Испания"));
		labelTree.remove("Испания");
		Iterator<Label> itr = labelTree.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().toString());
		}

	}
}
