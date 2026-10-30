package com.logicalstatements;

import java.util.Scanner;

public class FoodOrderingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		String yn = "";
		double Total_cost = 0;
		do {
			System.out.println("Enter the Food item: \n1.Pizza--200 \n2.Burger--120 \n3.Biryani--180 \n4.Noodles--100");
			int Food_Item = sc.nextInt();
			switch(Food_Item) {
			case 1 :
				System.out.println("Pizza");
				System.out.println("Enter the Quantity:");
				int quantity = sc.nextInt();
				int Price = 200;
				double cost = Price * quantity;
				Total_cost += cost;
				System.out.println("Pizza Bill is:"+cost);
				break;
			case 2:
				System.out.println("Burger");
				System.out.println("Enter the Quantity:");
				int B_quantity = sc.nextInt();
				int B_Price = 120;
				double B_cost = B_Price * B_quantity;
				Total_cost += B_cost;
				System.out.println("Burger Bill is:"+B_cost);
				break;
			case 3:
				System.out.println("Biryani");
				System.out.println("Enter the Quantity:");
				int Bi_quantity = sc.nextInt();
				int Bi_Price = 120;
				double Bi_cost = Bi_Price * Bi_quantity;
				Total_cost += Bi_cost;
				System.out.println("Biryani Bill is:"+Bi_cost);
				break;
			case 4:
				System.out.println("Noodles");
				System.out.println("Enter the Quantity:");
				int N_quantity = sc.nextInt();
				int N_Price = 120;
				double N_cost = N_Price * N_quantity;
				Total_cost += N_cost;
				System.out.println("Noodles Bill is:"+N_cost);
				break;
				default:
					System.out.println("Entered item is not Available");
					
		}
			System.out.println("Do you want to continue: y for yes and n for no");
			 yn =sc.next(); 
	}while(yn.equalsIgnoreCase("y"));
		
		System.out.println("Total Bill:"+ Total_cost);

}
}
