package home_work_10;

import java.util.ArrayList;

public class Sentence extends AbstractClass {

	@Override
	public ArrayList<String> Separate(ArrayList<String> arList) {
		ArrayList<String> stringArray = new ArrayList<>();
		for (int i = 0; i < arList.size(); i++) {
			for (String sentens : arList.get(i).split("\\.")) {
				stringArray.add(sentens.trim());
			}
		}
		return (stringArray);
	}
}