package App;

class Employee extends Person {

    private final Department department;
    private Branch branch;

    public Employee(Person person, Department department, Branch branch) {
        super(person.getName(), person.getSurname());
        this.department = department;
        this.branch = branch;
    }

    public Department getDepartment() {
        return department;
    }

    public Branch getBranch() {
        return branch;
    }
}
