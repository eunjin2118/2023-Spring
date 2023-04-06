package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

        TestBean1 t1 = ctx.getBean(TestBean1.class);

        System.out.println("t1 : " + t1);
        System.out.println("data1 : " + t1.getData1());
        System.out.println("data2 : " + t1.getData2());

        TestBean2 t2 = ctx.getBean(TestBean2.class);
        System.out.println("data1 : " + t2.getData1());
        System.out.println("data2 : " + t2.getData2());

        ctx.close();
    }
}