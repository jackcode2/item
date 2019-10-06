public class Student {
    String name;
    String sex;
    String number;
    int age;
    int grade;
    public Student(String name, String sex, String number, int age,int grade) {
        this.name = name;
        this.sex = sex;
        this.number = number;
        this.age = age;
        this.grade=grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", number='" + number + '\'' +
                ", age=" + age +
                '}';
    }
}
