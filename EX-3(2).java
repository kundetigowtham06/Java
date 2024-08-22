import java.util.*;
public class Main{
static int sum(int a,int b){
	return a+b;
}
static int sum(int a,int b,int c){
	return a+b+c;
}
public static void main(String args[])
{
	int a,b,c;
	System.out.println("Enter a,b,c values:");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	int add=sum(a,b);
	System.out.println("Sum of a,b ="+" "+add);
	int three=sum(a,b,c);
	System.out.println("Sum of a,b,c ="+" "+three);
}
}
