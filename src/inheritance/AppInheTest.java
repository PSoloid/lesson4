package inheritance;



/**
 * Created by ITHILLEL7 on 07.07.2015.
 */
public class AppInheTest {
    public static void main(String[] args){

        Person person = new Person();
//        Student student = new Student();
        Student student = new Student(100,"Ivanov", new int[]{1,2,2});
        
        student.print();
        person.print();

//        System.out.println(person.getId());
//        System.out.println(student.getId());
    }
}
