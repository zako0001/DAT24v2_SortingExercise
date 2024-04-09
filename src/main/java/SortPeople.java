import java.util.Arrays;

public class SortPeople {
    public static void main(String[] args) {
        Person[] people = {
                // Tilføj flere personer, som deler nogle af de samme egenskaber f.eks. samme fornavn, men hvor deres andre egenskaber er unikke.
                new Person("Hans", "Filipson", 30, 1.70),
                new Person("Merete", "Poulsen", 12, 1.22),
                new Person("Ibsen", "Poulsen", 55, 1.20),
                new Person("Sixten", "Ottesen", 15, 1.90)
        };

        System.out.println("Usorteret liste af personer:");
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println();

        Arrays.stream(people)
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        Arrays.stream(people)
                .sorted(Person.LAST_NAME_COMPARATOR)
                .forEach(System.out::println);
    }
}