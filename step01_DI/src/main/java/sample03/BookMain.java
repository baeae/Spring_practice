package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookMain {
    public static void main(String[] args) {

        ApplicationContext application = new ClassPathXmlApplicationContext("sample03/book_Constructor.xml");
        BookController con = application.getBean("controller", BookController.class);
        con.bookInsert();

    }
}
