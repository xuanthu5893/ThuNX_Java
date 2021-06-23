import java.time.LocalDate;

public class Persion {
    String firstname;
    String lastName;
    LocalDate birthday;

    public Persion() {
    }

    public Persion(String firstname, String lastName, LocalDate birthday) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
