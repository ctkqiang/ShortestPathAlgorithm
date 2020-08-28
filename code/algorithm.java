package code;

import code.util.output;

public class algorithm {
    static public int V = value.V;

    public static void dijkstra(int graph[][], int src) {
        int dist[] = new int[V];
        Boolean sptSet[] = new Boolean[V];

        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        dist[src] = 0;

        for (int count = 0; count < V - 1; count++) {
            int u = minimum_distance.minDistance(dist, sptSet);

            sptSet[u] = true;

            for (int v = 0; v < V; v++) {

                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
            output.solution(dist, V);
        }
    }
}