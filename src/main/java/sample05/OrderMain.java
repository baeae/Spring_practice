package sample05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderMain {
    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("sample05/order_setter.xml");

        sample05.OrderMessageImpl message = application.getBean("message", OrderMessageImpl.class);

        message.getOrderMessage();
    }
}
