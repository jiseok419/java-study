package kr.hs.dgsw.java.package1;

public class School {
    String schoolName;
    int countOfStudents = 0;

    void teach() {
        System.out.println(schoolName + "에서 현재 총 : "+ countOfStudents);
    }

    void enroll() {
        countOfStudents++;
    }
    void graduate() {
        countOfStudents--;
    }
}
