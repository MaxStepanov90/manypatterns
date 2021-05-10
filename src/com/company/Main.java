package com.company;

import com.company.decorator.*;

public class Main {

    public static void main(String[] args) {

        boolean showBorder = false;

        Component window;
        Component textView;

        if (!showBorder) {
            window = new Window();
            textView = new TextView();
        } else {
            window = new BorderDecorator(new Window());
            textView = new BorderDecorator(new TextView());
        }

        window.draw();
        textView.draw();
    }
}
