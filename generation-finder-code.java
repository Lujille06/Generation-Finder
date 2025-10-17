import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		String name;
		char answer;
		int year;
		Scanner scanner = new Scanner (System.in);
		    
		do{
			System.out.println("-------------------------------");
			System.out.println("       Generation Finder");
			System.out.println("-------------------------------");
		  	System.out.print("Enter your first name: ");
			name = scanner.nextLine();
			System.out.println("-------------------------------");
			System.out.println("        Welcome "+ name + "!");
			System.out.println("-------------------------------");
			System.out.print("Enter your birth year: ");
			year = scanner.nextInt();
	    	scanner.nextLine();
	    	System.out.println("-------------------------------");
			
			if (year >= 2013 && year <= 2025){
			    System.out.println(name + " you are Generation Alpha");
			} else if (year >= 1997 && year < 2013) {
			    System.out.println(name + " you are Generation Z");
			} else if (year >= 1981 && year < 1997){
	        System.out.println(name + " you are Millenials (Gen Y)");
			} else if (year >= 1965 && year < 1981){
	        System.out.println(name + " you are Generation X");
			} else if (year >= 1946 && year < 1965){
	        System.out.println(name + " you are Baby Boomers");
			} else if (year >= 1928 && year < 1946){
	        System.out.println(name + " you are Silent generation");
			} else {
			    System.out.println("Unknown / out of range");
			}
			if (year >= 1928 && year <=2025){
			    System.out.println("Currently you are " + (2025 - year) + " year/s old");  
			}
			
			System.out.println("-------------------------------");
			System.out.print("Do you want to continue [y/n]? "); 
			answer = scanner.nextLine().charAt(0);
			if (answer == 'Y' || answer == 'y'){
			    System.out.println("-------------------------------\n");
			} else {
			    System.out.println("-------------------------------");
			    System.out.println("    Thank you for visiting!");
			}
		} while (answer != 'n' && answer != 'N');
		} 
}
