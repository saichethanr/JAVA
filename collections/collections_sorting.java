package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


//auto sorting already mentioning in the class
//use comparable in the class itself
//or define the comparator in the main metjhod for this class
//these are the two methods available to sort a class
class Student implements Comparable<Student>{
    int age;
    String name;


    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student that) {
        if(this.age>that.age){
            return 1;
         }
         else{
            return -1;
         }
    }

    
}
public class collections_sorting {
    public static void main(String[] args) {
        //basic sorting
        List<Integer> nums1 = new ArrayList<>();
        nums1.add(4);
        nums1.add(5);
        nums1.add(9);
        nums1.add(10);

        Collections.sort(nums1);
        System.out.println(nums1);

        //custom sorting
        //based on the  length of the string
        List<String> num = new ArrayList<>();
        num.add("sai");
        num.add("kothu");
        num.add("pinjuu");
        num.add("gansjsss");
         
        Comparator <String> comp = new Comparator<String>(){
            @Override
            public int compare(String i, String j) {
                 if(i.length() > j.length()){
                    return 1;
                 }
                 else{
                    return -1;
                 }
            }  
        };
        
        System.out.println(num);
        
        //sutom sorting based on the last digit of the string
        List<Integer> nums = new ArrayList<>();
        nums.add(34);
        nums.add(45);
        nums.add(59);
        nums.add(10);
         
        Comparator <Integer> comps = new Comparator<Integer>(){
            @Override
            public int compare(Integer i, Integer j) {
                //if returns 1 then  it swaps if it dosent return 1 it dosent swap
               if(i%10 > j%10){
                 return 1;
               }
               else{
                return -1;
               }
            }
        };
        Collections.sort(nums,comps);
        System.out.println(nums);


       

        //we can also use the lambda expression to solve tthe comparator
        //List of students
        List<Student> stud = new ArrayList<>();
        stud.add(new Student(29, "sai"));
        stud.add(new Student(90, "shilpa"));
        stud.add(new Student(27, "kimiko"));

        for(Student s: stud){
            System.out.println(s);
        }

        //sort these values based on their age
        Comparator <Student> compa = new Comparator<Student>() {
            @Override
            public int compare(Student i, Student j) {
                //if returns 1 then  it swaps if it dosent return 1 it dosent swap
             if(i.age>j.age){
                return 1;
             }
             else{
                return -1;
             }
            }
        };
    }
}
