import java.util.Scanner;

public class GraphColoring {
    static int adj[][];
    static int v;
    static int[] x;

    GraphColoring(int v) {
        this.v = v;
        adj = new int[v][v];
        x = new int[v];
    }

    public static boolean isSafe(int k, int color) {
        for (int j = 0; j < v; j++) {
            if (adj[k][j] == 1 && x[j] == color) {
                return false;
            }
        }
        return true;
    }

    public static void coloring(int k, int colors) {
        if (k == v) {
            for (int i = 0; i < v; i++) {
                System.out.print(x[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= colors; i++) {
            if (isSafe(k, i)) {
                x[k] = i;
                coloring(k + 1, colors);
                x[k] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of vertices:");
        int v = sc.nextInt();
        GraphColoring g = new GraphColoring(v);

        System.out.println("Enter the adjacency matrix :");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                g.adj[i][j] = sc.nextInt();
            }
        }

        int colors = v;
        coloring(0, colors);

        sc.close();
    }
}
