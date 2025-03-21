package org.example;

import org.example.motivation.controller.MotivationController;
import org.example.motivation.entity.Motivation;
import org.example.system.controller.SystemController;

import java.util.Scanner;

public class App {
    private Scanner sc; // 메인클래스의 sc를 받아옴

    public App(Scanner sc) { // 생성자 생성
        this.sc = sc;
    }//  받아온 sc를 사용

    public void run() {
        System.out.println("== motivation 실행 ==");

        SystemController systemController = new SystemController();
        MotivationController motivationController = new MotivationController(sc);


        while (true) {
            System.out.print("명령어) ");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("exit")) {
                systemController.exit();
                break;
            } else if (cmd.length() == 0) {
                System.out.println("명령어가 입력되지 않았음");
                continue;
            }

            if (cmd.equals("add")) {
                motivationController.add();

            } else if (cmd.equals("list")) {
                motivationController.list();

            } else if (cmd.equals("del")) {

                motivationController.delete(cmd);

            }
            else {
                System.out.println("사용할 수 없는 명령어야");
                continue;

            }
        }
    }
}