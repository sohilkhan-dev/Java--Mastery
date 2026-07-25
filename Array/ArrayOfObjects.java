package Array;

class Student{
    String name;
    int age;
}

public class ArrayOfObjects {
    public static void main(String[]args){
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 20;

        Student s2 = new Student();
        s2.name = "Alice";
        s2.age = 22;

        Student s3 = new Student();
        s3.name = "Bob";
        s3.age = 21;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i=0;i<students.length;i++){
        //     System.out.println("Name: "+students[i].name+" Age: "+students[i].age);


        // }

        for(Student stud: students){
            System.out.println("Name: "+stud.name+", Age: "+stud.age);  // enhanced for loop
        }
    }
    
}
