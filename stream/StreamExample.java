package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 4, 5, 6, 7, 8, 9, 10);
        int result=nums.stream()
    					.filter(n-> n%2==0)
    					.map(n->n*2)
    					.reduce(0, (c,e)-> c+e);
    	System.out.println(result);





        

       

        // nums.stream()
        //         .map(n -> n * 2)
        //         .forEach(System.out::println);

        // nums.stream()
        //         .filter(n -> n > 15)
        //         .forEach(n -> System.out.println(n));

        // Stream<Integer> s1 = nums.stream();
        // s1.forEach(n-> System.out.println(n));

        // Stream<Integer> s2 = nums.stream();
        // s2.filter(n->n%2==0).forEach(n->System.out.println(n));

        // Stream<Integer> s3 = nums.stream();
        // s3.map(n->n*2).forEach(n->System.out.println(n));
    }

}
