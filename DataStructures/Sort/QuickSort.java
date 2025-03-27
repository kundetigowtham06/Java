import java.util.*;

public class QuickSort {
    public static void sort(int a[], int low, int high) {
        if (low < high) {
            int j = partition(a, low, high);
            sort(a, low, j - 1);
            sort(a, j + 1, high);
        }
    }

    public static int partition(int a[], int low, int high) {
        int p = a[low];  
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= high && a[i] <= p) {
                i++;
            }
            while (a[j] > p) {
                j--;
            }

            if (i < j) {
                swap(a, i, j);
            }
        }

        swap(a, low, j); 
        return j;
    }

    public static void swap(int a[], int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        sort(a, 0, n - 1);

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}

