package home_work_4;

public class Massive {
	
//������ � ������ �������
	public void printMassiveAsLine(int[] anyMas) {
		for (int i = 0; i < anyMas.length; i++) {
			System.out.print(anyMas[i] + " ");
		}
	}
//������ � �������� �������
	public void printReverseMassiveAsLine(int[] anyMas) {
		for (int i = anyMas.length - 1; i >= 0; i--) {
			System.out.print(anyMas[i] + " ");
		}
	}
//����� ��������� �������
	public int getSumOfElements(int[] anyMas) {
		int arrSum = 0;
		for (int i = 0; i < anyMas.length; i++) {
			arrSum = arrSum + anyMas[i];
		}
		return arrSum;
	}
//������, ��� ������ ������� ����������� ������� ������� �� �����
	public int [] multiptyBy3(int[] anyMas) {
		int numberWhichMultiplyElement = 3;
		int [] newMas= new int [anyMas.length];
		for (int i =0; i<anyMas.length; i++ ) {
			newMas[i]= anyMas[i]*numberWhichMultiplyElement;
		}
		return newMas;
	}
}
