import java.util.*;
public class Merge {
    public static void conquer(int a[],int start,int mid,int end){
        int[] arr=new int[end-start+1];
        int id1=start;
        int id2=mid+1;
        int x=0;
        while(id1<=mid && id2<=end){
            if(a[id1]<=a[id2]){
                arr[x++]=a[id1++];
            }
            else{
                arr[x++]=a[id2++];
            }
        }
        while(id1<=mid){
            arr[x++]=a[id1++];

        }
        while(id2<=end){
            arr[x++]=a[id2++];

        }
        for(int i=0,j=start;i<arr.length;i++,j++){
            a[j]=arr[i];
        }


    }
    public static void divide(int a[],int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        divide(a,start,mid);
        divide(a,mid+1,end);
        conquer(a,start,mid,end);

    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
       } 
       divide(a,0,n-1);
       for(int i:a){
        System.out.print(i+" ");
       }
    }
}
