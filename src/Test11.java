/* 매개변수(전달인자) 타입이 참조 즉 레퍼런스 자료형이어서 주소값에 의한 전달방식 예제소스
 */
class MyDate11{
	int year = 2022;
	int month = 12;
	int date = 31;
}

class 참조클래스{
	void changeDate(MyDate11 t) {//t에는 d객체주소가 대입되고 값은 대입안된다. t=d
		t.year = 2023; t.month = 6; t.date = 12;
	}
}
public class Test11 {
	public static void main(String[] args) {
		
		참조클래스 rm = new 참조클래스();
		MyDate11 d = new MyDate11();
		System.out.println(d.year+"/"+d.month+"/"+d.date);
		rm.changeDate(d);//d객체주소가 전달해서 주소값을 공유
		System.out.println("changeDate()메서드 호출후:"+d.year+"/"+d.month+"/"+d.date);
		//d객체주소값을 공유한다. 2023/6/12
	}
}
