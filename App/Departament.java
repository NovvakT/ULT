package App;

public enum Departament {
    SALES("Sprzedaż"),
    FINANCE("Finanse"),
    ADMINISTRATION("Administracja");

    private final String name;

    private Departament(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
