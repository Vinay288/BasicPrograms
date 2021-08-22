import java.util.Scanner;

public class HarmonicNumber {
public static void main(String[] args) {
System.out.println("enter value of n");
Scanner s = new Scanner(System.in);
int n=s.nextInt();
System.out.println("nth harmonic series is 1/"+(1+(n-1)*1));
}
}
