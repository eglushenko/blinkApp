package com.test.blinkapp.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "number")
public class Index {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    int num;

    public Index() {
    }

    public Index(int num) {
        this.num = num;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
