package sample08;

public interface BookDAO {
    void save(EmailSender emailSender, MessageSender messagerSender, BookDTO book1, BookDTO book2);
}
