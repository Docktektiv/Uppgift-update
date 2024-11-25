package Inlämning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Counter inputHandler = new Counter();

        Scanner scan = new Scanner(System.in);

        while (true) {
            String input = scan.nextLine();

            if(input.equalsIgnoreCase("stop")) {
                break;
            }

            inputHandler.Matte(input);
        }

        inputHandler.Resultat();

        scan.close();

    }
}

