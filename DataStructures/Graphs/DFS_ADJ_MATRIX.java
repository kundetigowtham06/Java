import java.util.*;

public class DFSADJ {
    static int v;
    static int adj[][];
    static boolean visited[];

    DFSADJ(int v) {
        this.v = v;
        adj = new int[v][v];
        visited = new boolean[v];
        Arrays.fill(visited, false);
    }

    public static void DFS(int start) {
        visited[start] = true;
        System.out.print(start + " ");
        for (int i = 0; i < v; i++) {
            if (adj[start][i] == 1 && !visited[i]) {
                DFS(i);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no of vertices: ");
        int v = sc.nextInt();
        DFSADJ dfs = new DFSADJ(v);
        System.out.println("Enter adjacency matrix: "); 
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                dfs.adj[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter source vertex for DFS:"); 
        int start = sc.nextInt();
        dfs.DFS(start);
    }
}
