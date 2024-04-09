import java.util.Comparator;

public class Person implements Comparable {

    // Attributes
    private String firstName;
    private String lastName;
    private int age;
    private double height;

    // Comparators
    public static Comparator<Person> LAST_NAME_COMPARATOR = Comparator.comparing(Person::getLastName);

    // Constructor
    public Person(String firstName, String lastName, int age, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    // Object method
    @Override
    public String toString() {
        return "Fornavn: " + getFirstName() + ", Efternavn: " + getLastName() + ", Alder: " + getAge() + ", Højde: " + getHeight();
    }

    // Comparable method
    @Override
    public int compareTo(Object o) {
        Person that = (Person) o;
        return Integer.compare(this.age, that.age);
    }
}