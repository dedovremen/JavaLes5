package com.company;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calcSquare(){
        int s = length * width;
        return s;
    }
}
