import java.util.*;
public class DFSADJList {
    static int v;
    static boolean visited[];
    LinkedList<Integer> adj[];
    DFSADJList(int v){
        this.v=v;
        visited=new boolean[v];
        adj=new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList<>();
        }
    }
    public void Add(int src, int dest) {
        adj[src].add(dest);
        adj[dest].add(src);
    }
    public  void DFS(int start){
        Arrays.fill(visited,false);
        Stack<Integer> s=new Stack<>();
        s.push(start);
        visited[start]=true;
        while(!s.isEmpty()){
            int w=s.pop();
            System.out.print(w+" ");
            for(int i:adj[w]){
                if(!visited[i]){
                    s.push(i);
                    visited[i]=true;
                }
            }


        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int src,dest;
        System.out.println("enter no vertices and edges:");
        int v = sc.nextInt();
        int e = sc.nextInt();
        DFSADJList b = new DFSADJList(v);
        System.out.println("enter src and dest:");
        for(int i =0;i<e;i++) {
            src = sc.nextInt();
            dest = sc.nextInt();
            b.Add(src,dest);
        }
        System.out.println("enter starting vertex:");
         int start = sc.nextInt();
         b.DFS(start);
    }
}
