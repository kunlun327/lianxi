package test3;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Person person1 = new Person("aab",25);
        Person person2 = new Person("aab",15);
        Person person3 = new Person("aac",33);
        Person person4 = new Person("aad",33);
        Person person5 = new Person("aaf",25);

        //方法二：让容器自身具备比较性，匿名内部类
        TreeSet<Person> set = new TreeSet<Person>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getName().equals(o2.getName())){
                    return o2.getAge()-o1.getAge();
                }
                else
                return o1.getName().compareTo(o2.getName());
            }
        });
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
