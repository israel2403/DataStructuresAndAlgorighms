package graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String, ArrayList<String>> adList = new HashMap<>();

    public boolean addVertex(String vertex) {
        if (adList.get(vertex) == null) {
            adList.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String vertex1, String vertex2) {
        if (adList.get(vertex1) != null && adList.get(vertex2) != null) {
            adList.get(vertex1).add(vertex2);
            adList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeEdge(String vertex1, String vertex2) {
        if (adList.get(vertex1) != null && adList.get(vertex2) != null) {
            adList.get(vertex1).remove(vertex2);
            adList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex) {
        if (adList.get(vertex) == null) {
            return false;
        }
        for (String otherVetex : adList.get(vertex)) {
            adList.get(otherVetex).remove(vertex);
        }
        adList.remove(vertex);
        return true;
    }

    public void printGraph() {
        System.out.println(adList);
    }
}
