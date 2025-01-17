package App;

class Employee extends Person {

    private Department department;
    private Branch branch;

    public Employee(Person person, Department department, Branch branch) {
        super(person.getName(), person.getSurname());
        this.department = department;
        this.branch = branch;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
