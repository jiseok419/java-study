package kr.hs.dgsw.java.package1;

public class User {
    String name;
    Byte age;
    double height;

    void aged(){
        age++;
        if(age < 20){
            height += 8.4;
        }
    }

    void print(){
        System.out.printf("%s님의 나이는 %d세이고, 키는 %.1f입니다.\n", name, age, height);
    }
}
