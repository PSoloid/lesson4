package OOP1;

/**
 * Created by ITHILLEL7 on 30.06.2015.
 */
public class StudentApp {
    public static void main(String[] args){

        Student student = new Student();

        System.out.println(student.id);
        student.id = 1;
        System.out.println(student.id);

        Student student2 = new Student();
        student2.id=100;

        student.come();
        student2.come();
    }
}
