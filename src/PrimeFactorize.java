import java.util.Scanner;

public class PrimeFactorize {
public static void main(String[] args) {
System.out.println("enter the value of n");
Scanner s = new Scanner(System.in);
int n=s.nextInt();
int i=2;
System.out.println("prime factors are");
while((i*i)<=n) {
	if(n%i==0) {
		int c=0;
		for(int j=2;j<=Math.sqrt(i);j++) {
			if(i%j==0)
				c++;
		}
		if(c==0)
			System.out.println(i);
	}
	i++;
}
}
}
