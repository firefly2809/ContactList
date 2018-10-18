package db.entities;

import java.util.Date;

public class Contact {
    private String name;
    private String phoneNumber;
    private Date birthDay;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\n" +
                "Phone number: %s\n" +
                "Birthday: %s\n" +
                "Address: %s", name, phoneNumber, birthDay, address);
    }
}
