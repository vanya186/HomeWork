import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class HomeWork5 {

    public static void main(String[] args) {

        Employee employee1 = new Employee(
                "Morozov Ivan",
                "QA Engineer",
                "im@mail.ru",
                5153528,
                100000,
                34
        );

        Employee[] employees = new Employee[5];
        employees[0] = new Employee(
                "Ivanov Ivan",
                "Middle Engineer",
                "ivivan@mail.ru",
                8923123,
                50000,
                41
        );
        employees[1] = new Employee(
                "Petrov Petr",
                "Creator",
                "petrov@mail.ru",
                8945662,
                50000,
                32
        );
        employees[2] = new Employee(
                "Sidorova Anna",
                "Water pot",
                "sidorov@mail.ru",
                5948461,
                10000,
                43
        );
        employees[3] = new Employee(
                "Morozova Nadegda",
                "Junior Engineer",
                "morozova@mail.ru",
                5689458,
                5000,
                18
        );
        employees[4] = new Employee(
                "Morozov Ivan",
                "QA Engineer",
                "morozov@mail.ru",
                5153528,
                3000,
                21
        );
            for (Employee employee : employees) {
                if (employee.getAge() > 40) {
                    System.out.println(employees);
                }
            }
    }
}
