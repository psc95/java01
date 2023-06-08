class Tv03{
	String color;//Tv색상
	int channel;//채널번호
	/* 클래스 소속 멤버변수에서 String타입 변수는 null,int 타입 변수 chnannel는 0으로 각각 기본값으로 
	 * 초기화가 된다.
	 * 
	 */
	
	void channelUp() {
		++channel;//채널번호 선행증가
	}
	
	void channelDown() {
		--channel;//채널번호 선행감소
	}
}
public class Test03 {
	public static void main(String[] args) {
		
		Tv03 t01 = new Tv03();//객체 생성 
		Tv03 t02 = new Tv03();//t01과 t02객체주소는 서로 다르다
		
//		System.out.println("tv01채널번호= "+t01.channel+",tv02채널번호= "+t02.channel);
		
		t01.channel = 10; // t01로 접근한 채널번호는 10으로 변경되지만,각 객체주소가 달라서 t02로 접근한 채널번호는
		//는 변경되지 않는다.
		System.out.println("t01.channel="+t01.channel);//채널번호가 10
		System.out.println("t02.channel="+t02.channel);//채널번호가 0
		System.out.println("=========================================");
		
		/* 문제)t02객체주소에 t01객체주소를 대입해서 결국 같은 주소를 가리키게 함으로써 t02.channel도 채널번호 10
		 * 으로 나오게하는 추가 자바코드를 해보자.
		 */
		t02 = t01;
		System.out.println("t02.channel="+t02.channel);
		System.out.println("=================================>\n");
		
	
	}
}
