package kosta.view;

import kosta.service.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("aplicationContext.xml");

        System.out.println("--메소드 호출해보자--");

        System.out.println("-----------------------------");
        MemberService service =
                application.getBean("target", MemberService.class);

        service.memberInsert("안녕");

        System.out.println("====================");
        int re = service.memberDelete(10);
        System.out.println("re = " + re);

        System.out.println("====================");
        service.memberUpdate();

        System.out.println("==================");
        String result = service.select("name", "희정");
        System.out.println("result = " + result);





    }
}
