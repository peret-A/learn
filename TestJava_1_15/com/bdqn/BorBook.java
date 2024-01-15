package com.bdqn;

public class BorBook {
    /**
     * 借阅书籍的 名字 时间 状态
     */
    private String name;
    private int time;
    private String state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "借阅书籍单{" +
                "借阅名字='" + name + '\'' +
                ", 借阅时间=" + time +
                ", 借阅状态='" + state + '\'' +
                '}';
    }
}
