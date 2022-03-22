package dayTwo;

public class Main {

	public static void main(String[] args) {
		//örnek olulturma , referans oluþturma,**instance**
		Product product1 = new Product(1, "Lenovo  V14", 15000,"16gb ram");
		

		Product product2 = new Product();
		product2.id = 2;
		product2.name= "Lenovo v15";
		product2.unitPrice= 16000;
		product2.detail= "32 GB ram";

		Product product3 = new Product();
		product3.id = 1;
		product3.name= "Hp 5";
		product3.unitPrice= 10000;
		product3.detail= "8 GB ram";
		
		Product[] products= {product1,product2,product3};
		
		for (Product product : products) {
			
			System.out.println(product.name);
			System.out.println(product.unitPrice);
			System.out.println(product.detail+"\n");
		}
		

		Category category1 = new Category();
		category1.id= 1;
		category1.name=	"Ev/Bahçe";
		
		Category category2 = new Category();
		category2.id= 2;
		category2.name=	"Bilgisayar";
		
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3);
		
	}

}
