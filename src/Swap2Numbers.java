import java.util.Scanner;

public class Swap2Numbers {
public static void main(String[] args) {
System.out.println("enter 2 numbers");
Scanner s = new Scanner(System.in);
int a = s.nextInt();
int b = s.nextInt();
System.out.println("before swapping a = "+a+" b = "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("after swapping a = "+a+" b = "+b);

}
}
