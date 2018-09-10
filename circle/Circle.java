//Circle Ŭ����
//  �ʵ�(private �ν��Ͻ� ����):
// ������(radius) - ������
//
//  �޼ҵ�(public �޼ҵ�):
//  �Ű������� ���� ������(constuctor) - �������� 1�� �ʱ�ȭ
//  �������� �Ű������� �޾� �ʱ�ȭ �ϴ� ������(consturctor)
//                  Q: ���� �� constructor �� �̸��� �����ΰ�?  Circle
// ������ getter/setter
//    Q: ���� �� �޼ҵ��� �̸��� �ڹ� ���ʿ� �°� ���ϸ�?    getRadius  setRadius
// ������ ����Ͽ� �����ϴ� �޼ҵ� - �������� 3.14 �Ǵ� Math Ŭ������ ��� �̿�
//                �Ű����� ����

//  toString �������̵� - ������ ������ ���ڿ��� ����
//
public class Circle {
	private int radius;//  �ʵ�(private �ν��Ͻ� ����): ������(radius) - ������

	public Circle(int r) {//�޼ҵ�(public �޼ҵ�): �Ű������� ���� ������(constuctor) - �������� 1�� �ʱ�ȭ
		this.radius=r;
		}
	public Circle() {//  �޼ҵ�(public �޼ҵ�): �������� �Ű������� �޾� �ʱ�ȭ �ϴ� ������(consturctor)
		this.radius=1;
	}
	public double getRadius() {// ������ getter/setter
		return 3.14*(double)radius*(double)radius;
	}
	
	@Override
	public int hashCode() {// hashCode �������̵� - �������� �����ϸ� ������ ��ü�� �����ϵ���
		final int prime = 31;
		int result = 1;
		result = prime * result + radius;
		return result;
	}
	@Override
	public boolean equals(Object obj) {// equals �������̵� - �������� �����ϸ� ������ ��ü�� �����ϵ���
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (radius != other.radius)
			return false;
		return true;
	}
	@Override
	public String toString() {//  toString �������̵� - ������ ������ ���ڿ��� ����
		return "Circle [radius=" + radius + "]";
	}

}
