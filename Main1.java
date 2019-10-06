
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("王翔乐", "男", "41709010214", 21, 88));
        students.add(new Student("武小龙", "男", "41709010210", 20, 56));
        students.add(new Student("任伟", "男", "41709010219", 18, 90));
        List<Student> copy;
        System.out.println("按姓名排序");
        copy = new ArrayList<>(students);
        Sort.sort(copy, new NameComparable());
        System.out.println(copy);
        System.out.println("按性别排序");
        copy = new ArrayList<>(students);
        Sort.sort(copy, new SexComparable());
        System.out.println(copy);
        System.out.println("按学号从小到大排名");
        copy = new ArrayList<>(students);
        Sort.sort(copy, new NumberComparable(true));
        System.out.println(copy);
        System.out.println("按学号从大到小排名");
        copy = new ArrayList<>(students);
        Sort.sort(copy, new NumberComparable(false));
        System.out.println(copy);
        System.out.println("按照年龄从小到大排序");
        copy = new ArrayList<>(students);
        Sort.sort(copy, new ageComparable(true));
        System.out.println(copy);
        System.out.println("按照年龄从大到小排序");
        copy = new ArrayList<>(students);
        Sort.sort(copy, new ageComparable(false));
        System.out.println(copy);
        System.out.println("按照成绩从小到大排名");
        copy = new ArrayList<>(students);
        Sort.sort(copy, new GradeComparable(true));
        System.out.println(copy);
        System.out.println("按照成绩从大到小排名");
        copy = new ArrayList<>(students);
        Sort.sort(copy, new GradeComparable(false));
        System.out.println(copy);
    }
    }
