package home_work_3;

import java.util.Random;
//�������� ����� � �������, ������� ��������� ����������

public class Task3_3 {
	public static void main(String[] args) {
		int intrandnumb = 10;
		Random random = new Random();
		int number = random.nextInt(intrandnumb);
		System.out.println("��������� �����=" + " " + number);
		System.out.println("����� � ��������=" + " " + numberPow(number));
	}

	public static int numberPow(int number) {
		return (int) Math.pow(number, 2);
	}

}
