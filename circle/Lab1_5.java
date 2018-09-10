
//
//- 드라이버 클래스(예를 들어 CircleTest 클래스)의 main 메소드는 다음을 수행
//
//   (1) 원 객체를 생성(circle1)
//   (2) circle1의 반지름을 2로 수정
//
//   (3) 원 객체를 생성하되, 1~4 범위의 랜덤 정수값으로 반지름을 초기화하도록 생성(circle2)
//
//   (4) circle1를 출력 - toString 호출
//   (5) circle2를 출력 - toString 호출
//
//   (6) circle1과 circle2가 동일한지를 알아보아 결과를 출력 - equals 호출
//
//   (7) circle1의 hashCode를 출력 - hashCode 호출
//   (8) circle2의 hashCode를 출력 - hashCode 호출
//
//   (9) circle1의 면적을 출력 - 면적계산 메소드 호출
//   (10) circle2의 면적을 출력 - 면적계산 메소드 호출
//
//- 입력: 없음
//- 출력: 두 원이 동일한지 여부와 기타 정보
//
//- 실행 예 1
//lab1_5: 홍길동
//Circle [radius=2]
//Circle [radius=2]
//true
//33
//33
//12.56
//12.56
//
//- 실행 예 2
//lab1_5: 홍길동
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
		System.out.println("Lab1_5: 김문수");
		Circle circle1 = new Circle(2);//	원 객체를 생성(circle1)

		Circle circle2 = new Circle((int)(Math.random()*4)+1);//   원 객체를 생성하되, 1~4 범위의 랜덤 정수값으로 반지름을 초기화하도록 생성(circle2)

		System.out.println(circle1.toString());//   circle1를 출력 - toString 호출
		System.out.println(circle2.toString());//    circle2를 출력 - toString 호출

		System.out.println(circle1.equals(circle2));//    circle1과 circle2가 동일한지를 알아보아 결과를 출력 - equals 호출

		System.out.println(circle1.hashCode());//    circle1의 hashCode를 출력 - hashCode 호출
		System.out.println(circle2.hashCode());//  circle2의 hashCode를 출력 - hashCode 호출

		System.out.println(circle1.getRadius());//   circle1의 면적을 출력 - 면적계산 메소드 호출
		System.out.println(circle2.getRadius());//   circle2의 면적을 출력 - 면적계산 메소드 호출
	}

}
