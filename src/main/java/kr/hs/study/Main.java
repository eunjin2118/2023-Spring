package kr.hs.study;

import kr.hs.study.beans.Member;
import kr.hs.study.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(BeanConfig.class);

        Member m1 = cxt.getBean(Member.class);
        System.out.println(m1.getP1().getName());
        System.out.println(m1.getP1().getAge());
        System.out.println(m1.getP1().getNickname());

        System.out.println(m1.getP2().getName());
        System.out.println(m1.getP2().getAge());
        System.out.println(m1.getP2().getNickname());

        cxt.close();
    }
}