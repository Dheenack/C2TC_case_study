package com.teamsigma.tnsif.fooddeliverysystem.application;

import java.util.Scanner;

import com.teamsigma.tnsif.fooddeliverysystem.entities.*;
import com.teamsigma.tnsif.fooddeliverysystem.services.*;


public class FoodDeliverySystem {
	
	 // services
	private static FoodService foodService = new FoodService();
    private static CustomerService customerService = new CustomerService();
    private static OrderService orderService = new OrderService();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		   mainLoop:
		        while (true) {
		            System.out.println("\n1. Admin Menu\n2. Customer Menu\n3. Exit");
		            System.out.print("Choose an option: ");
		            String s = scan.nextLine().trim();
		            switch (s) {
		                case "1":
		                    adminMenu();
		                    break;
		                case "2":
		                    cutomerMenu();
		                    break;
		                case "3":
		                    System.out.println("Exiting");
		                    break mainLoop;
		                default:
		                    System.out.println("Invalid input.");
		            }
		        }
		scan.close();
	}
	
	private static void adminMenu() {
		Scanner scan =new Scanner(System.in);
		// TODO Auto-generated method stub
		adminloop :while(true) {
		System.out.println("Admin Menu:");
		System.out.println("1. Add Restaurant \r\n"
				+ "2. Add Food Item to Restaurant \r\n"
				+ "3. Remove Food Item from Restaurant \r\n"
				+ "4. View Restaurants and Menus \r\n"
				+ "5. View Orders \r\n"
				+ "6. Add Delivery Person \r\n"
				+ "7. Assign Delivery Person to Order \r\n"
				+ "8. Exit ");
		System.out.println("Choose an Option:");
		String s = scan.nextLine().trim();
		switch (s) {
        case "1":
        	//System.out.print("Enter Restaurant ID: "); int rid = Integer.parseInt(scan.nextLine());
            //System.out.print("Enter Restaurant Name: "); String rname = scan.nextLine();
            
            //foodService.addRestaurant(new Restaurant(rid, rname));
            System.out.println("Restaurant added.");
            break;
        case "2":
        	//System.out.print("Enter Restaurant ID: "); int rrid = Integer.parseInt(scan.nextLine());
            //Restaurant rest = foodService.findRestaurentById(rrid);
            //if (rest == null) { System.out.println("Restaurant not found."); break; }
            //System.out.print("Food ID: "); int fid = Integer.parseInt(scan.nextLine());
            //System.out.print("Food name: "); String fname = scan.nextLine();
            //System.out.print("Price: "); double fprice = Double.parseDouble(scan.nextLine());
            //System.out.print("Cuisine: "); String cuisine = scan.nextLine();
            //rest.addFoodItem(new FoodItem(fid, fname, fprice, cuisine));
            System.out.println("Food item added.");
            break;
        case "3":
        	System.out.println("Food item removed");
        	break;
        case "4":
        	System.out.println("Restaurants and menus");
        	break;
        case "5":
        	System.out.println("all orders");
        	break;
        case "6":
        	System.out.println("Delivery person added");
        	break;
        case "7":
        	System.out.println("Delivery assigned");
        	break;
        case "8":
            System.out.println("Exiting");
            break adminloop;
        default:
            System.out.println("Invalid input.");
    }
	}
		
	
	}

	private static void cutomerMenu() {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		// TODO Auto-generated method stub
		customerloop :while(true) {
		System.out.println("Admin Menu:");
		System.out.println("1. Add Customer \r\n"
				+ "2. View Food Items \r\n"
				+ "3. Add Food to Cart \r\n"
				+ "4. View Cart \r\n"
				+ "5. Place Order \r\n"
				+ "6. View Orders \r\n"
				+ "7. Exit ");
		System.out.println("Choose an Option:");
		String s = scan.nextLine().trim();
		switch (s) {
        case "1":
        	System.out.println("Customer added");
        	break;
        case "2":
            System.out.println("Food items.");
            break;
        case "3":
        	System.out.println("Food item added");
        	break;
        case "4":
        	System.out.println("cart items");
        	break;
        case "5":
        	System.out.println("order placed");
        	break;
        case "6":
        	System.out.println("all orders");
        	break;
        case "7":
            System.out.println("Exiting");
            break customerloop;
        default:
            System.out.println("Invalid input.");
    }
		
	}
	}

	
}
