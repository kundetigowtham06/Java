import java.util.Scanner;

public class Insertion {
    public static void sort(int a[],int n){
        for(int i=1;i<n;i++){
            int k=a[i];
            int j=i-1;
            while(j>=0 && a[j]>k){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=k;
        }
    }
    public static void display(int a[]){
        for(int i:a){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter size:");
            int n=sc.nextInt();
            int[] a=new int[n];
            System.out.println("Enter Elements:");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("Before Swaping:");
            display(a);
            System.out.println("");
            System.out.println("After Swaping:");
            sort(a,n);
            display(a);
        }
    
}
