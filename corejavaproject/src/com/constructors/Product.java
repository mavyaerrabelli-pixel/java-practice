package com.constructors;

public class Product {
	int id ;
    String Name;
    double Price;
    
    Product (int ProductId, String ProductName , double Price){
    	id = ProductId;
    	Name = ProductName;
    	this.Price = Price;
    	show();
     
    }
    	
    void show() {
    	
    	System.out.println("Product id is :"+id);
    	System.out.println("Product Name is:"+Name);
    	System.out.println("Product Price is:"+Price);
    }
	public static void main(String[] args) {
		
		Product p1 = new Product(1,"Samsung",80000);
		Product p2 = new Product(2,"Apple", 150000);
		Product p3 = new Product(3,"Vivo", 50000);

	}

}
