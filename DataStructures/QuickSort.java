import java.util.Scanner;

public class QuickSort {
    public static void swap(int a[],int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static int partion(int a[],int low,int high){
        int p=a[low];
        int i=low+1;
        int j=high-1;
        while(a[i]<=p && i<=j){
            i=i+1;
        }
        while(a[j]>=p && i<=j){
            j=j-1;
        }
        if(i<j){
            swap(a, i, j);
        }
        swap(a,j,low);
        return j;
    }
    public static void sort(int a[],int low,int high){
        if(low<high){
            int j=partion(a, low, high);
            sort(a,low,j-1);
            sort(a,j+1,high);
        }
    }
    public static void main(string args[]){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
       } 
       sort(a,0,n-1);
       for(int i:a){
        System.out.print(i+" ");
       }
    }
}
