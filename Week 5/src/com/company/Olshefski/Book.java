package com.company.Olshefski;

public class Book {
    private String title;
    private String author;
    private String genere;
    private int totalPages;

    //Checks for Num of books
    static int numBooks = 0;

    //Constructor
    public Book(String title, String author, String genere, int totalPages) {
        this.title = title;
        this.author = author;
        this.genere = genere;
        this.totalPages = totalPages;

        //Adds one to numBooks
        numBooks++;
    }

    //Getter and Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    //To String
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genere='" + genere + '\'' +
                ", totalPages=" + totalPages +
                '}';
    }

    void placeOnShelf(int a){
        System.out.println("I am placing a book titled" +this.getTitle() + " on the shelf in this loactaion " + a );
    }
}
