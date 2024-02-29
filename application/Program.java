package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.Enum.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Enter Client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth Date (dd/mm/yyyy): ");
		Date date = sdf.parse(sc.nextLine());
		Client client = new Client(name, email, date);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.nextLine();
		Order order = new Order(sdf2.parse("20/04/2018 11:25:09"), OrderStatus.valueOf(status), client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Enter " + (i+1) + " item data:");
			System.out.print("Product name: ");
			String nameProduct = sc.next();
			System.out.print("Product price: ");
			double priceProduct = sc.nextDouble();
			Product product = new Product(nameProduct, priceProduct);
			System.out.print("Quantity: ");
			Integer quantityProduct = sc.nextInt();
			OrderItem item = new OrderItem(quantityProduct, priceProduct, product);
			
			order.addItem(item);
		}

		System.out.println();
		
		System.out.println("Order Summary: ");

		System.out.println(order);
		
		
	sc.close();	
		
	}

}
