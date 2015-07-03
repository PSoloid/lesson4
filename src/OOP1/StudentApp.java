package OOP1;

/**
 * Created by ITHILLEL7 on 30.06.2015.
 */
public class StudentApp {
    public static void main(String[] args){

        int [] marks = new int[10];
        Student student = new Student(5, "Ivanov", marks);

        Student studentCopy = new Student(student);

        System.out.println(student.id);
        System.out.println(student.surname);
        System.out.println(student.marks);

        System.out.println();
        
        System.out.println(studentCopy.id);
        System.out.println(studentCopy.surname);
        System.out.println(studentCopy.marks);

    }
}
