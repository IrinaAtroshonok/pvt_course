package second_home_work;

import java.util.ArrayList;
//������� ������ ArrayList, ��������� ��� ���������� ��� ��������� ����������. ��� ������ ����� for each:
//- ������� ��� �������� ������
//- � ������� �� ��������� ��������� ����� ����� (��� ������, ���� ������ ���������)
//- ������� ��������������� ��� ��������
//- ������� ����� ��� ��������

public class Add_2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(26);
		list.add(30);

//����� ���� ���������
		System.out.println("����� ���� ���������");
		for (Integer i : list) {
			System.out.println(i);
		}
		System.out.println(" ");

//����������� ����� � ������� ��������
		int n = 2;
		System.out.println("�����������" + " " + n + " " + "� ������� ��������");
		for (Integer i : list) {
			i = i + n;
			System.out.println(i);
		}
		System.out.println(" ");

//�������� ���� ��������� ���������������	
		System.out.println("�������� ���� ��������� ���������������");
		while (list.size() != 0) {
			list.remove(0);
			for (Integer i : list) {
				System.out.println(i);
			}
			System.out.println(" ");
		}

// �������� ���� ��������� ����� 
//		list.clear();
//		list.removeAll(list); //�������� ������� �������� 

		System.out.println("������ ����.");
	}

}
