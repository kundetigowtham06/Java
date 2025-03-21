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

    public static boolean coloring(int k, int colors) {
        if (k == v) {
            return true;
        }

        for (int i = 1; i <= colors; i++) {
            if (isSafe(k, i)) {
                x[k] = i;
                if (coloring(k + 1, colors)) {
                    return true;
                }
                x[k] = 0;
            }
        }
        return false;
    }

    public static int findChromaticNumber() {
        int colors = 1;
        while (!coloring(0, colors)) {
            colors++;
        }
        return colors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of vertices:");
        int v = sc.nextInt();
        GraphColoring g = new GraphColoring(v);

        System.out.println("Enter the adjacency matrix:");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                g.adj[i][j] = sc.nextInt();
            }
        }

        int chromaticNumber = findChromaticNumber();
        System.out.println("The minimum number of colors needed is: " + chromaticNumber);
        for(int i:x){
            System.out.print(i+" ");
        }

        sc.close();
    }
}
