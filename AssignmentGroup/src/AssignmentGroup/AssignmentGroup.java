package AssignmentGroup;
import java.util.Scanner;
public class AssignmentGroup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		printServices();
		sc.close();
	}
	
	public static void printServices() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Beauty Center.");
		System.out.println("Please select service that you want (enter num): ");
		System.out.println("1. Make Up"
				+ "\n2. Jewellery"
				+ "\n3. Perfumes"
				+ "\n4. Skin Care"
				+ "\n5. Hair");
		int services = sc.nextInt();
		
		//services_provided
		if (services == 1) {
			System.out.println("product makeup");
			System.out.println();
			
			System.out.println("TODAY IS A SPECIAL DAY PROMOSI!!!!!!!");
			System.out.println();
			
			String[] makeup = {"lipstick","maskara","eyeliner","foundation","blusher"};
			
			System.out.println(makeup[0] + " RM20 only");
			System.out.println(makeup[1] + " RM25 only");
			System.out.println(makeup[2] + " RM15 only");
			System.out.println(makeup[3] + " RM30 only");
			System.out.println(makeup[4] + " RM10 only");

			int q1= 0, q2=0, q3=0, q4=0, q5=0;
			int item1=0,item2=0,item3=0,item4=0,item5=0;
			
			int price [] = {20,25,15,30,10};
			
			System.out.print("HOW MANY YOU WANT?");
			System.out.println();
			
			System.out.println(makeup[0]);
			q1=sc.nextInt();
			item1 = (price[0] *q1);
			System.out.println(makeup[0] + " RM " + item1);	
			System.out.println();
			
			System.out.print("quantity product you want:");
			System.out.println(makeup[1]);
			q2=sc.nextInt();
			item2 = (price[1]*q2);
			System.out.println(makeup[1] + " RM " + item2);
			System.out.println();
			
			System.out.print("quantity product you want:");
			System.out.println(makeup[2]);
			 q3=sc.nextInt();
			item3 = (price[2]*q3);
			System.out.println(makeup[2] + " RM " + item3);
			System.out.println();
			
			System.out.print("quantity product you want:");
			System.out.println(makeup[3]);
			q4=sc.nextInt();
			item4 = (price[3]*q4);
			System.out.println(makeup[3] + " RM " + item4);
			System.out.println();
			
			System.out.print("quantity product you want:");
			System.out.println(makeup[4]);
			q5=sc.nextInt();
			item5 = (price[4]*q5);
			System.out.println(makeup[4] + " RM " + item5);
			System.out.println();
			
			System.out.println();
			double total = (item1+item2+item3+item4+item5);
			
			System.out.println("Total price : RM"+ total);

		}
		
		else if (services == 2) {
			System.out.print("Would you like to look at some recomendations from our shop? (Choose Y or N) ");
			char choose = sc.next().charAt(0);
			if (choose == 'Y') {
				System.out.println("Here we have 3 recommendations which are:");
				System.out.println("1. COLOVIS 			| Price before: RM627.00 | Price after: RM259.00 | [TOP SALE!!]");
				System.out.println("2. Her Jewellery 		| Price before: RM109.90 | Price after: RM87.92");
				System.out.println("3. ALDO 			| Price before: RM129.00 | Price after: RM87.90");
				System.out.println("\n");
			}
			
			else if (choose == 'N') {
				System.out.println("Thank you. Please come again.");
			}
			
		}
		
		else if (services == 3) {
			String sell[] = {"CITRUS","GOURMAND","FLORAL","FRUITY","SPICY","AQUATIC"};
			
			System.out.println("What "+ product +"?");
			System.out.println("\nWe sell "+ sell[0] +" for   $170");
			System.out.println("We sell "  + sell[1] +" for   $122");
			System.out.println("We sell "  + sell[2] +" for   $385");
			System.out.println("We sell "  + sell[3] +" for   $136");
			System.out.println("We sell "  + sell[4] +" for   $148");
			System.out.println("We sell "  + sell[5] +" for   $126");
			
			int q1=0, q2=0, q3=0, q4=0, q5=0, q6=0, q7=0, q8=0;
			double total = 0, price1=0, price2=0, price3=0, price4=0, price5=0, price6=0, price7=0, price8=0;
			
			String sell[]={"CITRUS","GOURMAND","FLORAL","FRUITY","SPICY","AQUATIC"};
			
			if(ans == 'Y' || ans == 'y') {
				System.out.println("How much would you buy "+     sell[0] +"?");
				q1 = sc.nextInt();			
				price1 = q1 * 170;
				System.out.println("How much would you buy "+ sell[1] +"?");
				q2 = sc.nextInt();
				price2 = q2 * 122;
				System.out.println("How much would you buy "+ sell[2] +"?");
				q3 = sc.nextInt();
				price3 = q3 * 385;
				System.out.println("How much would you buy "+ sell[3] +"?");
				q4 = sc.nextInt();
				price4 = q4 * 136;
				System.out.println("How much would you buy "+ sell[4] +"?");
				q5 = sc.nextInt();
				price5 = q5 * 148;
				System.out.println("How much would you buy "+ sell[5] +"?");
				q6 = sc.nextInt();
				price6 = q6 * 126;
				total = price1 + price2 + price3 + price4 + price5 + price6;
			}


		}
	
		else if (services == 4) {
			String sell[] = {"face serum","day lotion","night cream","sun screen","under-eye cream","cleanser","spot treatment","exfoliating scrub"};
			System.out.println("\nWe sell "+sell[0]+" for RM 23.00");
			System.out.println("We sell "+ sell[1] +" for RM32.00");
			System.out.println("We sell "+ sell[2] +" for RM 29.00");
			System.out.println("We sell "+ sell[3] +" for RM 16.00");
			System.out.println("We sell "+ sell[4] +" for RM 19.00");
			System.out.println("We sell "+ sell[5] +" for RM 15.00");
			System.out.println("We sell "+ sell[6] +" for RM 26.00");
			System.out.println("We sell "+ sell[7] +" for RM 10.00");
			
			int q1=0, q2=0, q3=0, q4=0, q5=0, q6=0, q7=0, q8=0;
			double total = 0, price1=0, price2=0, price3=0, price4=0, price5=0, price6=0, price7=0, price8=0;

			System.out.println("How much would you buy "+ sell[0] +"?");
			q1 = sc.nextInt();
			price1 = q1 * 23;
			System.out.println("How much would you buy "+ sell[1] +"?");
			q2 = sc.nextInt();
			price2 = q2 * 32;
			System.out.println("How much would you buy "+sell[2] +"?");
			q3 = sc.nextInt();
			price3 = q3 * 29;
			System.out.println("How much would you buy "+ sell[3] +"?");
			q4 = sc.nextInt();
			price4 = q4 * 16;
			System.out.println("How much would you buy "+ sell[4] +"?");
			q5 = sc.nextInt();
			price5 = q5 * 19;
			System.out.println("How much would you buy "+ sell[5] +"?");
			q6 = sc.nextInt();
			price6 = q6 * 15;
			System.out.println("How much would you buy "+ sell[6] +"?");
			q7 = sc.nextInt();
			price7 = q7 * 26;
			System.out.println("How much would you buy "+ sell[7] +"?");
			q8 = sc.nextInt();
			price8 = q8 * 10;
			total = price1 + price2 + price3 + price4 + price5 + price6 + price7 + price8;

		}
	
		else if (services == 5) {
			String[] treatment = {"Keratin","Scalp","Hot Oil","Moisture","Toning"};
	
			System.out.println(treatment[0] + " RM50.00 per bottle");
			System.out.println(treatment[1] + " RM60.00 per bottle");
			System.out.println(treatment[2] + " RM80.00 per bottle");
			System.out.println(treatment[3] + " RM60.00 per bottle");
			System.out.println(treatment[4] + " RM50.00 per bottle");

		}
		
		sc.close();
	}
}
