import java.util.Scanner;

public class VowelOrConsonent {
	public static void main(String[] args) {
		String a = "aeiouAEIOU";
		System.out.println("enter an alphabet");
		Scanner s = new Scanner(System.in);
		char c = s.next().charAt(0);
		if (a.indexOf(c) != -1)
			System.out.println("it is a vowel"+c);
		else
			System.out.println("it is a consonent"+c);
	}
}
