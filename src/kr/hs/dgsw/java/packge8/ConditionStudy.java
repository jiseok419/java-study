package kr.hs.dgsw.java.packge8;

import java.util.Scanner;

public class ConditionStudy {

    void studyWhile() {
        Scanner scanner = new Scanner(System.in);

        String str = null;

        while (!"Q".equals(str)) {
            str = scanner.next();
            System.out.println(str);
        }

        do {
            str = scanner.next();
            System.out.println(str);
        } while (!"Q".equals(str));

        scanner.close();
    }

    void studySwitch() {
        int value = 5;

        switch(value) {
            case 1:
                System.out.println("굳");
                break;
            case 5:
                System.out.println("분발 해야됨요");
                break;
        }
    }

    void studyFor() {
        int sum = 0;

        for (int i = 1 ; i <= 100 ; i++){
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }

    void studyFor2() {
        String[] colors = new String[] {"red", "yellow", "green", "blue", "black"};
        for (String arr:colors){
            System.out.println(arr);
        }
    }

    void studyIf() {

        boolean flag1 = false;
        boolean flag2 = true;

        int value;

        if (flag1) {
            value = 1;
        }
        if (flag2) {
            value = 2;
        }
        else {
            value = 3;
        }
    }
}
