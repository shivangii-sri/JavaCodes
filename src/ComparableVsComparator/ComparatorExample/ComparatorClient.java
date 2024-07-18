package ComparableVsComparator.ComparatorExample;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorClient {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Zayn" , 25, 1009));
        list.add(new Student("Shyam" , 27, 510));
        list.add(new Student("Romeo" , 31, 329));

        //this uses compareTo method present in Student entity class
        StudentNameComparator studentNameComparator = new StudentNameComparator();
        Collections.sort(list , studentNameComparator);

        for(Student x : list){
            System.out.println(x.toString());
        }
    }
}
