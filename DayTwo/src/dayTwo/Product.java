package dayTwo;

public class Product {
	//Constructor Block
	//ka� tane constructor oldu�u fark etmez her t�rl� 1 tanesi �al���r
	
	public Product() {
		System.out.println("Ben �al��t�m");
	}
	
	public Product(int id, String name, double unitPrice, String detail) {
		this();//imzas�z olarak bu class �  tekrar �a��r
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
