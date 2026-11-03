package sample06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;

public class EmpController {

    /**
     * @Autowired는 byType 찾고
     * 같은 객체가 여러개이면
     * byName 기준이 된다.
     * 즉, id와 property 일치하는 객체를 찾는다.
     */


    @Autowired //byType으로 EmpDTO타입을 찾아서 주입
    private EmpDTO empDto;

    @Autowired
    @Qualifier("dto") // 동일 타입의 Bean이 여러 개 있을 경우 어떤 Bean을 주입할지 이름으로 지정
    private EmpDTO empDto2;

    @Autowired // 기본 byType으로 주입
    private EmpService empService;

    //객체가 생성된 후에 주입이된다. 그래서 아래 필드는 null이다.
    public EmpController () {
        System.out.println("EmpController 기본생성자 호출됨");

        System.out.println("empDto = " + empDto);
        System.out.println("empDto2 = " + empDto2);
        System.out.println("empService = " + empService);
    }

    /*
    *  주입된 객체가 생성된 후에 어떤 일을 하고싶다.
    *   :즉 현재객체의 생성과 주입이 완료된 후에 해야 핧일 있을 경우
    *       @PostConstruct 사용
    *       위의 annotation을 사용하기 위해서는 별도의 라이브러리 추가
    *       <dependency>
		    <groupId>javax.annotation</groupId>
		    <artifactId>javax.annotation-api</artifactId>
		    <version>1.3.2</version>
		</dependency>
    * */
    @PostConstruct
    public void aa () {
        System.out.println("--------------------------------");
        System.out.println("EmpController의 aa call");
        System.out.println("empDto = " + empDto);
        System.out.println("empDto2 = " + empDto2);
        System.out.println("empService = " + empService);
    }

    public void test () {
        System.out.println("EmpController test call");

        empService.test(empDto);
    }

}
