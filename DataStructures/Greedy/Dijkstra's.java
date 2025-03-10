import java.util.Scanner;


public class SSSP {
    public static int Inf = 999;

    public static int min(int dist[], boolean s[], int n) {
        int min = Inf;
        int minidx = -1;
        for (int i = 0; i < n; i++) {
            if (!s[i] && dist[i] < min) {
                min = dist[i];
                minidx = i;
            }
        }
        return minidx;
    }

    public static void shortest(int cost[][], int dist[], int source, int n) {
        boolean s[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            dist[i] = cost[source][i];
        }
        dist[source] = 0;  
        s[source] = true;
        for (int num = 1; num < n; num++) {
            int selected = min(dist, s, n);
            if (selected == -1) break;
            s[selected] = true;
            for (int w = 0; w < n; w++) {
                if (!s[w] && dist[selected] + cost[selected][w] < dist[w])
                    dist[w] = dist[selected] + cost[selected][w];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter number of vertices:");
        int v = sc.nextInt();
        int cost[][] = new int[v][v];
        System.out.println("\nEnter Cost Matrix:");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {  
                cost[i][j] = sc.nextInt();
            }
        }
        int dist[] = new int[v];
        System.out.println("\nEnter source:");
        int s = sc.nextInt();
        shortest(cost, dist, s, v);
        for (int i = 0; i < v; i++) {
            System.out.println("shortest path from " + s + " to " + i + " is " + ((dist[i] == Inf) ? "INF" : dist[i]));
        }
    }
}
