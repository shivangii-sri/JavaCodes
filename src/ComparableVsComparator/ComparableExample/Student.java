package ComparableVsComparator.ComparableExample;

public class Student implements Comparable<Student>{

    private String name;
    private int age;
    private int roll;

    public Student(String name, int age, int roll) {
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    //sorting by roll no.
    @Override
    public int compareTo(Student o) {
        return this.roll - o.roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", roll=" + roll +
                '}';
    }
}
