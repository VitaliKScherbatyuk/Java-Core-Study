package Les7.Su27;

public class Main {

	public static void main(String[] args) {

		/*
		 * �������� ����� ��-27, ��������� ˳�����. � ���� ��������� ������ ��������
		 * ������: � �������� � ������� � ������� � ��������� ��� ������� ����� ������
		 * ��������� ���������� ��������� ��������� �����, ��� �������������� �������
		 * �� ��� ���� ������������� ����� ��������.
		 * 
		 * �������� ����������� ���� ˳��� ���� ������ ������: � �������������� , ����
		 * ���� �������� �� ����� ������ ���� ���������� �� ��������� ������, �� ���
		 * ���������� ��������� � ����� �� [20,88]. � ����˳����, ���� ����������
		 * ������ ����� ���� �������� �� ������� ���� ������. �������� ���������
		 * ������� ����� �� ���� �� 1000 � �������˳����, ���� ���������� �� ����� ��
		 * ���� ��� �� �������. ������� �������� ����� � ����� ������ �����. (�������,
		 * ������, ����,)
		 * 
		 * �������� ��������� � ����� ������� ���������� ��������� ����� : �
		 * ���������������� � �������������� � �����������
		 * 
		 * ���������� �� ����� ��-27. ��������� ���������� ������ �� ������ �������
		 * ����� �����, ��� ��-27 ��� ��������� ��������� � ������ � �������� �����
		 * �����. ����� ����������, ����������,�����������. � ��������� �������������
		 * ������ ���������� � ���� ��-27 , ��� � ���������������� ������� �� �����
		 * ������� ��� ���� ��������� ������������ � ������� ���� ������ ��
		 * ����������� �������� ����� ��-27. ����� � �������������� ������� �� �����
		 * , �� ����� �� ����� �������� ��������� ������������� �����. � �����������
		 * ������� �� ����� ��������� ������� ������� ��������� ��� ���� �������, ���
		 * �� ����� 10. � ������� ����: ����������� ��������, ����, �� �������� �
		 * ����������� � �����������.
		 * 
		 * �������� ���� ����, �� �������� ���� �����, �������� � ����� ���� ��-27. �
		 * ����� ������ ���� �����. �) ��������� ������� ����� �) ��������� ����
		 * ����� �) �������� ����� ,����, ����, ������ �) �������� ��������� �����
		 * �) ��������� ������� ���� �) �������� ���������������� � ����� �)
		 * ��������� ������� �����
		 */

		PlaneSu_27 pSu_27 = new PlaneSu_27(30, 15, 2000, 900, "militari");
		System.out.println(pSu_27.toString());
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("��������� �������!");
		pSu_27.airplaneTakeOff();
		pSu_27.startingTheEngines();
		pSu_27.up();
		pSu_27.left();
		pSu_27.down();
		pSu_27.right();
		pSu_27.stels();
		pSu_27.nuclearStrike();
		pSu_27.turbo();
		pSu_27.landingThePlane();
	}

}