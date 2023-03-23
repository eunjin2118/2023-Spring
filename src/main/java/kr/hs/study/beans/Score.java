package kr.hs.study.beans;

public class Score {
    private int s1;
    private int s2;
    private int s3;

    Score(int s1, int s2, int s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public void studentsNum() {
        int[] arr = {s1, s2, s3};
        int[] score = new int[4];
        for(int i = 0; i < 3; i++){
            if(arr[i] >= 90) score[0]++;
            else if(arr[i] >= 80) score[1]++;
            else if(arr[i] >= 70) score[2]++;
            else score[3]++;
        }
        System.out.println("90점 대 : " + score[0]);
        System.out.println("80점 대 : " + score[1]);
        System.out.println("70점 대 : " + score[2]);
        System.out.println("그 외 : " + score[3]);
    }

}
