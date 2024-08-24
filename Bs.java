import java.util.Scanner;
public class Binary{
static void bubblesort(int[] A,int n){
for(int i=0;i<n-1;i++){
	for(int j=0;j<n-i-1;j++){
		if(A[j]>A[j+1]){
			int temp=A[j];
			A[j]=A[j+1];
			A[j+1]=temp;
			}
		}
		}
		}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements:");
		int n=sc.nextInt();
		int[] A=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
			A[i]=sc.nextInt();
		bubblesort(A,n);
		System.out.println("soretd array:");
		for(int i=0;i<A.length;i++)
			System.out.print(A[i] + " ");
		}
		int start=0,end=n-1,mid,pos;
		System.out.println("Enter element to search:");
		int key=sc.nextInt();
		while(start<=end){
		mid=(start+end)/2;
		if(key==a[mid]){
		pos=mid+1;
		break;
		}
		else if(key<a[mid]){
		end=mid-1;
		}
		else{
		start=mid+1;
		}
	if(pos>0){
	System.out.printf("The key is found at %d",pos);
	}
	else{
	System.out.println("Key is not found ");
	}
		}
		
}
