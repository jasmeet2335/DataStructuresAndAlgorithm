package Graphs;
import java.util.*;

public class connectedComponentsBfs {
    /*
     * BFS - Breadth First Search
     * DFS - Depth First Search 
     */

     // Go to immediate neighbors first 
     // This is very similar to the level Order Traversal and we use queue to perform this action

     static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src= s;
            this.dest = d;
            this.wt = w;
        }
     }

     // length isa property of an array 
     // size() is a property of an arrayList
     static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<>(); 
        }

        // 0 - vertex
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        // 1 - vertex
        graph[1]. add(new Edge(1, 0, 1));
        graph[1]. add(new Edge(1, 3, 1));

        // 2 - vertex
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        // 3- vertex
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        // 4 - vertex
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        // 5 - vertex
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        // 6 - vertex
        graph[6].add(new Edge(6, 5, 1));
     }

     public static void bfs(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        for(int i = 0; i <graph.length; i ++){
            if(!vis[i]){
                bfsUtil(graph, vis);
            }
        }
     }
     public static void bfsUtil(ArrayList<Edge> graph[], boolean vis[]){ // O(V+E)
        Queue<Integer> q = new LinkedList<>();
        q.add(0); // src = 0;
        while(!q.isEmpty()){
            int curr = q.remove();

            if(!vis[curr]){ // visit curr 
                System.out.print(curr + " ");
                vis[curr] = true;
                for(int i = 0; i<graph[curr].size(); i ++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }

            }
        }

     }
     public static void main(String args[]){
        /*
         *      1-----3
         *     /      | \
         *    0       |  5 --- 6
         *    \       | / 
         *     2 ---- 4   
         */

         int V = 7;
         ArrayList<Edge> graph[] = new ArrayList[V];
         createGraph(graph);
        bfs(graph);
        
     }
}

/*
 * Undirected - We can find out the the cycle in a grpah by using dfs, bfs and DSU (Disjoint Set unit)
 * Directed - DFS, BFS Topological Coat (Kahn's algorithm)
 */
