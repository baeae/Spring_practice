package kosta.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;



@Component //생성
@Aspect
@Order(1)
public class SampleAdvice {
    /**
     * 사전처리
     * 리턴타입 필요없음
     * */
    @Before("PointCutDefinition.aa()")
    public void before (JoinPoint joinPoint) {
        String method = joinPoint.getSignature().getName();
        Object params [] = joinPoint.getArgs();
        for (Object o : params) {
            System.out.println(o);
        }
        System.out.println("SampleAdvice의 before 입니다...... method이름 = " + method + "\n");
    }

    /**
     * 사후처리(정상동작)
     * 리턴 없음
     * */
    @AfterReturning(pointcut ="PointCutDefinition.aa()" , returning = "returnObj")
    public void afaterReturing (JoinPoint joinPoint, Object returnObj) {
        System.out.println(joinPoint.getSignature().getName() + "의 리턴값 = " + returnObj);
        System.out.println("타겟대상 메소드가 정상적으로 실행 되었을 때 사후처리 입니다. \n");
    }

    /**
     * 사후처리(예외발생했을때)
     * */
    @AfterThrowing(pointcut = "PointCutDefinition.aa()", throwing = "e")
    public void afterThrowing(Throwable e) {
        System.out.println("타겟대상 메소드가 예외발생했을 때 사후처리 입니다. \n");
        System.out.println("예외정보 : " + e + "\n");
    }

    /**
     * 사후처리(정상 이든 예외가 발생하든 무조건.)
     * */
    @After("PointCutDefinition.aa()")
    public void afterFinally () {
        System.out.println("예외발생 여부 상관없이 무조건 실행됩니다. \n");
    }
}
