package home_work_10;

import java.util.ArrayList;

public class Words extends AbstractClass {
	@Override	
	public ArrayList<String> Separate(ArrayList<String> arList) {
		ArrayList<String> wordArray = new ArrayList<>();
		for (int i = 0; i < arList.size(); i++) {
			for (String word : arList.get(i).split(" ")) {
				wordArray.add(word);
			}
		}
		return (wordArray);
	}

//Замена симола	
	public String[] replacementChar(ArrayList<String> arList, int lettrerPossition, String symbol) {
		String[] resultArray = new String[arList.size()];
		resultArray = arList.toArray(resultArray);

		for (int i = 0; i < resultArray.length; i++) {
			if (resultArray[i].length() >= lettrerPossition) {
				resultArray[i] = resultArray[i].substring(0, lettrerPossition - 1) + symbol
						+ resultArray[i].substring(lettrerPossition);
			}

		}
		return (resultArray);
	}
}
