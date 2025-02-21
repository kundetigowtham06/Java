import java.util.*;

public class BFSADJ {
    static int v;
    static int adj[][];
    static boolean visited[];

    BFSADJ(int v) {
        this.v = v;
        adj = new int[v][v];
        visited = new boolean[v];
    }

    public static void BFS(int start) {
        Arrays.fill(visited, false);
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            int s = q.poll();
            System.out.print(s + " ");
            for (int i = 0; i < v; i++) {
                if (adj[s][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true; 
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no of vertices: ");
        int v = sc.nextInt();
        BFSADJ bfs = new BFSADJ(v);
        System.out.println("Enter adjacency matrix: " + v + "x" + v); 
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                bfs.adj[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter starting vertex for BFS:");
        int start = sc.nextInt();
        bfs.BFS(start);
    }
}
