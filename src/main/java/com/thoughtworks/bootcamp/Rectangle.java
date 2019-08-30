package com.thoughtworks.bootcamp;

public class Rectangle {
    float length;

    Rectangle(float length){
        this.length = length;
    }
    public float CalculateArea() {
        return length*length ;
    }
}
