import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//// Lab 4 - IT 2351
// Your Name: Jose Zapata

public class Main {
    public static void main(String[] args) {
      System.out.println("Unsorted Array ---------------------------------------------------");
      ArrayList<Integer> integerList = Lab4.getList();
      Lab4.outputList(integerList);

      System.out.println("\n\nBubble sort results ----------------------------------------------");
      ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(integerList);
      Lab4.outputList(bubbleSortedList);

      System.out.println("\n\nInsertion sort results -------------------------------------------");
      ArrayList<Integer> insertionSortedList = Lab4.insertionSort(integerList);  
      Lab4.outputList(insertionSortedList);
    }
}

class Lab4 {
  public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {
    // Clone the list so we don't sort an already-sorted array in main
    ArrayList<Integer> list = new ArrayList<>(integerList);
    
    long startTime = System.nanoTime();

    // Step 1 - Implement insertion sort algorithm here
    for (int i = 1; i < list.size(); i++) {
        int key = list.get(i);
        int j = i - 1;

        // Shift elements of list[0..i-1] that are greater than the key
        while (j >= 0 && list.get(j) > key) {
            list.set(j + 1, list.get(j));
            j--;
        }
        list.set(j + 1, key);
    }

    long endTime = System.nanoTime();
    System.out.println("\n[Insertion Sort Execution Time: " + (endTime - startTime) + " nanoseconds]");

    return list;
  }

  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
    // Clone the list so we don't modify the original unsorted list
    ArrayList<Integer> list = new ArrayList<>(integerList);
    
    long startTime = System.nanoTime();

    // Step 2 - Implement the bubble sort algorithm here
    int n = list.size();
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (list.get(j) > list.get(j + 1)) {
                // Swap list[j] and list[j+1]
                int temp = list.get(j);
                list.set(j, list.get(j + 1));
                list.set(j + 1, temp);
            }
        }
    }

    long endTime = System.nanoTime();
    System.out.println("\n[Bubble Sort Execution Time: " + (endTime - startTime) + " nanoseconds]");

    return list;
  }

  public static ArrayList<Integer> getList() {
    ArrayList<Integer> integerList = new ArrayList<>();
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("integers.txt"))) {
        while ((line = br.readLine()) != null) {
            integerList.add(Integer.parseInt(line));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return integerList;
  }

  public static void outputList(ArrayList<Integer> integerList) {
    for (int i = 0; i < integerList.size(); i++) {
        System.out.print(integerList.get(i) + " ");
    }
  }
}