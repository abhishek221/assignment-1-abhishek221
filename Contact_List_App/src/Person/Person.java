package Person;

import java.util.ArrayList;

public class Person
{
    private String FirstName;
    private String LastName;
    private String email;
    private ArrayList<String> phoneNumber = new ArrayList();

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(ArrayList<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<String> getPhoneNumber() {
        return phoneNumber;
    }

    public Person(String firstName, String lastName, String email, ArrayList<String> phoneNumber) {
        FirstName = firstName;
        LastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
