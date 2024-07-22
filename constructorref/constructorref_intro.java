package constructorref;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    private String name;
    private int age;

    public Student(String name2) {
        this.name = name2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    
    
}
public class constructorref_intro {
    public static void main(String[] args) {

       List <String> names = Arrays.asList("navin","harsh","john");
       List<Student> students = new ArrayList<>();
       for(String name:names){
          students.add(new Student(name));
       }
       
       //list of student into List of objects noraml method
    //    students = names.stream().map(name -> new Student(name)).toList();

                      //or
        //constructor reference
        // students = names.stream().map(Student::new).toList();
       System.out.println(students);
    }
}
