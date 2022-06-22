package SetsandMapsAdvancedLab;

import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentGrades = new TreeMap<>();

        while (n-- > 0) {
            String[] students = scanner.nextLine().split("\\s+");
            String name = students[0];
            Double grade = Double.parseDouble(students[1]);
            studentGrades.putIfAbsent(name, new ArrayList<>());
            studentGrades.get(name).add(grade);
        }
        for (String key : studentGrades.keySet()) {
            double grade = 0.0;
            for (int i = 0; i < studentGrades.get(key).size(); i++) {
                grade += studentGrades.get(key).get(i);
            }
            double avgGrade = grade / studentGrades.get(key).size();
            System.out.printf("%s -> ", key);
            for (int i = 0; i < studentGrades.get(key).size(); i++) {
                System.out.printf("%.2f ", studentGrades.get(key).get(i));
            }
            System.out.printf("(avg: %.2f)%n", avgGrade);
        }
        System.out.println();
    }
}
