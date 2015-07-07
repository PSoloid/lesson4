package inheritance;

/**
 * Created by ITHILLEL7 on 07.07.2015.
 */
public class Person {
    protected int id;
    private String surname;

    public Person(int id, String surname) {
        this.id = id;
        this.surname = surname;
        System.out.println("const1");
    }
    public Person(int id) {
        this.id = id;
        this.surname = "Ivanov";
        System.out.println("const2");
    }
    public Person() {
        this(100);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {

        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void print(){
        System.out.println("Hello I am Person");
    }

}
