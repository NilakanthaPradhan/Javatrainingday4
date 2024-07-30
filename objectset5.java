import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class objectset5{
    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();

        // Create Person objects
        Person alice = new Person("Alice", 30);
        Person bob = new Person("Bob", 25);

        // Add Person objects to the set
        addPerson(personSet, alice);
        addPerson(personSet, bob);

        // Check if a Person object is in the set
        System.out.println("Is Alice in the set? " + checkPerson(personSet, new Person("Alice", 30)));
        System.out.println("Is Bob in the set? " + checkPerson(personSet, new Person("Bob", 25)));
        System.out.println("Is Charlie in the set? " + checkPerson(personSet, new Person("Charlie", 35)));
    }

    public static void addPerson(Set<Person> set, Person person) {
        if (set.add(person)) {
            System.out.println(person + " added to the set.");
        } else {
            System.out.println(person + " is already in the set.");
        }
    }

    public static boolean checkPerson(Set<Person> set, Person person) {
        return set.contains(person);
    }
}
