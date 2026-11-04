package sample08;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class BookDAOImpl implements BookDAO {

    //@Autowired (final 붙이고 @RequiredArgsConstructor 사용하면 @Autowired 안써도됨
    private final DbUtil dbUtil;


    private final List<BookDTO> list;

//    public BookDAOImpl(DbUtil dbUtil) { // final 붙혔을때 초기화 필수이나 이렇게 생성자 생성 대신 @RequiredArgsConstructor 사용
//        this.dbUtil = dbUtil;
//    }

    @PostConstruct
    public void test() {
        System.out.println("dbUtil = " + dbUtil);
        System.out.println("list = " + list);
    }


    @Override
    public void save(EmailSender emailSender, MessageSender messagerSender, BookDTO book1, BookDTO book2) {
        System.out.println("emailSender = " + emailSender);
        System.out.println("messageSender = " + messagerSender);
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
        System.out.println("dbUtil = " + dbUtil);
    }
}
