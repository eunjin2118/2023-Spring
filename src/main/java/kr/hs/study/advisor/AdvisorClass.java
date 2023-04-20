package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
    public void beforeMethod(){
        System.out.println("beforeMehod advice");
    }

    public void afterMethod(){
        System.out.println("afterMethod advice");
    }

    public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("aroundMethod 앞");
        pjp.proceed(); // 원래 실행해햐 할 매서드 호출(point-cut으로 지정한 예)
        System.out.println("aroundMethod 뒤");
    }

    public void afterReturningMethod(){
        System.out.println("afterReturningMethod advice");
    }

    public void afterThrowingMethod(){
        System.out.println("afterThrowingMethod advice");
    }
}
