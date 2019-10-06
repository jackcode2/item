import java.util.Comparator;
public class ageComparable implements Comparator<Student>{
    Boolean asc;

    public ageComparable(Boolean asc) {
        this.asc = asc;
    }

    @Override
    public int compare(Student o1, Student o2) {
        if(asc)
        {
            return o1.age-o2.age;
        }
        else{
            return o2.age-o1.age;
        }
    }
}
