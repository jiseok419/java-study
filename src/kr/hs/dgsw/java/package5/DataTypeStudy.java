package kr.hs.dgsw.java.package5;

public class DataTypeStudy {

    void studyInteger(){
        byte byteValue = 1;

        byteValue = 127;
        byteValue++;
        System.out.println(byteValue);

        int value1 = 1500000000;
        int value2 = 1800000000;

        System.out.printf("%d + %d = %d \n", value1, value2, value1 + value2);

        System.out.printf("byte type의 범위 : %d ~ %d \n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short type의 범위 : %d ~ %d \n", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("int type의 범위 : %d ~ %d \n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long type의 범위 : %d ~ %d \n", Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public void studyFloat(){
        float floatValue = 3.14f;
        double doubleValue = 3.14;

        System.out.println(floatValue);
        System.out.println(doubleValue);
    }

    void studyBoolean(){
        boolean success = true;
        success = false;

    }

    void studyChar(){
        char ch = '가';

        char chK = '힝';
        int countOfKorean = '힝' - '가' + 1;
        System.out.println(countOfKorean);
        System.out.printf("%d - %c\n", (int)chK, chK);

        for(char ch3 = '가'; ch3 < '나'; ch3++){
            System.out.printf("%d - %c\n", (int)ch3, ch3);
        }
    }

    void studyChars(){
        char ch;
        for (int i = 0; i < 30001; i++){
            System.out.printf("%d - %c \n", i, (char)i);
        }
    }

    void studyWrapperClass(){
        Integer intValue = 3;
        int value2 = intValue;
    }
}
