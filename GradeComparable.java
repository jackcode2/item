import java.util.Comparator;
public class GradeComparable implements Comparator<Student>{
    boolean asc;

    public GradeComparable(boolean asc) {
        this.asc = asc;
    }

    @Override
    public int compare(Student o1, Student o2) {
        if(asc)
        {
            return o1.grade-o2.grade;
        }
        else{
            return o2.grade-o1.grade;
        }
    }
}
