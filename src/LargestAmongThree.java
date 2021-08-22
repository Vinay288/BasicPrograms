import java.util.Scanner;

public class LargestAmongThree {
	public static void main(String[] args) {
		System.out.println("enter three numbers");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
		if (a > b) {
			if (a > c) {
				System.out.println("a is largest " + a);

			} else {
				System.out.println("c is largest " + b);
			}
		} else if (b > c) {
			System.out.println("b is largest" + b);
		} else {
			System.out.println("c is largest " + c);
		}

	}
}
