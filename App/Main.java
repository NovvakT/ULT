package App;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void  main(String[] args) {

        Person firstPerson = new Person("Jayce", "Heimerdinger");
        Person secondPerson = new Person("Vi", "Vander");
        Person thirdPerson = new Person("Jinx", "Silco");

        Employee firstEmployee = new Employee(firstPerson, Departament.SALES);
        Employee secondEmployee = new Employee(secondPerson, Departament.FINANCE);
        Employee thirdEmployee = new Employee(thirdPerson, Departament.ADMINISTRATION);

        List<Employee> employees = new ArrayList<>();

        employees.add(firstEmployee);
        employees.add(secondEmployee);
        employees.add(thirdEmployee);

        Company company = new Company("Med-Pack");
        company.setEmployees(employees);

        Utils.printBanner("Company's administration panel " + company.getName());

        boolean done = false;

        while (!done) {
            Utils.printTable(List.of("Show Employees", "Add Employees", "End program"), "What would you like to do");
            int choice = Utils.inputInt("Enter operation's number: ");

            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println(company.getEmployees());
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    String name = Utils.inputString("Enter name: ");
                    String surname = Utils.inputString("Enter surname: ");
                    company.getEmployees().add(new Employee(new Person(name, surname), null));
                    System.out.println("New Employee has been added");
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Good bye");
                    System.out.println();
                    done = true;
                    break;
                default:
                    System.out.println();
                    System.out.println("Wrong input, try again");
                    System.out.println();
            }
        }
    }
}


