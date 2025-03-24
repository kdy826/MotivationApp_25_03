package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Container.init();

        new App().run();

        Container.close();
 // 메인클래스의 스캐너를 App 클래스로 전송

    }
}