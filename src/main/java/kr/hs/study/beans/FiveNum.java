package kr.hs.study.beans;

public class FiveNum {
    private int n1;
    private int n2;
    private int n3;
    private int n4;
    private int n5;

    FiveNum(int n1, int n2, int n3, int n4, int n5){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
    }

    public void sumAvg(){
        int[] arr = {n1, n2, n3, n4, n5};
        int sum=0;
        for(int i=0; i<5; i++){
            if(arr[i] >= 20 && arr[i] <=50){
                sum+=arr[i];
            }
        }
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + sum/5);
    }
}
