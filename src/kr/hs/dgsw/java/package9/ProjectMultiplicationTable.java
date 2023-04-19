package kr.hs.dgsw.java.package9;

import java.util.Scanner;

public class ProjectMultiplicationTable {

    public void multiplicationTable(int value) {
        for(int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", value, i, value * i);
        }
    }

    public static void main(String[] args) {
        ProjectMultiplicationTable table = new ProjectMultiplicationTable();
        Scanner scanner = new Scanner(System.in);
        table.multiplicationTable(scanner.nextInt());
    }
}
