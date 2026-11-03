package sample05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderMain {
    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("sample05/order_setter.xml");

        OrderMessage message = application.getBean("message", OrderMessage.class);

        message.getOrderMessage();
    }
}
