package kosta.view;

import kosta.service.GoodsService;
import kosta.service.MemberService;
import kosta.service.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("aplicationContext.xml");

        System.out.println("--메소드 호출해보자--");
        System.out.println("-----------------------------");

        //JDK Dynamic Proxy -> 인터페이스 기반 기본값
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

        System.out.println("=======GoodsService 호출,,,,,,,,,");

        //interface가 없기때문에 AOP proxy객체가 CGLIB방식으로 생성된다.
        GoodsService goodsService =
                application.getBean("target2", GoodsService.class);

        goodsService.insert();
        System.out.println("==================");
        goodsService.goodsSelect(100);





    }
}
