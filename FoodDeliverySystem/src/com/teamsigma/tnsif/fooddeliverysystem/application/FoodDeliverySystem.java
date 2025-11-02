package com.teamsigma.tnsif.fooddeliverysystem.application;

import java.util.Scanner;

import com.teamsigma.tnsif.fooddeliverysystem.entities.*;
import com.teamsigma.tnsif.fooddeliverysystem.services.*;


public class FoodDeliverySystem {
	
	 // services
	private static FoodService foodService = new FoodService();
    private static CustomerService customerService = new CustomerService();
    private static OrderService orderService = new OrderService();
    private static int orderid=1;
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
        	System.out.print("Enter Restaurant ID: "); int rid = Integer.parseInt(scan.nextLine());
            System.out.print("Enter Restaurant Name: "); String rname = scan.nextLine();
            
            foodService.addRestaurant(new Restaurant(rid, rname));
            System.out.println("Restaurant added.");
            break;
            
        case "2":
        	System.out.print("Enter Restaurant ID: "); int rrid = Integer.parseInt(scan.nextLine());
            Restaurant rest = foodService.findRestaurentById(rrid);
            if (rest == null) { System.out.println("Restaurant not found."); break; }
            System.out.print("Food item ID: "); int fid = Integer.parseInt(scan.nextLine());
            System.out.print("Food item name: "); String fname = scan.nextLine();
            System.out.print("food item Price: "); int fprice = Integer.parseInt(scan.nextLine());
         
            rest.addFoodItem(new FoodItem(fid, fname, fprice));
            System.out.println("Food item added.");
            break;
        case "3":
        	System.out.print("Enter Restaurant ID: "); rrid = Integer.parseInt(scan.nextLine());
        	rest = foodService.findRestaurentById(rrid);
        	if (rest == null) { System.out.println("Restaurant not found."); break; }
            System.out.print("Food item ID: "); fid = Integer.parseInt(scan.nextLine());
            foodService.removeFoodItemFromRestaurant(rrid, fid);
        	System.out.println("Food item removed");
        	break;
        case "4":
        	System.out.println("Restaurants and menus");
        	foodService.viewRestaurantsAndMenus();
        	
        	break;
        case "5":
        	System.out.println("all orders");
        	System.out.println(orderService.getOrders());
        	break;
        case "6":
        	System.out.println("Enter Delivery Person ID:"); int did = Integer.parseInt(scan.nextLine());
        	System.out.print("Enter Delivery Person Name:"); String dname = scan.nextLine();
        	System.out.println("Enter Contact No.: "); long dno =scan.nextLong();
        	orderService.addDeliveryPerson(new DeliveryPerson(did, dname, dno));
        	System.out.println("Delivery person added");
        	break;
        case "7":
        	System.out.println("Enter Order ID:"); int oid = Integer.parseInt(scan.nextLine());
        	System.out.println("Enter Delivery Person ID:"); did = Integer.parseInt(scan.nextLine());
        	orderService.assignDeliveryPerson(oid, did);
        	System.out.println("Delivery assigned");
        	break;
        case "8":
            System.out.println("Exiting admin module");
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
		System.out.println("Customer Menu:");
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

        	System.out.print("Enter User ID: "); int uid = Integer.parseInt(scan.nextLine());
        	System.out.print("Enter username: "); String uname = scan.nextLine();
        	System.out.println("Enter Contact No.:"); long cno =scan.nextLong();
        	customerService.addCustomer(new Customer(uid, uname, cno));
 
        	System.out.println("Customer added");
        	break;
        case "2":
            System.out.println("Food items:");
        	foodService.viewRestaurantsAndMenus();
            break;
        case "3":
        	System.out.print("Enter Cutomer ID: "); int cid = Integer.parseInt(scan.nextLine());
        	System.out.print("Enter restaurant ID: "); int rid = Integer.parseInt(scan.nextLine());
        	System.out.print("Enter Food Item ID: "); int fid = Integer.parseInt(scan.nextLine());
        	System.out.print("Enter quantity: "); int qt = Integer.parseInt(scan.nextLine());
        	Customer cust=customerService.getCustmer(cid);
        	Cart cart=cust.getCart();
        	cart.addItem(foodService.findFoodById(fid,rid), qt);
        	System.out.println("Food item added");
        	break;
        case "4":
        	System.out.print("Enter Cutomer ID: "); cid = Integer.parseInt(scan.nextLine());
        	cart=customerService.getCustmer(cid).getCart();
        	System.out.println(cart);
        	break;
        case "5":
        	System.out.print("Enter Cutomer ID: "); cid = Integer.parseInt(scan.nextLine());
        	Order order=new Order(orderid,customerService.getCustmer(cid));
        	orderService.placeOrder(order);
        	System.out.println("order placed, your orderId is "+orderid++);
        	break;
        case "6":
        	System.out.println("all orders");
        	System.out.println( orderService.getOrders());
        	break;
        case "7":
            System.out.println("Exiting cutomer module");
            break customerloop;
        default:
            System.out.println("Invalid input.");
    }
		
	}
	}

	
}
