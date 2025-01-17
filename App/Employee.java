package App;

class Employee extends Person {

    private final Department department;

    public Employee(Person person, Department department) {
        super(person.getName(), person.getSurname());
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }
}
