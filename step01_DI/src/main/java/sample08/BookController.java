package sample08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    @Qualifier("b1")
    private BookDTO book1;

    @Autowired
    @Qualifier("b2")
    private BookDTO book2;

    @Autowired
    private BookService bookService;

    public BookController () {

    }

    public void invoker() {
        bookService.save(book1, book2);
    }
}
