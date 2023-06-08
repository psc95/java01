/* 참조타입 변수가 같은 객체주소를 가진 경우와 그렇지 못한 경우에 관한 소스 예제
 */
class MyDate09{
	int year=2023;
	int month=5;
	int date=31;
}
public class Test09 {
	public static void main(String[] args) {
		MyDate09 d = new MyDate09();
		MyDate09 t = d;//d객체주소가 t에 대입된 경우이다.즉 t와 d는 같은 객체주소를 가리킨다.
		
		System.out.println(d.year+"년 "+d.month+"월 "+d.date+"일");//2023년 5월 31일
		System.out.println(t.year+"년 "+t.month+"월 "+t.date+"일");//2023년 5월 31일
		System.out.println("========================================");
		/* 문제)t객체를 다시 한번더 생성한 다음 t로 접근한 year,month,date변수에 2023,6,12를
		 * 저장한 다음 출력해보고 동시에 d로 접근한 year,month,date변수값도 출력해 보자.
		 */
		t = new MyDate09();//t객체를 다시 생성
		t.year = 2023; t.month = 6; t.date = 12;
		
		System.out.println(t.year+"년 "+t.month+"월 "+t.date+"일");//2023년 6월 12일
		System.out.println(d.year+"년 "+d.month+"월 "+d.date+"일");//2023년 5월 31일
		// t객체를 다시 생성해서 d와 주소값이 다르다.
		System.out.println("\n======================================>\n");
		
		/* 문제)t객체주소를 d에 대입해서 t,d로 접근한 year,month,date를 2023년 6월 12일로
		 * 주소값을 공유해서 같은 값이 출력되게 만들어 보자.
		 */
		d = t;
		System.out.println(t.year+"년 "+t.month+"월 "+t.date+"일");
		System.out.println(d.year+"년 "+d.month+"월 "+d.date+"일");
		
		
	}
}
