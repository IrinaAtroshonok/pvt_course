package home_work_11_12;

import java.util.ArrayList;

public class Button implements Comparable<Button> {
	String name;
	String action;

	public Button() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public Button(String name, String action) {
		this.name = name;
		this.action = action;
	}

	@Override
	public String toString() {
		return (name + " " + action);
	}

	@Override
	public int compareTo(Button newButton) {
		int result = this.name.length() - newButton.name.length();
//		return result == 1 ? 1 : 0;
		if (result != 0) {
			return result / result;
		} else
			return 0;
	}
}
