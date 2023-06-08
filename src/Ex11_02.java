/* 문제)11장.클래스와 객체.pdf의 No.14페이지의 문제
 * 
 */
class Product{
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

public class Ex11_02 {
	public static void main(String[] args) {
//		Product p = new Product();
//		p.setName("커피");
//		p.setPrice(150);
//		Product p1 = new Product();
//		p1.setName("비타500");
//		p1.setPrice(500);
//		System.out.println("자판기 => 제품목록: ");
//		System.out.println(p.getName() +" " + p.getPrice() + "원");
//		System.out.println(p1.getName() +" " + p1.getPrice() + "원");
		
		Product p = new Product(); // p객체 생성
		
		p.setName("커피 ");
		p.setPrice(150);
		System.out.println("출력 : 자판기 => 제품목록: ");
		System.out.println(p.getName() + p.getPrice() + "원,");
		p.setName("비타500 ");
		p.setPrice(500);
		System.out.println(p.getName() + p.getPrice() + "원");
	}
}
