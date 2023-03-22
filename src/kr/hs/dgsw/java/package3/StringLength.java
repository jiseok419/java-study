package kr.hs.dgsw.java.package3;

public class StringLength {
    void study() {
        String schoolName = "대구소프트웨어마이스터고등학교";
        String name = "Andrew";
        String flower = "수수꽃다리";

        showLength(schoolName);
        showLength(name);
        showLength(flower);
    }

    void showLength(String str) {
        int len = str.length();
        System.out.printf("\"%s\"의 길이는 %d입니다.\n",
                str, len);
    }
}
