package App;

public enum Branch {
    POLAND("Poland"),
    GERMANY("Germany"),
    FRANCE("France"),
    UK("UK");

    private final String name;

    Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void printBranches() {
        System.out.println();
        for (int i = 0; i < Branch.values().length; i++) {
            System.out.println(i + " - " + Branch.values()[i].getName());
        }
    }

}
