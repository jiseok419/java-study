package kr.hs.dgsw.java.package9;

import java.util.Scanner;

public class ProjectMoney {
    private int remainingMoney;

    public ProjectMoney(int remainingMoney) {
        this.remainingMoney = remainingMoney;
    }

    private int calculateWon(int money, int denomination){
        int won = money / denomination;
        remainingMoney -= won * denomination;
        return won;
    }

    public void sum(){
        System.out.println("오만원권 " + calculateWon(remainingMoney, 50000) + "장");
        System.out.println("일만원권 " + calculateWon(remainingMoney, 10000) + "장");
        System.out.println("오천원권 " + calculateWon(remainingMoney, 5000) + "장");
        System.out.println("일천원권 " + calculateWon(remainingMoney, 1000) + "장");
        System.out.println("오백원권 " + calculateWon(remainingMoney, 500) + "장");
        System.out.println("일백원권 " + calculateWon(remainingMoney, 100) + "장");
        System.out.println("일십원권 " + calculateWon(remainingMoney, 10) + "장");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProjectMoney project = new ProjectMoney(scanner.nextInt());
        project.sum();
    }
}
