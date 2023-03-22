package kr.hs.dgsw.java.package2;

public class Adder {

    int plus(int operand1, int operand2){
        int sum = operand1 + operand2;

        return sum;
    }

    int pluses(int operand1, int operand2, int operand3){
//        int sum = operand1 + operand2 + operand3;
        int sum = plus(plus(operand1, operand2), operand3);

        return sum;
    }
}
