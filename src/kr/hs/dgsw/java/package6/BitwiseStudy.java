package kr.hs.dgsw.java.package6;

public class BitwiseStudy {

    void studyAnd() {
        int op1 = 0b0111;
        int op2 = 0b0011;

        int result = op1 & op2;

        System.out.printf("%d & %d = %d \n", op1, op2, result);

        op1 = 0x3A;
        op2 = 0x15;
        result = result = op1 & op2;
        System.out.printf("%d & %d = %d", op1, op2, result);
    }

    void studyOr() {
        int result;
        int op1 = 0b00101010;
        int op2 = 0b01011101;

        result = result = op1 | op2;
        System.out.printf("%d | %d = %d", op1, op2, result);
    }

    void studyXor() {
        int op1 = 1;
        int op2 = 1;

        int result = op1 ^ op2;

        System.out.printf("%d ^ %d = %d", op1, op2, result);

        op1 = 0;
        op2 = 1;

        result = op1 ^ op2;

        System.out.printf("%d ^ %d = %d", op1, op2, result);

        op1 = 1;
        op2 = 0;

        result = op1 ^ op2;

        System.out.printf("%d ^ %d = %d", op1, op2, result);

        op1 = 0;
        op2 = 0;

        result = op1 ^ op2;

        System.out.printf("%d ^ %d = %d\n", op1, op2, result);

        op1 = 5;
        op2 = 2;

        result = op1 ^ op2;

        System.out.printf("%d ^ %d = %d", op1, op2, result);
    }

    void studyNot() {
        int value = 0b0101;
        int not = ~value;

        System.out.printf("~%d = %d\n", value, not);
    }

    void studyLeftShift(){
        int value = 0b00010000;
        int count = 1;
        int shifted = value << count;

        System.out.printf("%d << %d = %d\n", value, count, shifted);
    }
    void studyRightShift(){
        int value = 0b00010000;
        int count = 1;
        int shifted = value >> count;

        System.out.printf("%d >> %d = %d\n", value, count, shifted);
    }

    public String toBinary(int value){
        String result = new String();
        result = toBinaryPositive(value);
        return result;
    }

    public String toBinaryPositive(int value) {
        String bit = new String();
        while (value > 0){
            bit = value % 2 + bit;
            value /= 2;

        }
        return bit;
    }
}
