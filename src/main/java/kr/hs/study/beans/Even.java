package kr.hs.study.beans;

public class Even {
    private int data1;
    private int data2;
    private int data3;

    Even(int data1, int data2, int data3){
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    public void chkEven(){
        if(data1%2==0) System.out.println(data1);
        if(data2%2==0) System.out.println(data2);
        if(data3%2==0) System.out.println(data3);
    }
}
