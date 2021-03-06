package com.company.Olshefski;

//Creating first class
class contactInfo{
    //adding name and email as variables
    String name;
    String email;

    //Default Constructor
    public contactInfo(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //Blank constructor for preventing errors if nothing is added
    public contactInfo(){
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //To String (Custom)

    public void display(){
        System.out.println("Name: " +name + "\nEmail: " +email);
    }

}

//Creating the extenstion to contact info with 1 new variable
class businessInfo extends contactInfo{
    //The reason I made phoneNum a string is just to make it easier for typing in a
    //phone number set up traditionally such as "xxx-xxx-xxxx" if the number is set to int
    //the "-" in the number would count as subtraction.
    private String phoneNum;

    //Constructor
    public businessInfo(String name, String email, String phoneNum) {
        super(name, email);
        this.phoneNum = phoneNum;
    }

    //Getter and Setter
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    //To String
    @Override
    public void display(){
        super.display();
        System.out.println("Phone number: " +phoneNum);
    }
}

public class Main {
    public static void main(String[] args) {

        //----------PART-1----------
        // Adding info from contactInfo class
        contactInfo user1 =  new contactInfo("Joe","joe123@gmail.com");
        contactInfo user2 = new contactInfo("Jeff","Jeff321@gmail.com");

        //Displaying added info above into terminal
        user1.display();
        System.out.println("------------------------------------------------------");
        user2.display();
        System.out.println("------------------------------------------------------");

        //----------PART-2----------
        //Adding parts of a class from main to test for errors
        //Making a class with nothing in it
        contactInfo userTest = new contactInfo();

        //Adding via another line
        userTest.setEmail("test@email.com");

        //Displaying info above into terminal
        userTest.display();
        System.out.println("------------------------------------------------------");

        //----------PART-3----------
        //Adding info from contactInfo and businessInfo
        businessInfo user3 = new businessInfo("Bob","Bobby@business.com","1-800-999-7325");

        //Displaying info above into terminal
        user3.display();
        System.out.println("------------------------------------------------------");

    }

}

