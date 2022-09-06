import java.util.Scanner;
	class Main {
		public static void main(String[] args) {
    	
			System.out.println("Введите год в формате yyyy");
			Scanner scanner = new Scanner(System.in);
			int year = scanner.nextInt();
			
			if (year % 400 == 0) {
			    System.out.println("Год "  + year + " високосный");
			} else if (year % 4 == 0 && year % 100 != 0) {
				System.out.println("Год " + year + " високосный");
			} else {
				System.out.println("Год " + year + " не високосный");
			}
	}
}