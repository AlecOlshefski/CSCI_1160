package com.company.Olshefski;

import java.util.*;

class CollectInfoInter implements Iterable<contactInfo>{
    List<contactInfo> contacts = new ArrayList<>();

    public CollectInfoInter(ArrayList<contactInfo> contactInfo){
        this.contacts = contacts;
    }

    @Override
    public Iterator<contactInfo> iterator() {
        return this.contacts.iterator();
        //return null;
    }


}




public class Main {

    public static void main(String[] args) {

        contactInfo user1 = new contactInfo("UserName1","User1@gmail.com");
        contactInfo user2 = new contactInfo("UserName2","User2@gmail.com");

        for (contactInfo contact : CollectInfoInter){
            contact.display();
        }

    }
}
