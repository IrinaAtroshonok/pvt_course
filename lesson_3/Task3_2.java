package home_work_3;

import java.util.Random;
//��������� ������ ����� ��� ��������, ������� boolean ���������

public class Task3_2 {
	public static void main(String[] args) {
		Random random = new Random();
		int intrandnumb = 100;
		int number = random.nextInt(intrandnumb);
		System.out.println("��������� �����="+ " "+ number);
		System.out.println("������?" + " " + evenOddNumber(number));
	}

	public static boolean evenOddNumber(int number) {
		boolean numbreturn;
		if (number % 2 == 0) {
			numbreturn = true;
		} else {
			numbreturn = false;
		}
		return numbreturn;
	}

}
