package DefiningClassesExe.OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int personCount = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();
        while (personCount-- > 0) {
            String[] personInfo = scanner.nextLine().split("\\s+");
            String name = personInfo[0];
            int age = Integer.parseInt(personInfo[1]);
            Person person = new Person(name, age);
            people.add(person);
        }
        people.stream()
                .filter(person -> person.getAge() > 30)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);
    }
}
