package com.bdqn;

public class Book {
/**
 * 图书库 名字 数量 出版社
 */
private String name;
private int nums;
private String publisher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    public String getPublisher() {
        return publisher;
    }

    public Book() {
    }

    public Book(String name, int nums, String publisher) {
        this.name = name;
        this.nums = nums;
        this.publisher = publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "图书库书单{" +
                "书名='" + name + '\'' +
                ", 数量=" + nums +
                ", 出版社='" + publisher + '\'' +
                '}';
    }
}
