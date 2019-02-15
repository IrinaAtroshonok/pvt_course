package home_work_11_12;

import java.util.ArrayList;
import java.util.List;

public class Dropdown {
	List<String> options = new ArrayList<String>();
	private boolean isSelected;
	private String name;

	public Dropdown(List<String> options, boolean isSelected, String name) {
		this.options = options;
		this.isSelected = isSelected;
		this.name = name;

	}

	@Override
	public String toString() {
		return (options + " " + isSelected + " " + name);
	}

}
