package kr.hs.dgsw.java.package2;

public class Main {
    public static void main(String[] args) {
        Adder calc = new Adder();

        int result1 = calc.plus(21303, 20303);
        int result2 = calc.pluses(21303, 20303, 200000);

        System.out.println(result1);
        System.out.println(result2);

        Accumulator accumulator = new Accumulator();

        accumulator.add(3);
        accumulator.add(4);
        accumulator.add(6);
        accumulator.add(2);
        accumulator.add(1);

        int value = accumulator.getSum();
        System.out.println(value);
        accumulator.reset();
        int value1 = accumulator.getSum();
        System.out.println(value1);
    }
}
