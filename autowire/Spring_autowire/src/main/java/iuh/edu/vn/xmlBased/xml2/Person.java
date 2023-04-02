package iuh.edu.vn.xmlBased.xml2;

import java.util.List;

public class Person {
    private String id;
    private String fullName;
    private List<Address>addresses;
    private List<String> emails;

    public Person() {

    }

    public Person(String id, String fullName, List<Address> addresses, List<String> emails) {
        this.id = id;
        this.fullName = fullName;
        this.addresses = addresses;
        this.emails = emails;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", fullname='" + fullName + '\'' +
                ", addresses=" + addresses +
                ", emails=" + emails +
                '}';
    }
}
