import java.util.Scanner;

public class PowerOfN {
	public static void main(String[] args) {
		System.out.println("enter valuue of n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i <= n; i++)
			System.out.println((int) Math.pow(2, i));
	}
}
