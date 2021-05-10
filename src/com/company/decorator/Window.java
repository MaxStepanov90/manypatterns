package com.company.decorator;

public class Window implements Component{

    @Override
    public void draw() {
        System.out.println("window textView");
    }
}
