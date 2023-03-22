package kr.hs.dgsw.java.package4;

public class VariableStudy {

    final int COUNT = 0;
    final double PI = 3.1415926;

    void study() {
        int value1 = 5;
        int value2 = 3;

        String $name = "";
        String name$ = "";

        double abc_ddd = 3.2;
        int _value = 7;

        //잘못된 예
        String 이름 = "홍길동";
        System.out.println(이름);
    }

    void studyFinal() {
        final int value = 3;
//     value = 5;

        final int age;
        age = 2;
//     age = 4;
    }
}
