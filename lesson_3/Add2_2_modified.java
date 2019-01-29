package home_work_3;

import java.util.ArrayList;
//������� ������ ArrayList, ��������� ��� ���������� ��� ��������� ����������. ��� ������ ����� for each:
//- ������� ��� �������� ������
//- � ������� �� ��������� ��������� ����� ����� (��� ������, ���� ������ ���������)
//- ������� ��������������� ��� ��������
//- ������� ����� ��� ��������

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

//����� ���� ���������
	public static void getElements(ArrayList<Integer> anyList) {
		System.out.println("����� ���� ���������:");
		for (Integer i : anyList) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
	}

//����������� ����� � ������� ��������
	public static void addNumberToAllElements(ArrayList<Integer> anyList) {
		int n = 2;
		System.out.println("�����������" + " " + n + " " + "� ������� ��������:");
		for (Integer i : anyList) {
			i = i + n;
			System.out.print(i + " ");
		}
		System.out.println(" ");
	}

//�������� ���� ��������� ���������������	
	public static void deleteAllElementsConsistently(ArrayList<Integer> anyList) {
		System.out.println("�������� ���� ��������� ���������������:");
		while (anyList.size() != 0) {
			anyList.remove(0);
			for (Integer i : anyList) {
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}
		System.out.println("������ ����.");
	}

	// �������� ���� ��������� �����
	public static void deleteAllElements(ArrayList<Integer> anyList) {
		System.out.println("�������� ���� ��������� �����:");
		anyList.clear();
//		list.removeAll(list); //�������� ������� �������� 
		System.out.println("������ ����.");
	}
}
