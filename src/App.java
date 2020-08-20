
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double backpack = 2.50;
		double shoes = 50.00;
		double wallet = 60.25;
		double insideWallet = 60.25;
		
		int friends = 47;
		int numberOfFriends = 47;
		
		int age = 23;
		int yearsOld = 23;
		String firstName = "Matthew";
		String first_name = "Matthew";
		String lastName = "Shortle";
		String last_name = "Shortle";
		char midInitial = 'A';
		char middle_initial = 'A';
		
		
		//Amount of money after buying items
		System.out.printf(firstName + " has $%.2f in his wallet.", wallet);
		System.out.println();
		System.out.printf(first_name + " has $%.2f in his wallet.", insideWallet);
		System.out.println();
		System.out.printf("He buys a new backpack for $%.2f and "
				+ "a new pair of shoes for $%.2f. ", backpack, shoes);
		System.out.printf(firstName + " now has $%.2f in his wallet.", (wallet - backpack - shoes));
		System.out.println();
		System.out.printf(firstName + " now has $%.2f in his wallet.", (insideWallet - backpack - shoes));
		System.out.println();
		
		//Number of Friends
		System.out.println(firstName + " is " + age + " years old and he has " + friends + " friends.");
		System.out.println("On average, " + firstName + " has made " + (double) (friends/age) + " per year.");
		
		//My Name
		System.out.println("My name is " + firstName + " " + midInitial + " " + lastName + ".");
				

	}

}
