package com.company.Olshefski;


import java.util.Objects;

class Contact {
        public String name;
        public String email;

        Contact(String name, String email){
            this.name = name;
            this.email = email;
        }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Contact)){
            return false;
        }
        Contact other = (Contact) obj;
        return this.name.equals(other.name) && this.email.equals(other.email);
    }

}


    public class Main {
        public static void main(String[] args) {
            Contact bob = new Contact("bob", "bob@bob.com");
            Contact bob2 = new Contact("bob", "bob@bob.com");

            System.out.println("Reference equality: " + (bob == bob2));
            System.out.println("Equals method: " + bob.equals(bob2));

            System.out.println(bob.getClass());
        }
    }

