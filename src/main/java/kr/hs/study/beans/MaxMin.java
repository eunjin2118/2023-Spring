package kr.hs.study.beans;

public class MaxMin {
    private int data1;
    private int data2;
    private int data3;

    MaxMin(int data1, int data2, int data3){
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    public void Max(){
        System.out.print("최대점수 : ");
        if(data1 > data2 && data1 > data3) System.out.println(data1);
        if(data2 > data1 && data2 > data3) System.out.println(data2);
        if(data3 > data1 && data3 > data2) System.out.println(data3);
    }

    public void Min(){
        System.out.print("최소점수 : ");
        if(data1 < data2 && data1 < data3) System.out.println(data1);
        if(data2 < data1 && data2 < data3) System.out.println(data2);
        if(data3 < data1 && data3 < data2) System.out.println(data3);
    }
}
