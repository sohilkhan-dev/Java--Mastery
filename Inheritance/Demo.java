package Inheritance;

public class Demo {
    public static void main(String[]args){
        // AdvanCalc obj = new AdvanCalc();
        ScientificCalc obj = new ScientificCalc();
        int r1 =obj.add(10,20);
        int r2 =obj.sub(30,20);
        int r3 =obj.mul(12,20);
        int r4 =obj.div(40,20);
        double r5 =obj.power(4,2);

        System.out.println(r1+"  "+r2+"  "+r3+"  "+r4 +" "+r5);

      
    }
    
}
