package App;

import java.util.List;

public class Company {
    private final String name;
    private List<Employee> employees;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    List<Employee> getEmployees() {
        return employees;
    }

    void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(String name, String surname) {
        Person person = new Person(name, surname);
        Employee employee = new Employee(person, null);
        employees.add(employee);
        Utils.printAnswer(name + " " + surname + " has been added.");
    }

    public void printEmployees() {
        System.out.println();
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(i + " - " + employees.get(i));
        }
    }

    private boolean invalidIndex(int index) {
        if (index < 0 || index >= employees.size()) {
            Utils.printAnswer("There is no Employee with this id");
            return true;
        }
        return false;
    }

    public void removeEmployee(int index) {
        if (invalidIndex(index)) return;

        Employee employee = employees.get(index);
        employees.remove(index);
        Utils.printAnswer("%s %s has been successfully fired.".formatted(employee.getName(), employee.getSurname()));
    }

    public void editEmployee(int index) {
        if (invalidIndex(index)) return;

        Employee employee = employees.get(index);

        System.out.println("You're editing data of: " + employee.getName() + " " + employee.getSurname());

        String oldName = employee.getName();
        String oldSurname = employee.getSurname();

        employee.setName(Utils.inputString("Provide a new name: "));
        employee.setSurname(Utils.inputString(" Provide a new surname: "));

        Utils.printAnswer("Employee's data has been changed: %s %s to %s %s".formatted(oldName, oldSurname, employee.getName(), employee.getSurname()));
    }
}
