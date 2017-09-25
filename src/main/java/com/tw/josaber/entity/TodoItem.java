package com.tw.josaber.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class TodoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    @Size(max = 140 , message = "内容长度不得超过140字符")
    private String text;

    @Column(nullable = false)
    private boolean done;
    private String timestamp;

    public int getId() {
        return id;
    }

    public TodoItem setId(int id) {
        this.id = id;
        return this;
    }

    public String getText() {
        return text;
    }

    public TodoItem setText(String text) {
        this.text = text;
        return this;
    }

    public boolean isDone() {
        return done;
    }

    public TodoItem setDone(boolean done) {
        this.done = done;
        return this;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public TodoItem setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
}
