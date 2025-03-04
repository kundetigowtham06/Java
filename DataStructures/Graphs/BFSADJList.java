import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSADJList {
    static int v;
    static boolean visited[];
    LinkedList<Integer> adj[];
    
    BFSADJList(int v) {
        this.v = v;
        visited = new boolean[v];
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void Add(int src, int dest) {
        adj[src].add(dest);
        adj[dest].add(src);
    }

    public void BFS(int start) {
        Arrays.fill(visited, false);
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            int s = q.poll();
            System.out.print(s + " ");
            for (int i : adj[s]) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int src, dest;
        System.out.println("Enter number of vertices and edges:");
        int v = sc.nextInt();
        int e = sc.nextInt();
        BFSADJList b = new BFSADJList(v);
        System.out.println("Enter source and destination:");
        for (int i = 0; i < e; i++) {
            src = sc.nextInt();
            dest = sc.nextInt();
            b.Add(src, dest);
        }
        System.out.println("Enter starting vertex:");
        int start = sc.nextInt();
        b.BFS(start);
        sc.close();
    }
}
