package com.G2.workersservices;

public class UserHelperClass {
    String Number_of_Workers_Needed , DATE , NOTE ;

    public UserHelperClass(String number_of_Workers_Needed, String DATE, String NOTE) {
        Number_of_Workers_Needed = number_of_Workers_Needed;
        this.DATE = DATE;
        this.NOTE = NOTE;
    }

    public UserHelperClass() {

    }

    public String getNumber_of_Workers_Needed() {
        return Number_of_Workers_Needed;
    }

    public void setNumber_of_Workers_Needed(String number_of_Workers_Needed) {
        Number_of_Workers_Needed = number_of_Workers_Needed;
    }

    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    public String getNOTE() {
        return NOTE;
    }

    public void setNOTE(String NOTE) {
        this.NOTE = NOTE;
    }
}
