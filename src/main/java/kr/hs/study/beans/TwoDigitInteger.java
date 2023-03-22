package kr.hs.study.beans;

public class TwoDigitInteger {

    private int data;

    TwoDigitInteger(int data){
        this.data = data;
    }

    public void equal(){
        if(data/10 == data%10) System.out.println(" 같음");
        else System.out.println(" 다름");
    }
}
