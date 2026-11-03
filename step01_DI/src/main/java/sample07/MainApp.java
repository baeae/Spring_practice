package sample07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
//        BoardDTO dto = new BoardDTO(10, "dd", "33");
//
//        System.out.println(dto);

        ApplicationContext application =
                new ClassPathXmlApplicationContext("sample07/springDI.xml");

        System.out.println("--------------------------------------");
        BoardController con =
                application.getBean("controller", BoardController.class);

        con.test();
        System.out.println("----Builder패턴 사용하기--------------------");
        User user = new User.Builder()
                .name("희정")
                .age(20)
                .address("서울").build();

        System.out.println("user = " + user);

        System.out.println("----Member-----------------------------");
        Member member = new Member.MemberBuilder()
                .age(20)
                .id("jang")
                .build();
        System.out.println(member);
    }

}
