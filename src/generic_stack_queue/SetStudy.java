package generic_stack_queue;

import java.util.HashSet;
import java.util.Set;

public class SetStudy {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>(16,0.75f);

        set.add(new Student(1,"Tu",10.0));
        set.add(new Student(2,"Tu",10.0));
        set.add(new Student(3,"Tu",9.5));
        set.add(new Student(4,"Tu",5.5));
        set.add(new Student(5,"Tu",7.0));

        System.out.println(set.size());
    }
}
