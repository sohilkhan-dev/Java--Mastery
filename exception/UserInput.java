package exception;

// user input through scanner

import java.util.Scanner;

public class UserInput {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        sc.close();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
}   

// userinput throuogh buffered reader

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class UserInput {
//     public static void main(String[] args) throws IOException {

//         BufferedReader br =
//                 new BufferedReader(new InputStreamReader(System.in));

//         System.out.print("Enter your name: ");
//         String name = br.readLine();

//         System.out.print("Enter your age: ");
//         int age = Integer.parseInt(br.readLine());

//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }
// }
