/**
 * Name: Jose Zapataa
 * Course: IT 2660
 * Lab 7: Graph and Applications
 */
import java.util.List;

class Main {
  public static void main(String[] args) {
    
    // 1. Define the vertices (buildings) based on the campus map
    String[] vertices = {
      "Liberal Arts",               // 0
      "Student Services",           // 1
      "Health Careers & Sciences",  // 2
      "Health Technologies Center", // 3
      "Recreation Center",          // 4
      "Technology Learning Center", // 5
      "Business & Technology",      // 6
      "Theatre"                     // 7
    };

    // 2. Define Edges
    // Based on visual connections/walkways on the provided map:
    int[][] edges = {
      {0, 1}, {1, 0}, // Liberal Arts to Student Services
      {0, 7}, {7, 0}, // Liberal Arts to Theatre
      {6, 1}, {1, 6}, // Business & Technology to Student Services
      {6, 7}, {7, 6}, // Business & Technology to Theatre
      {1, 5}, {5, 1}, // Student Services to Technology Learning Center
      {1, 2}, {2, 1}, // Student Services to Health Careers & Sciences
      {2, 3}, {3, 2}, // Health Careers & Sciences to Health Technologies Center
      {2, 4}, {4, 2}  // Health Careers & Sciences to Recreation Center
    };

    // 3. Create the graph (name "graph") using the vertices and edges
    UnweightedGraph<String> graph = new UnweightedGraph<>(vertices, edges);

    // 4. Perform a depth-first search (name "dfs") starting from the "Business & Technology" building (vertex 6)
    UnweightedGraph<String>.SearchTree dfs = graph.dfs(6);

    // 5. Retrieve and print the search order of the DFS traversal
    List<Integer> searchOrder = dfs.getSearchOrder();
    System.out.println("--- DFS Search Order ---");
    for (int i = 0; i < searchOrder.size(); i++) {
      System.out.print(graph.getVertex(searchOrder.get(i)));
      if (i < searchOrder.size() - 1) {
        System.out.print(" -> ");
      }
    }
    System.out.println("\n");

    // 6. Print the parent-child relationships for each vertex during the DFS traversal
    System.out.println("--- Parent-Child Relationships ---");
    for (int i = 0; i < searchOrder.size(); i++) {
      int v = searchOrder.get(i);
      int parent = dfs.getParent(v);
      if (parent != -1) {
        System.out.println("Parent of [" + graph.getVertex(v) + "] is [" + graph.getVertex(parent) + "]");
      }
    }
    System.out.println();

    // 7. Call the printPath method
    System.out.println("--- Paths from Business & Technology ---");
    dfs.printPath(3); // Path to Health Technologies Center
    System.out.println(); 
    dfs.printPath(1); // Path to Student Services
    System.out.println();
    dfs.printPath(4); // Path to Recreation Center
    System.out.println("\n");

    // 8. Call printTree() to print the entire DFS tree
    System.out.println("--- Full DFS Tree ---");
    dfs.printTree();
  }
}