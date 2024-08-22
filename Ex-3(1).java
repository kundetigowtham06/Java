import java.util.*;
public class Main{
static int sum(int a,int b){
	return a+b;
}
int mul(int a,int b){
	return a*b;
}
public static void main(String args[])
{
	int a,b;
	System.out.println("Enter a,b values:");
	Scanner sc=new Scanner(System.in);
	Main obj=new Main();
	a=sc.nextInt();
	b=sc.nextInt();
	int add=sum(a,b);
	System.out.println("Sum is"+" "+add);
	int Mul=obj.mul(a,b);
	System.out.println("Mul is"+" "+Mul);
}
}
