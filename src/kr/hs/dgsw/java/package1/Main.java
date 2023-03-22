package kr.hs.dgsw.java.package1;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.name = "강지석";
        user.age = 18;
        user.height = 171.7;

        School school = new School();

        school.schoolName = "대구소프트웨어마이스터고등학교";
        school.enroll();
        school.enroll();
        school.enroll();

        school.teach();

        user.aged();
        user.aged();
        user.print();
    }
}