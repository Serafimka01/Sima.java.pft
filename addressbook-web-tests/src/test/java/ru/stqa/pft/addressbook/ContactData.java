package ru.stqa.pft.addressbook;

public class ContactData {
    private final String firstname;
    private final String middlename;
    private final String home;
    private final String mobile;

    public ContactData(String firstname, String middlename, String home, String mobile) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.home = home;
        this.mobile = mobile;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getHome() {
        return home;
    }

    public String getMobile() {
        return mobile;
    }
}
