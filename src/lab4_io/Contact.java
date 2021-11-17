package lab4_io;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Phone number of " + name + " is "+ phoneNumber;
    }

    public String getName() {
        return name;
    }
}
