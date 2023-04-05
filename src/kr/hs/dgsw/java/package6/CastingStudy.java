package kr.hs.dgsw.java.package6;

public class CastingStudy {

    void studySome() {
        char ch = 'A';
        double doubleValue;
        int intValue = 3;
        long longValue = 3L;

        doubleValue = 3;
        intValue = (int)3.14;

        longValue = intValue;
        intValue = (int)longValue;

        String value = "123";
        int value2 = Integer.parseInt(value);

//        boolean boolenaValue = (boolean) 1;
        int Value = (int)ch;
    }
}
