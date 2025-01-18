package App;

public enum Branch {
    POLAND("Poland"),
    FRANCE("France"),
    UK("UK");

    private final String name;

    Branch(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    public static void printBranch() {
        System.out.println();
        for (int i = 0; i < Branch.values().length; i++) {
            System.out.println(i + " - " + Branch.values()[i].getName());
        }
        System.out.println();
    }

    public static void chooseBranch() {
        Company company = Utils.initData();
        Branch branch = Branch.values()[Utils.inputInt("Enter Branch's id: ")];
        System.out.println("Branch's Employees in " + branch.getName() + ":");
        for (int i = 0; i < company.getEmployees().size(); i++) {
            if (company.getEmployees().get(i).getBranch() == branch) {
                System.out.println(i + " - " + company.getEmployees().get(i));
            }
        }
    }
}
