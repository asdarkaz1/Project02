package com.revature;

public class Profile {

    private String firstName;
    private String lastName;
    private String email;
    private String interest;


    public Profile(){

    }

    public Profile(String firstName, String lastName, String email, String interest) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.interest = interest;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getInterest() {
        return interest;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }
}
