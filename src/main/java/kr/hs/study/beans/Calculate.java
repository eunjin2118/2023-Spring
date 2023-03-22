package kr.hs.study.beans;

public class Calculate {
    private int data1;
    private int data2;
    private int data3;

    Calculate(int data1, int data2, int data3){
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    public int sum(){
        return data1+data2+data3;
    }

    public double avg(){
        return (data1+data2+data3)/3;
    }
}
