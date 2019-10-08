package SayHelloExtend;

import SayHelloExtend.person.Bulgarian;
import SayHelloExtend.person.Chinese;
import SayHelloExtend.person.European;
import SayHelloExtend.person.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();


        persons.add(new Bulgarian("Pesho"));
        persons.add(new European("Pesho"));
        persons.add(new Chinese("Pesho"));

        for (Person person : persons) {
            print(person);
        }
    }

    private static void print(Person person) {
        System.out.println(person.sayHello());
    }
}

