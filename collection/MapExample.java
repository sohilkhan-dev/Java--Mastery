package collection;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[]args){
        
        Map<String,Integer> students = new HashMap<>();
        students.put("Alice", 90);
        students.put("Bob", 85);
        students.put("Charlie", 95);
        students.put("Alice", 92); // Update Alice's grade
        students.put("David", 88);
        System.out.println("Student grades: " + students);

        // Get value by key
        System.out.println("Alice's grade: " + students.get("Alice"));
        System.out.println("Bob's grade: " + students.get("Bob"));
        System.out.println("Charlie's grade: " + students.get("Charlie"));

        // Remove a key-value pair
        students.remove("Bob");
        System.out.println("Student grades after removing Bob: " + students);

        for(String name:students.keySet()){
            System.out.println(name + ": " + students.get(name));
        }

        System.out.println("Size of the map: " + students.size());

    }
    
}
