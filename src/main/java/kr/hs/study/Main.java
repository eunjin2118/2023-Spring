package kr.hs.study;

import kr.hs.study.beans.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Sequence s = ctx.getBean("s", Sequence.class);
        s.print();

        Calculate c = ctx.getBean("c", Calculate.class);
        System.out.println("합계 : " + c.sum() + " 평균 : " + c.avg());

        Comparison cp = ctx.getBean("cp", Comparison.class);
        cp.compare();

        Even e = ctx.getBean("e", Even.class);
        System.out.print("짝수 : ");
        e.chkEven();

        TwoDigitInteger tdi = ctx.getBean("tdi", TwoDigitInteger.class);
        System.out.print("10의자리와 1의자리가");
        tdi.equal();

        Triangle t = ctx.getBean("t", Triangle.class);
        t.sides();

        Score sc = ctx.getBean("sc", Score.class);
        sc.studentsNum();

        MaxMin mm = ctx.getBean("mm", MaxMin.class);
        mm.Max();
        mm.Min();

        FiveNum fn = ctx.getBean("fn", FiveNum.class);
        fn.sumAvg();

        ctx.close();
    }
}