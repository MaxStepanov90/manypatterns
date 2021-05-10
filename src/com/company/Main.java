package com.company;

import com.company.singleton.TestSingleton;

public class Main {

    public static void main(String[] args) {
        TestSingleton.getInstance().print();
    }
}
