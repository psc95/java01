//비트 연산자 관련 예제 
public class Test14 {
	public static void main(String[] args) {
		
		int a = 12;
		int b = 20;
		int result = 0;
		
		result = a | b; //비트 or 연산자 => | 한쪽이라도 1이면 결과값 1
		System.out.println(a+" | "+b+" : "+result); //28
		
		result = a & b; //비트 and 연산자 둘다 1이여야 결과값이 1을 가짐
		System.out.println(a+" & "+b+" = "+result); //4
		
		result = a ^ b; //배타적 xor연산 서로다를때만 결과값 1을 가짐
		System.out.println(a+" ^ "+b+" = "+result); //24
		
		result = ~a; //음수는 2의보수(1의보수+1) 형태로 저장된다 
		System.out.println("~"+a+" -> "+result); //-13
		
		byte x = 15;
		System.out.println("15 << 2 = "+ (x << 2)); //60
		System.out.println("15 >> 2 = "+ (x >> 2)); //3
		
	}
}
