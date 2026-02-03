//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Jose Zapata
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();

    // Array with values mentioned in the Lab.
    int[] nums = {5, 9, 3, 12, 7, 3, 11, 5};

    // Output the array in order using a while loop.
    System.out.print("Array in order: ");
    int i = 0;
    while (i < nums.length) {
      System.out.print((nums[i] + " "));
      i++;
    }
    System.out.println();

    // Output ther array in reverse using a for loop.
    System.out.print("Array in reverse: ");
    for (int j = nums.length - 1; j >= 0; j--) {
      System.out.print(nums[j] + " ");
    }
    System.out.println();

    // The First and las values of the array.
    System.out.println("First Value: " + nums[0]);
    System.out.println("Last value: " + nums[nums.length - 1]);


    // Methods created in Lab1.
    System.out.println("max of 5 and 9: " + lab.max(5, 9));
    System.out.println("Min of 5 and 9: " + lab.min(5, 9));
    System.out.println("Sum of array: " + lab.sum(nums));
    System.out.println("Average of array: " + lab.avarage(nums));
    System.out.println("Max of array: " + lab.max(nums));
    System.out.println("Min of array: " + lab.min(nums));

  }
}     

// Add all of the methods here.
class Lab1 {
  public int increment(int num) {
    return ++num;
  }
}


// max(int a, int b): returning the maximum value using an if statement
public int max(int a, int b) {
  if (a > b) {
    return a;
  } else {
    return b;
  }
}

// min(int a, int b): returning the minimum value using an if statement.
public int max(int a, int b) {
  if (a > b) {
    return a;
  } else {
    return b;
  }
}

// sum(int[] nums): Returning the sum of all values in the array.

pubilc int sum(int[] nums) {
  int total = 0;
  for (int num : nums) {
    total += num;
  }
  return total;
}

// average(int[] nums): Returning the average with a foreach loop
  public double average(int[] nums) {
    int total = 0;
    for (int num : nums) {
      total += num;
    }
   
    return (double) total / nums.length;
  }

  // max(int[] nums): Returning the maximum value using a for loop .
  public int max(int[] nums) {
    int maxVal = nums[0]; 
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > maxVal) {
        maxVal = nums[i];
      }
    }
    return maxVal;
  }

  // min(int[] nums): Use a for loop to return the minimum value.
  public int min(int[] nums) {
    int minVal = nums[0]; 
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < minVal) {
        minVal = nums[i];
      }
    }
    return minVal;
  }
