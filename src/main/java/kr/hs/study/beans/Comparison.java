package kr.hs.study.beans;

public class Comparison {
    private int a;
    private int b;

    Comparison(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void compare(){
        if(a > b) System.out.println(1);
        else if(a < b) System.out.println(0);
        else System.out.println("a==b");
    }
}
