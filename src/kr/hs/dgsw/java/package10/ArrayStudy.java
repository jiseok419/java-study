package kr.hs.dgsw.java.package10;

public class ArrayStudy {

    void study() {
        double[] doubleArray = new double[100];
        String[] strArray = new String[20];
        boolean[] boolArray = new boolean[2];
        char[] charArray = new char[10];

        strArray[2] = "Lian";
        strArray[5] = "Rabbit";
        doubleArray[0] = 3.14;

        String str = null;
        str = strArray[5];
        System.out.println(strArray[3]);
        System.out.println(strArray[2]);
        System.out.println(doubleArray[1]);
        System.out.println(charArray[0] + " " + (int)charArray[0]);
        System.out.println(boolArray[0]);
    }
    void studyInt() {
        int[] value = new int[] {5, 4, 2, 3, 5};
        int lengthOfArray = value.length;

        System.out.printf("배열의 길이 : %d", lengthOfArray);

        for(int i:value){
            System.out.println(i);
        }
        System.out.print("\n\n\n\n\n");
        for(int i = 0; i < lengthOfArray; i++){
            System.out.println(value[i]);
        }
    }

    public static void main(String[] args) {
        ArrayStudy arrayStudy = new ArrayStudy();
        arrayStudy.studyInt();
    }
}
