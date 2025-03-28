package practice;

public class Book {
	private String name;
	private int price = 0;
	public Book() {}
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void show_print() {
		System.out.println(name + "는 " + price + "원입니다.");
	}
}
