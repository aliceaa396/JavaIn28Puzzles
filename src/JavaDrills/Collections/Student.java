package JavaDrills.Collections;

import java.util.Comparator;
import java.util.Formatter;


public class Student implements Comparable <Student>{
    private int id;
    private String name;

    public Student(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString(){
        return id + " " + name;
    }

    //Comparable method
    @Override
    public int compareTo(Student that) {
        //sort by increasing order of ids
        //if you wanted to reverse the order, put that.id first then this.id
        return Integer.compare(that.id, this.id);
    }
}
