package home_work_8;

public class Tester_1 {
	private double salary = 200;

//������� private �����������. � ������ ������ �������� ���������� ������ Tester ��� ������
	private Tester_1() {
		
	}

	public double countSalary() {
		return this.salary * 2;
	}
//������� public static ����� getObj, ������� ���������� ������ ����� ������. � ������ ������ ����� ��� �������� ��� �������� �������.
	public static Tester_1 getObj() {
		return new Tester_1();
	}
}


//2.����� ����� ������ ����������� � ������� � ������ ������ ����� �������� ������ (��� ����� getObj ������ MainForTester_1) 
//3.������������ ��������� (������ MainForTester_1_2)