package kr.hs.dgsw.java.package9;

import java.util.Scanner;

public class ProjectDivisor {

    public int Divisor(int value) {
        int sum = 0;

        for (int i = 1; i <= value; i++){
            if(value % i == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        ProjectDivisor projectDivisor = new ProjectDivisor();
        int isDivisor =  projectDivisor.Divisor(number);

        System.out.printf("%d은 %d", number, isDivisor);
    }
}
