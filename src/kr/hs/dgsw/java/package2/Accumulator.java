package kr.hs.dgsw.java.package2;

public class Accumulator {
    int sum = 0;

    void add(int value) {
        sum += value;
    }

    int getSum(){
        return sum;
    }

    void reset() {
        sum = 0;
    }
}
