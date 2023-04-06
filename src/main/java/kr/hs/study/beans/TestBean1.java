package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
// type으로 객체 만듦
public class TestBean1 {
    @Value("22")
    private int data1;
    @Value("22.22")
    private double data2;

    public TestBean1(@Value("33") int data1, @Value("33.33") double data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public int getData1() {
        return data1;
    }

    public void setData1(int data1) {
        this.data1 = data1;
    }

    public double getData2() {
        return data2;
    }

    public void setData2(double data2) {
        this.data2 = data2;
    }
}
