package kr.hs.dgsw.java.package7;


import java.util.Scanner;

public class ScannerStudy {

    Scanner scanner = null;

    public void prepareScanner() {
        this.scanner = new Scanner(System.in);
    }

    public void closeScanner() {
        if (this.scanner != null) {
            this.scanner.close();
        }
    }

    public void studyScanner() {
        while (true){
            String str = this.scanner.next();
            if ("quit".equals(str)) break;
            System.out.println("읽어온 값 : " + str);
        }
    }
}
