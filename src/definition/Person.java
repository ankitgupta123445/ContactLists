package definition;

import java.util.Arrays;

public class Person {
    private String firstName;
    private String lastName;
    private String[] contactNo;
    private String emailAddress;

    public Person(String firstName, String lastName, String[] contactNo, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNo = contactNo;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String[] getContactNo() {
        return contactNo;
    }

    public void setContactNo(String[] contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailNo(String emailNo) {
        this.emailAddress = emailAddress;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactNo=" + Arrays.toString(contactNo) +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
