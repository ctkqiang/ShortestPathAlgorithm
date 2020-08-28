package code.util;

import code.minimum_distance;
import code.value;

public class output {

    static public int K = value.V;

    public static void solution(int dist[], int n) {
        System.out.println("Vertex   Distance from Source");

        for (int i = 0; i < K; i++)
            System.out.println(i + " tt " + dist[i]);
    }
}