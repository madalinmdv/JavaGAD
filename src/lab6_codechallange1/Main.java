package lab6_codechallange1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        Person p1 = new Person("Person1",20);
        Person p2 = new Person("Person1",15);
        Person p3 = new Person("Person3",21);
        Person p4 = new Person("Person5",25);
        Person p5 = new Person("Person2",22);

        persons.addAll(Arrays.asList(p1,p2,p3,p4,p5));
        System.out.println(persons.toString());

        Collections.sort(persons);
        System.out.println(persons.toString());

        Collections.shuffle(persons);
        System.out.println(persons.toString());
    }
}
