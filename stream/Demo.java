package stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[]args){
        List<Integer> nums =Arrays.asList(4,5,6,8,10);

        nums.forEach(n-> System.out.println(n)); // foreach loop using lambda expression

        // for(int i=0;i<nums.size();i++){
        //     System.out.println(nums.get(i));
        // }

        // // for(int n:nums){
        // //     System.out.println(n);
        // }

        // int sum=0;

        // for(int n:nums){
        //     if(n%2==0){
        //         n=n*2;
        //         sum=sum+n;
        //     }
        // }
        // System.out.println(sum);
    }
    
}
