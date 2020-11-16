package academy.belhard;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("A1","B1", new Address("G1", "H1", 4));
        Person person2 = new Person("A2","B2", new Address("G2", "H2", 9));
        Person person3 = new Person("A3","B3", new Address("G3", "H3", 3));
        Person person4 = new Person(null,"B4", new Address("G4", "H4", 4));
        Person person5 = new Person("A5",null, new Address("G5", "H5", 5));
        Person person6 = new Person("A6","B6", null);

        List<Person> list= new ArrayList<>();

        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        list.add(person6);

        List<String> res= list
                .stream()
                .filter(x -> x.getFirstName() != null && x.getLastName() != null && x.getAddress() != null)
                .sorted(Comparator.comparingInt(o -> o.address.getNumber()))
                .map(Person::toString)
                .collect(Collectors.toList());

        for (String persons: res)
       System.out.println(persons);

    }
}
