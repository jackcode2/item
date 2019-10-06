import java.util.Comparator;
public class NumberComparable implements  Comparator<Student> {
    boolean asc;

    public NumberComparable(boolean asc) {
        this.asc = asc;
    }

    @Override
    public int compare(Student o1, Student o2) {
     return  o1.number.compareTo(o2.number);
    }
}
