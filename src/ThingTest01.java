/* 문제)11장.클래스와 객체.pdf의 No.13페이지의 문제
 * 
 */

class Thing{
	private int x;

	public int getX() {
		return x; //return 키워드(예약어)로 getX()메서드 호출한 곳으로 x멤버변수(속성)값을 반환
	}

	public void setX(int x) {
		this.x = x;
	}

}
public class ThingTest01 {
	public static void main(String[] args) {
		Thing thing1; //객체주소가 저장안된 참조변수(레퍼런스 변수)
		thing1=new Thing(); //객체주소가 저장된 참조변수
		thing1.setX(10); 
		System.out.println("x좌표값 = "+thing1.getX());

	}
}
