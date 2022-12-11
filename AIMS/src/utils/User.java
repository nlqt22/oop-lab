package utils;

import java.util.Scanner;

public class User {
    public static char enterChar(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message + " ");
        char in = scanner.next().charAt(0);
        if(in == 'Y' || in == 'y' || in == 'N' || in == 'n') return in;
        else return '0';
    }

    public static String enterString(String message) {
        Scanner scanner = new Scanner(System.in);
        String in = "";
        do {
            System.out.print(message + " ");
            in += scanner.nextLine();
            if(in.equals(null)) System.out.println("[ERROR]Your input is null");
        } while(in.equals(null));
        return in;
    }

    public static int enterNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        int in;
        do {
            System.out.print(message +" ");
            in = scanner.nextInt();
            if(in < 0) System.out.println("[ERROR]Your input must be non-negative");
        }while(in < 0);
       return in;
    }
}
