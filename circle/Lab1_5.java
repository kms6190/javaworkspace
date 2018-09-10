
//
//- ����̹� Ŭ����(���� ��� CircleTest Ŭ����)�� main �޼ҵ�� ������ ����
//
//   (1) �� ��ü�� ����(circle1)
//   (2) circle1�� �������� 2�� ����
//
//   (3) �� ��ü�� �����ϵ�, 1~4 ������ ���� ���������� �������� �ʱ�ȭ�ϵ��� ����(circle2)
//
//   (4) circle1�� ��� - toString ȣ��
//   (5) circle2�� ��� - toString ȣ��
//
//   (6) circle1�� circle2�� ���������� �˾ƺ��� ����� ��� - equals ȣ��
//
//   (7) circle1�� hashCode�� ��� - hashCode ȣ��
//   (8) circle2�� hashCode�� ��� - hashCode ȣ��
//
//   (9) circle1�� ������ ��� - ������� �޼ҵ� ȣ��
//   (10) circle2�� ������ ��� - ������� �޼ҵ� ȣ��
//
//- �Է�: ����
//- ���: �� ���� �������� ���ο� ��Ÿ ����
//
//- ���� �� 1
//lab1_5: ȫ�浿
//Circle [radius=2]
//Circle [radius=2]
//true
//33
//33
//12.56
//12.56
//
//- ���� �� 2
//lab1_5: ȫ�浿
//Circle [radius=2]
//Circle [radius=4]
//false
//33
//35
//12.56
//50.24

public class Lab1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lab1_5: �蹮��");
		Circle circle1 = new Circle(2);//	�� ��ü�� ����(circle1)

		Circle circle2 = new Circle((int)(Math.random()*4)+1);//   �� ��ü�� �����ϵ�, 1~4 ������ ���� ���������� �������� �ʱ�ȭ�ϵ��� ����(circle2)

		System.out.println(circle1.toString());//   circle1�� ��� - toString ȣ��
		System.out.println(circle2.toString());//    circle2�� ��� - toString ȣ��

		System.out.println(circle1.equals(circle2));//    circle1�� circle2�� ���������� �˾ƺ��� ����� ��� - equals ȣ��

		System.out.println(circle1.hashCode());//    circle1�� hashCode�� ��� - hashCode ȣ��
		System.out.println(circle2.hashCode());//  circle2�� hashCode�� ��� - hashCode ȣ��

		System.out.println(circle1.getRadius());//   circle1�� ������ ��� - ������� �޼ҵ� ȣ��
		System.out.println(circle2.getRadius());//   circle2�� ������ ��� - ������� �޼ҵ� ȣ��
	}

}
