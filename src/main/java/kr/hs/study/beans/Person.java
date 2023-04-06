package kr.hs.study.beans;

import lombok.Data;

@Data
//@Component 같은타입 객체 만들어야 하기 때문에 쓰면 안 됨
public class Person {

    String name;
    int age;
    String nickname;

    public Person(String name, int age, String nickname) {
        this.name = name;
        this.age = age;
        this.nickname = nickname;
    }

    public void go(){
        System.out.println("가다");
    }
}
