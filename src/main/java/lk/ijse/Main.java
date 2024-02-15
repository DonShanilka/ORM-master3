
package lk.ijse;

import lk.ijse.Config.FactoryConfiguration;
import lk.ijse.Entity.Author;
import lk.ijse.Entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Author author = new Author();
        author.setId(1);
        author.setName("Jack");

        Book book = new Book();
        book.setId(1);
        book.setTitle("Jack's Life");
        book.setPublicationYear("2024");
        book.setPrice(2000.00);
        book.setAuthor(author);

        session.save(author);
        session.save(book);


    }
}
