package com.revature.ProfileModel;

public class User {

    public String firstname;
    public String lastname;
    public String username;
    public String passWord;
    public String email;
    public String interest;


    public User(){

   }
    public User(String fname, String lname, String ename, String uname, String pword, String iname) {
        this.firstname = fname;
        this.lastname = lname;
        this.username =  uname;
        this.passWord = pword;
        this.email = ename;
        this.interest = iname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getEmail() {
        return email;
    }

    public String getInterest() {
        return interest;
    }



}
