import java.util.*;
class Root{
public static void main(String args[])
{
int a;
int b;
int c;
double root1,root2;
System.out.println("Enter a,b,c:");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
int d=(b*b)-(4*a*c);
if(d>0)
{
	root1=(-b+Math.sqrt(d))/(2*a);
	root2=(-b-Math.sqrt(d))/(2*a);
	System.out.println("The roots are real and distinct root1="+root1+" root2="+root2);
}
else if (d==0)
	{
	root1=root2=(-b/(2*a));
	System.out.println("The roots are equal");
	System.out.format("root1=%.2f and root2=%.2f",root1,root2);
	}
else
	{
	double real=(-b/2*a);
	double ima=(Math.sqrt(-d))/(2*a);
	System.out.format("Root1=%.2f+i%.2f\n",real,ima);
	System.out.format("Root2=%.2f-i%.2f\n",real,ima);

	}
}
}
