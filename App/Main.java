package App;

import java.util.List;

public class Main {
    public static void  main(String[] args) {

        Company company = Utils.initData();
        Utils.printBanner("Company's administration panel " + company.getName());

        boolean done = false;

        while (!done) {
            Utils.printTable(List.of("Show Employees", "Add Employees", "Remove Employees", "Edit Employees", "View Employees by Department", "End program"));
            int choice = Utils.inputInt("Enter operation's number: ");

            switch (choice) {
                case 1:
                    company.printEmployees();
                    break;
                case 2:
                    company.addEmployee(
                            Utils.inputString("Enter name: "),
                            Utils.inputString("Enter surname: ")
                    );
                    break;
                case 3:
                    company.printEmployees();
                    company.removeEmployee(Utils.inputInt("Provide employee's id: "));
                    break;
                case 4:
                    company.printEmployees();
                    company.editEmployee(Utils.inputInt("Provide employee's id: "));
                    break;
                case 5:
                    Department.printDepartments();
                    Department.chooseDepartment();
                    System.out.println();
                    break;
                case 6:
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


