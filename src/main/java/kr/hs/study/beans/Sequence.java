package kr.hs.study.beans;

public class Sequence {
    private String s1;
    private String s2;

    Sequence(String s1, String s2){
        this.s1 = s2;
        this.s2 = s1;
    }

    public void print(){
        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);
    }
}
