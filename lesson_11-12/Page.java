package home_work_11_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Page {

	ArrayList<Button> arrayButton = new ArrayList<Button>();
	LinkedList<Field> linkedField = new LinkedList<Field>();
	HashSet<Label> hashSetLabel = new HashSet<Label>();
	HashMap<Integer, Dropdown> hashMapDropdown = new HashMap<Integer, Dropdown>();
	float id;
	String title;

	public Page(ArrayList<Button> arrayButton, LinkedList<Field> linkedField, HashSet<Label> hashSetLabel,
			HashMap<Integer, Dropdown> hashMapDropdown, float id, String title) {
		this.arrayButton = arrayButton;
		this.linkedField = linkedField;
		this.hashSetLabel = hashSetLabel;
		this.hashMapDropdown = hashMapDropdown;
		this.id = id;
		this.title = title;

	}

	@Override
	public String toString() {
		return (arrayButton + " " + linkedField + " " + hashSetLabel + " " + hashMapDropdown + " " + id + " " + title);
	}

	public void wrapperMethodArrayList(Button object) {
		this.arrayButton.add(object);
		this.arrayButton.remove(object);
		this.arrayButton.set(0, object);
		System.out.println(arrayButton);
	}

	public void wrapperMethodLinkedList(Field object) {
		this.linkedField.add(object);
		this.linkedField.remove(object);
		this.linkedField.set(0, object);
		System.out.println(linkedField);
	}

	public void wrapperMethodHashSet(Label oldlabel, Label object) {
		if (hashSetLabel.contains(oldlabel)) {
			this.hashSetLabel.remove(oldlabel);
			this.hashSetLabel.add(object);
		}
		System.out.println(hashSetLabel);
	}

	public void wrapperMethodHashMap(Integer key, Dropdown object) {
		this.hashMapDropdown.put(key, object);
		this.hashMapDropdown.remove(key, object);
		this.hashMapDropdown.put(key - 1, object);
		System.out.println(hashMapDropdown);
	}

//Сортировка пузырьками с Comparable	
	public void sortBubbls_1(ArrayList<Button> arr) {
		int size = arr.size();
		boolean isArrSorted = false;
		while (isArrSorted) {
			isArrSorted = true;
			for (int i = 0; i < size - 1; i++) {
				if ((arr.get(i).compareTo(arr.get(i + 1))) == 1) {
					isArrSorted = false;
					Button temp = arr.get(i);
					arr.set(i, arr.get(i + 1));
					arr.set((i + 1), temp);

				}

			}
		}

		System.out.println(arr);

	}
}
