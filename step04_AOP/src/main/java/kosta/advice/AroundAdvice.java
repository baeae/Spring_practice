package kosta.advice;


import org.aspectj.lang.ProceedingJoinPoint;

/**
* 사전 / 사후 공통(부가)기능 담당
* */
public class AroundAdvice {

    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("AroundAdvice 사전 처리중입니다. \n");

        Object obj = joinPoint.proceed();

        System.out.println("AroundAdvice 사후 처리중입니다. \n");

        return obj;
    }
}
