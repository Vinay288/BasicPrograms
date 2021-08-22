import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n % 2 == 0)
			System.out.println("it is even number");
		else
			System.out.println("it is a odd number");
	}
}
