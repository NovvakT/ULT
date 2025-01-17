package App;

public enum Department {
    SALES("Sales"),
    FINANCE("Finance"),
    ADMINISTRATION("Administration");

    private final String name;

    Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void printDepartments() {
        System.out.println();
        for (int i = 0; i < Department.values().length; i++) {
            System.out.println(i + " - " + Department.values()[i].getName());
        }
        System.out.println();
    }

    public static void chooseDepartment() {
        Company company = Utils.initData();
        Department department = Department.values()[Utils.inputInt("Enter department's id: ")];
        System.out.println("Department's Employees " + department.getName() + ":");
        for (int i = 0; i < company.getEmployees().size(); i++) {
            if (company.getEmployees().get(i).getDepartment() == department) {
                System.out.println(i + " - " + company.getEmployees().get(i));
            }
        }
    }
}
