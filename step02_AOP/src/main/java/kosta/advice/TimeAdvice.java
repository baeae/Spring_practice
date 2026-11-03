package kosta.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

/*
* 공통기능(부가기능)
*  : 사전, 사후처리 - around방식
* */
public class TimeAdvice {

    /*
    * 기능
    *  : 사전 - 현재시간을 구한다.
    *
    *  : 사후 - 현재시간을 구해서 사전과의 차이를 알아낸다.
    * */
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        //사전처리

        String methodName = joinPoint.getSignature().getName();
        System.out.println("[LOG] " + methodName + " 호출되기 전 입니다.");

        Object params [] = joinPoint.getArgs();
        for (Object obj : params) {
            System.out.println(obj);
        }

        StopWatch sw = new StopWatch();
        sw.start();

        Object obj = joinPoint.proceed(); //다음 advice or 타겟대상을 호출한다. (obj : 각 타겟대상 리턴값)


        //사후처리
        sw.stop();
        System.out.println("[LOG] " + methodName + " 호출된 후 입니다.");
        System.out.println("[LOG] " + methodName + " 총 실행시간(ms)" + sw.getTotalTimeMillis());
        System.out.println("[LOG] " + methodName + " 의 리턴값 = " + obj);

        return obj;
    }

}
