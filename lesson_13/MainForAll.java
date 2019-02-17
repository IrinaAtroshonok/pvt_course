package home_work_13;

public class MainForAll {
	public static void main(String[] args) {
		String string = "q2qwertyuigt";

		Massive massive = new Massive();

		String[] array = new String[4];
		array[0] = "1";
		array[1] = "2";
		array[2] = "3";
		array[3] = "4";

		String[] array2 = new String[2];
		array2[0] = "df";
		array2[1] = "sd";

		String[] array3 = new String[2];
		array3[0] = "0";
		array3[1] = "2";

		massive.firstExcheption(0); // try catch
		massive.secondExcheption(array3); // несколько catch
		massive.thirdExcheption(string);// multi-catch
		massive.fourthExcheption(string); // try-catch-finally

		massive.firstAddExcheption();// try with resources
		massive.secondAddExcheption(array); // try внутри try
		massive.secondAddExcheption(array2); // try внутри try
		massive.thirdAddExcheption();// метод с finally, но finally не вызывается
	}
}
