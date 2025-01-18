package App;

import java.util.List;

public class Main {
    public static void  main(String[] args) {

        Company company = Utils.initData();
        Utils.printBanner(company.getName() + "'s administration panel");

        boolean done = false;

        while (!done) {
            Utils.printTable(List.of(
                    "Show Employees",
                    "Add Employees",
                    "Remove Employees",
                    "Edit Employees",
                    "View Employees by Department",
                    "View Employees by Branch",
                    "End program"));
            int choice = Utils.inputInt("Enter operation's number: ");

            switch (choice) {
                case 1:
                    company.printEmployees();
                    Utils.printSeparator();
                    break;
                case 2:
                    company.addEmployee(
                            Utils.inputString("Enter name: "),
                            Utils.inputString("Enter surname: "));
                            Utils.printSeparator();
                    break;
                case 3:
                    company.printEmployees();
                    company.removeEmployee(Utils.inputInt("Provide employee's id: "));
                    Utils.printSeparator();
                    break;
                case 4:
                    company.printEmployees();
                    company.editEmployee(Utils.inputInt("Provide employee's id: "));
                    Utils.printSeparator();
                    break;
                case 5:
                    Department.printDepartments();
                    Department.chooseDepartment();
                    Utils.printSeparator();
                    break;
                case 6:
                    Branch.printBranch();
                    Branch.chooseBranch();
                    Utils.printSeparator();
                    break;
                case 7:
                    System.out.println();
                    System.out.println("Good bye");
                    System.out.println();
                    done = true;
                    break;
                default:
                    System.out.println();
                    System.out.println("Wrong input, try again");
                    Utils.printSeparator();
            }
        }
    }
}


