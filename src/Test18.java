// OOP 즉 객체지향 프로그래밍을 하면 중복 코드를 안하게 해서 생산성이 향상된다는 것을 알수 있는 소스
class Mt18{
	void prnArr(int[] scoreArr) {
		for(int i = 0; i < scoreArr.length; i++) {
			System.out.print(" "+ scoreArr[i]);
		}
		System.out.println("\n=============================>\n");
	}//prnArr()
	
	int getSum(int[] arr){
		int sum =0;// 누적합
		for(int j : arr) {
			sum += j; // sum = sum+j 랑같은 뜻
		}
		return sum;//return키워드로 getSum()메서드를 호출한곳으로 누적합을 반환
	}//getSum()
	
}
public class Test18 {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		
		//일반 for반복문으로 arr배열원소값을 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println("\n========================>\n");
		
		//자바 5(jdk5) 버전에서 추가된 향상된 확장 for반복문
		for(int k : arr) {
			System.out.print(" "+k);
		}
		System.out.println("\n=========================>\n");
		
		Mt18 mt18 = new Mt18();
		mt18.prnArr(arr);
		mt18.prnArr(arr);
		
		
		/* 문제)Mt18 클래스 int getSum(int[] arr){}메서드를 정의해서 arr배열원소 누적합을
		 * 구해서 반환하여 출력 해보자.
		 */
		mt18.getSum(arr);
		System.out.println("arr배열원소 누적합 = "+mt18.getSum(arr));
	}
}
