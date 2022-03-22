package dayTwo;

public class Product {
	//Constructor Block
	//kaç tane constructor olduðu fark etmez her türlü 1 tanesi çalýþýr
	
	public Product() {
		System.out.println("Ben çalýþtým");
	}
	
	public Product(int id, String name, double unitPrice, String detail) {
		this();//imzasýz olarak bu class ý  tekrar çaðýr
		this.id= id;
		this.name= name;
		this.unitPrice= unitPrice;
		this.detail= detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
	
}
