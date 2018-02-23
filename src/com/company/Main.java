package com.company;

import java.util.Scanner;

/**
 * Created by Jayen on 11/23/2017.
 */


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Enter text to check it is palindrome : ");
        Scanner get_text = new Scanner(System.in);
        String text = get_text.nextLine();
        remove_specl_chars(text);
    }

    private static void remove_specl_chars(String text){
        if (text.isEmpty()) {
            System.out.println("----------------------------------");
            System.out.println("|        Enter Your Text          |");
            System.out.println("----------------------------------");
            String[] args = new String[0]; // Or String[] args = {};
            main(args);
        } else {
            //remove spaces form text
            String reove_spe_chars = text.replaceAll("\\s+", "");

            //remove special characters form text
            String remove_special_chars = reove_spe_chars.replaceAll("[\\W]", "");

            //assign string to final variable with lowercase
            String final_string = remove_special_chars.toLowerCase();

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("  string                            : " + text);
            System.out.println("  string without spaces             : " + reove_spe_chars);
            System.out.println("  string without special characters : " + final_string);
            System.out.println("----------------------------------------------------------------------------");

            //send value to class
            stack.check_palindrome(final_string,text);

            System.out.print("Enter Another word yes(Y),No(N)");
            Scanner rerun = new Scanner(System.in);
            String return_text = rerun.nextLine();
            if (return_text.equals("Y")) {
                try {
                    Runtime.getRuntime().exec("cmd /c cls");
                    String[] args = new String[0];
                    main(args);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                System.exit(0);
            }

        }
    }
}
