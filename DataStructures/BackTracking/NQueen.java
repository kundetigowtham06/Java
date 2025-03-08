import java.util.*;
public class NQueen {
    static int x[];
    public static void queens(int k, int n) {
        if (k > n) {
            for (int i = 1; i <= n; i++) {
                System.out.print(x[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                if (place(k, i)) {
                    x[k] = i; 
                    queens(k + 1, n);
                }
            }
        }
    }

    public static boolean place(int k, int i) {
        for (int j = 1; j < k; j++) {
            if (x[j] == i || Math.abs(x[j] - i) == Math.abs(j - k))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of Queens=");
        int n = sc.nextInt();
        x = new int[n + 1];
        queens(1, n);
        
    }
}
