import java.util.Scanner;

public class Selection {
    public static void sort(int a[],int n){
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
            int t=a[min];
            a[min]=a[i];
            a[i]=t;
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
