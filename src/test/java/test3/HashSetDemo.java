package test3;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        Person person1 = new Person("张三",25);
        Person person2 = new Person("李四",15);
        Person person3 = new Person("王五",33);
        Person person4 = new Person("王五",33);
        Person person5 = new Person("张三",25);
        HashSet<Person> set = new HashSet<Person>();
        set.add(person1);
        set.add(person2);
        set.add(person3);
        set.add(person4);
        set.add(person5);
        for (Person person : set) {

            System.out.println(person);

        }
    }
}
