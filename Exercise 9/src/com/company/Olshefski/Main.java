package com.company.Olshefski;


abstract class contacts{
    //Declaring private variable
    private String contactName;

    //Constructor
    public contacts(String contactName) {
        this.contactName = contactName;
    }

    //Abstract method
    abstract public void contactInfo();

    //To String
    @Override
    public String toString() {
        return "contacts{" +
                "contactName='" + contactName + '\'' +
                '}';
    }
}

//Email class extends from contacts
class email extends contacts{
    //Declaring private variable
    private String email;

    //Constructor
    public email(String contactName, String email) {
        super(contactName);
        this.email = email;
    }

    //Getter and setter
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //linking to the abstract method and making a to string
    @Override
    public void contactInfo() {
        System.out.println("Emailing: " + email);
    }
}

//phoneNum class extends contacts
class phoneNum extends contacts{
    //Declaring private variable
    private String number;

    //Constructor
    public phoneNum(String contactName, String number) {
        super(contactName);
        this.number = number;
    }

    //linking to the abstract method and making a to string
    @Override
    public void contactInfo() {
        System.out.println("Calling: " + number);
    }
}

public class Main {

    public static void main(String[] args) {
        //creating and calling contactA
        phoneNum contactA = new phoneNum("Joe","(614) 123-4567");
        contactA.contactInfo();

        System.out.println("-----------------------------");

        //Creating and calling contactB
        email contactB = new email("Tom","Tomthebomb123@gmail.com");
        contactB.contactInfo();
    }
}
