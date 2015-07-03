package OOP1;

/**
 * Created by ITHILLEL7 on 30.06.2015.
 */
public class Student {
    int id;
    public String surname =null;
    public int[] marks;

    public Student(){
        id=0;
        surname = "N/A";
        marks = new int[34];
    }
    public Student(int i, String s, int[] m){
        id=i;
        surname = s;
        marks = m;
    }
    public Student(int id, String surname){
        this.id = id;
        this.surname = surname;
        marks = new int[34];
    }

    public Student (Student st){
        this.id = st.id;
        surname = new String(st.surname);
        marks = new int[st.marks.length];
        for(int i=0; i<marks.length; i++){
            marks[i] = st.marks[i];
        }
    }
}
