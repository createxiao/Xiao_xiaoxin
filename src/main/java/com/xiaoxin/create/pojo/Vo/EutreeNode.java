package com.xiaoxin.create.pojo.Vo;

/**
 * Created by Xiaozq on 2020/7/26 16:58
 */
public class EutreeNode {
    private long id;
    private String text;
    private String state;

    public long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getState() {
        return state;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "EutreeNode{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
