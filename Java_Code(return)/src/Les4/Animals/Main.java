package Les4.Animals;

public class Main {

	public static void main(String[] args) {

		/* �������� ���� �������. ������� ���� ������ ������: ����� �������, ��������
		 * �������, �� �������. ���� ���� ������� ���� ����������.
		 * �������� ����������� � ����������� �����������, � ���� ��������� ������ ��
		 * ���� �����. �������� getters/setters �� ��� ���� �����. � ����� ����.
		 * �������� ��������� ������ �����, �� ��������� getter ������� �� ������� �
		 * ���� ����� �������� ���� ������ �����. ��������� setter, ������ ��������
		 * ��� ���� �����. ������� �� ������� �� ���� �����, ����� � ���� �����.
		 * �������� ���� �������. � ����� ���� ������� ���� ��������� ���� ���� ����
		 * ����� �������. ���� ������� ���� ��������� ��������� �����:
		 * "����� ������� = �������, �������� ������� = 20 ��/���, ³� ������� = 7 ���� "
		 * "-------------------------"
		 * "����� ������� = ���, �������� ������� = 2 ��/���, ³� ������� = 14 ���� "
		 */
		
		Animals animals = new Animals("�������", 20, 7);
		System.out.println(animals);
		animals.point();
		animals.setName("���");
		animals.setSpeed(2);
		animals.setAge(14);
		System.out.println("����� ������� = " + animals.getName()+ ", �������� ������� = " + animals.getSpeed()+ 
				"��/���, ³� ������� = " + animals.getAge());
		animals.point();
	}

}