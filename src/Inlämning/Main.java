package Inlämning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter word");
        String s = scanner.next();

        System.out.println("enter letter");

        char a = scanner.next().charAt(0);

        int count = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == a){
                count++;
            }
        }

        System.out.println(count);

    }
}

//Test yes hello
//This is from GitHub