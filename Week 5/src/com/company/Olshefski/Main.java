package com.company.Olshefski;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("George", 18);
        Person person2 = new Person("Lilly",16);

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        //-------------NEW CLASS--------------------

        Book book1 = new Book("Goosebumps","R.L. Stine","Thriller",100);
        Book book2 = new Book("Programmin Logic","Joyce Farell","Comp Sci",25);
        System.out.println(book1.toString());
        System.out.println(book2.toString());

        //Grabs specific info from classes
        System.out.println(book2.getAuthor());

        //Dispalys num of books
        System.out.println(Book.numBooks);

        //--------COMBINING CLASSES----------------

        //Found in the persons class
        person1.read(book2);

        // Another example in the Books class
        book2.placeOnShelf(6);
    }
}
