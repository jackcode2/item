import java.util.Comparator;
public class SexComparable implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.sex.compareTo(o2.sex);
    }
}
