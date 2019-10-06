import java.util.Comparator;
import java.util.List;
public class Sort {
    public static void sort(List<Student> students, Comparator<Student> comparator) {
        for (int i = 1; i < students.size(); i++) {
            Student student = students.get(i);
            int j = i - 1;
            for (; j >= 0 && comparator.compare(students.get(j), student) > 0; j--) {
               students.set(j + 1, students.get(j));
            }
            students.set(j + 1, student);
        }
    }
}