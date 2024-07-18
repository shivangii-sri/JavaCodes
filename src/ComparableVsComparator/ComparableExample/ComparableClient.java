package ComparableVsComparator.ComparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableClient {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Ram" , 25, 401));
        list.add(new Student("Shyam" , 27, 510));
        list.add(new Student("Romeo" , 31, 329));

        //this uses compareTo method present in Student entity class
        Collections.sort(list);

        for(Student x : list){
            System.out.println(x.toString());
        }

    }
}
