import java.util.Scanner;

public class FindQuotientAndReminder {
	public static void main(String[] args) {
		System.out.println(" enter dividend and divisor");
		Scanner s = new Scanner(System.in);
		int dividend = s.nextInt();
		int divisor = s.nextInt();
		try {
			System.out.println("reminder is = " + ((float) dividend % divisor));
			System.out.println("quotient is =" + ((float) dividend / divisor));
		} catch (Exception e) {
			System.out.println("invalid input");
		}
	}

}