package ShortestPathAlgorithm;

public class algorithm 
{
    static public int V = value.V;

    public static void dijkstra(int graph[][], int src) 
    {
        int count;
        int v, i;
        int dist[] = new int[V];
        Boolean sptSet[] = new Boolean[V];

        for (i = 0; i < V; i++) 
        {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        dist[src] = 0;

        for (count = 0; count < V - 1; count++) 
        {
            int u = minimum_distance.minDistance(dist, sptSet);

            sptSet[u] = true;

            for (v = 0; v < V; v++) 
            {

                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) 
                {
                    dist[v] = dist[u] + graph[u][v];
                }
            }

            System.out.println("${dist},  $V");

        }
    }
}
