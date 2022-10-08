package com.softwareengineering.BookstoreDB.Entities;

import lombok.*; // lombok is a library that automatically generates getters, setters, constructors, etc.
import javax.persistence.Entity;  // JPA is a standard for object-relational mapping
import javax.persistence.Id;

@Entity // This tells JPA that this class is an entity that should be mapped to a database table
@Builder // This tells lombok to generate a builder for this class (see https://projectlombok.org/features/Builder)
public class Books {
    @Id
    private int bookID;
    private int authorID;
    private int publisherID;
    private String title;
    private String ISBN;
    private String genre;
    private String description;
    private int publicationYear;
    private String bookCondition;
    private double price;

    //constructor
    public Books() {
    }

    public Books(int bookID,
                 int authorID,
                 int publisherID,
                 String title,
                 String ISBN,
                 String genre,
                 String description,
                 int publicationYear,
                 String bookCondition,
                 double price) {
        this.bookID = bookID;
        this.authorID = authorID;
        this.publisherID = publisherID;
        this.title = title;
        this.ISBN = ISBN;
        this.genre = genre;
        this.description = description;
        this.publicationYear = publicationYear;
        this.bookCondition = bookCondition;
        this.price = price;
    }

    public Books(int authorID,
                 int publisherID,
                 String title,
                 String ISBN,
                 String genre,
                 String description,
                 int publicationYear,
                 String bookCondition,
                 double price) {
        this.authorID = authorID;
        this.publisherID = publisherID;
        this.title = title;
        this.ISBN = ISBN;
        this.genre = genre;
        this.description = description;
        this.publicationYear = publicationYear;
        this.bookCondition = bookCondition;
        this.price = price;
    }

    //getters and setters
    public int getBookID() {
        return bookID;
    }
    public void setBookID(int bookID) {
        this.bookID = bookID;
    }
    public int getAuthorID() {
        return authorID;
    }
    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }
    public int getPublisherID() {
        return publisherID;
    }
    public void setPublisherID(int publisherID) {
        this.publisherID = publisherID;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public String getBookCondition() {
        return bookCondition;
    }
    public void setBookCondition(String condition) {
        this.bookCondition = condition;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    //toString method
    @Override
    public String toString() {
        return "Books{" +
                "bookID=" + bookID +
                ", authorID=" + authorID +
                ", publisherID=" + publisherID +
                ", title='" + title + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", genre='" + genre + '\'' +
                ", description='" + description + '\'' +
                ", publicationYear=" + publicationYear +
                ", condition='" + bookCondition + '\'' +
                ", price=" + price +
                '}';
    }

    /*
    //main to test Book class
    public static void main(String[] args) {
        Books book1 = new Books(1, 1, "The Hobbit", "9780547928227", "Fantasy", "A hobbit goes on an adventure", 1937, "Good", 10.00);
        System.out.println(book1);
    }*/
}
