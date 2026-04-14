public class Main {
  public static void main(String[] args) {
    // Step 3: Create map
    MyMap<String, Integer> creditHours = new MyHashMap<>();

    // Step 4: put() values
    creditHours.put("IT-1025", 3);
    creditHours.put("IT-1050", 3);
    creditHours.put("IT-1150", 3);
    creditHours.put("IT-2310", 3);
    creditHours.put("IT-2320", 4);
    creditHours.put("IT-2351", 4);
    creditHours.put("IT-2650", 4);
    creditHours.put("IT-2660", 4);
    creditHours.put("IT-2030", 4);

    // Step 5: Check keys
    System.out.println("Contains IT-1025? " + creditHours.containsKey("IT-1025"));
    System.out.println("Contains IT-2110? " + creditHours.containsKey("IT-2110"));

    // Step 6: Print all content
    System.out.println("Full Map Content: " + creditHours.toString());

    // Step 7: Remove specific keys
    creditHours.remove("IT-2030");
    creditHours.remove("IT-1150");

    // Step 8: Print values only
    System.out.println("Remaining Values: " + creditHours.values());
  }
}