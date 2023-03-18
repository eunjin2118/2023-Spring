package study.db.entity;

import jakarta.persistence.*;

@Entity
public class Person {
    @GeneratedValue(strategy = GenerationType.IDENTITY) // primary key
    @Id
    private Integer id;

    @Column
    private String name;

    @Column
    private int age;
}
