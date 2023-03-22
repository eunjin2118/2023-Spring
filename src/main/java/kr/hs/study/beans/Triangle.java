package kr.hs.study.beans;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    Triangle(int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void sides(){
        if(side1+side2 >= side3 || side2+side3 >= side1 || side1+side3 >= side2)
            System.out.println("삼각형 가능");
        else System.out.println("삼각형 불가능");
    }
}
