package com.G2.workersservices;

public class UserHelperClass2 {


    String Name , Phone , Address ;

    public UserHelperClass2(String name, String phone, String address) {
        Name = name;
        Phone = phone;
        Address = address;
    }

    public UserHelperClass2() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

}
