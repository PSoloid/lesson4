package inheritance;

/**
 * Created by ITHILLEL7 on 07.07.2015.
 */
public class Student extends Person {

    private int[] marks =new int[34];

    public Student(int id, String sur,int[] marks) {
        super(id,sur);
        this.marks = marks;
        print();
        System.out.println(super.hashCode());
    }

    public void print(){
        super.print();
        System.out.println("Hello I am Student");
    }

    public int[] getMarks() {
        System.out.println(this.id);
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }


}
