package App;

public class Main {
    public static void  main(String[] args) {

        address a1 = new address("Toruńska", "Toruń");
        Person p1 = new Person ("Jan", "Testowy", 37);
        Person p2 = new Person ("Zbych", "Sprawdzacz", 27);
        p1.setAddress("Ulica", "Miasto");

        System.out.println(p1.toString());
    }
}

class Person {
    private String name;
    private String surname;
    private int age;
    private String address;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (this.age > 18) {
            System.out.println("Zmieniono nazwisko z " + this.surname + " na" + surname);
            this.surname = surname;
        } else {
            System.out.println("Osoba niepełnoletnia nie może zmienić nazwiska ;(");
        }
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String street, String city) {
    }
}

class address {
    private String street;
    private String city;

    public address(String street, String city) {
        this.street = street;
        this.city = city;
    }
}


