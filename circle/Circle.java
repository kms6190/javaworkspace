//Circle 클래스
//  필드(private 인스턴스 변수):
// 반지름(radius) - 정수형
//
//  메소드(public 메소드):
//  매개변수가 없는 생성자(constuctor) - 반지름을 1로 초기화
//  반지름을 매개변수로 받아 초기화 하는 생성자(consturctor)
//                  Q: 위의 두 constructor 의 이름은 무엇인가?  Circle
// 반지름 getter/setter
//    Q: 위의 두 메소드의 이름을 자바 관례에 맞게 정하면?    getRadius  setRadius
// 면적을 계산하여 리턴하는 메소드 - 원주율은 3.14 또는 Math 클래스의 상수 이용
//                매개변수 없음

//  toString 오버라이드 - 반지름 정보를 문자열로 리턴
//
public class Circle {
	private int radius;//  필드(private 인스턴스 변수): 반지름(radius) - 정수형

	public Circle(int r) {//메소드(public 메소드): 매개변수가 없는 생성자(constuctor) - 반지름을 1로 초기화
		this.radius=r;
		}
	public Circle() {//  메소드(public 메소드): 반지름을 매개변수로 받아 초기화 하는 생성자(consturctor)
		this.radius=1;
	}
	public double getRadius() {// 반지름 getter/setter
		return 3.14*(double)radius*(double)radius;
	}
	
	@Override
	public int hashCode() {// hashCode 오버라이드 - 반지름이 동일하면 동일한 객체로 간주하도록
		final int prime = 31;
		int result = 1;
		result = prime * result + radius;
		return result;
	}
	@Override
	public boolean equals(Object obj) {// equals 오버라이드 - 반지름이 동일하면 동일한 객체로 간주하도록
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
	public String toString() {//  toString 오버라이드 - 반지름 정보를 문자열로 리턴
		return "Circle [radius=" + radius + "]";
	}

}
