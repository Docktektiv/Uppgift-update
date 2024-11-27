package Testfall;


import java.util.Scanner;
import java.util.stream.IntStream;

public class buh {


    public static void main(String[] args) {

        TestCases bamba = new TestCases();

        Scanner scan = new Scanner(System.in);
        //int input = scan.nextInt();
        //int a = Integer.parseInt(scan.nextLine());
        //int b = Integer.parseInt(scan.nextLine());
        //int bung = a*b;

        int[] nummer = new int[3];
        nummer[0] = scan.nextInt();
        nummer[1] = scan.nextInt();
        nummer[2] = scan.nextInt();

        int summa = IntStream.of(nummer).sum();
    }
}