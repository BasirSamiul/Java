package advanced;

public class Mobile {

	int price;
	String name;
	static String brand;

//	public Mobile() {
//		
//		System.out.println("I am the constructor.");
//		
//	}

//	static {
//		System.out.println("\nI am the static method.");
//	}

	public static void show(Mobile obj) {

		System.out.println("The mobile name is: " + obj.name + "\nThe mobile brand name is: " + brand
				+ "\nThe mobile price is: " + obj.price);

	}

}
