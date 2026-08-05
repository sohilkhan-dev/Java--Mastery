package collection;
import java.util.HashSet;
import java.util.Set;
// import java.util.TreeSet;

public class SetExample {
    public static void main(String[]args){

        Set<Integer> nums = new HashSet<Integer>();
        // Set<Integer> nums = new TreeSet<Integer>(); // TreeSet will sort the elements in ascending order;
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(10); // Duplicate value, will not be added

        System.out.println("Set elements: " + nums);
        for(int n:nums){
            System.out.println(n);
        }
    }

    
}
