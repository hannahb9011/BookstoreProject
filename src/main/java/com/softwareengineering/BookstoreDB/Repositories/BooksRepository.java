package com.softwareengineering.BookstoreDB.Repositories;

// create java documentation for this class (see https://www.jetbrains.com/help/idea/working-with-code-documentation.html)


import com.softwareengineering.BookstoreDB.Entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // This tells Spring that this class is a repository
public interface BooksRepository extends JpaRepository<Books, Integer> {
    /** This class is a repository for the books' table in the database.
     *  It contains methods that allow us to query the database for books.
     *  It is an interface, so we don't need to implement the methods.
     *  The methods in this class are named after the corresponding SQL queries.
     */


}
