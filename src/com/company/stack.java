package com.company;

import java.util.Stack;

/**
 * Created by Jayen on 11/23/2017.
 */
public class stack{
    public static void check_palindrome(String text_palindrome, String text_first){
        //create stack
        Stack<Character> stack_set = new Stack<Character>();

        //assign text
        String palindrome_check_text = text_palindrome;


        for(Character char_set : palindrome_check_text.toCharArray()){
            stack_set.push(char_set);
        }

        String palindrome_check_text_second = "";

        while (stack_set.size() >0){
            palindrome_check_text_second += stack_set.pop();
        }

        if(palindrome_check_text.equals(palindrome_check_text_second)){
            System.out.println("  string                            : " + text_first + " is palindrome string");
            System.out.println("----------------------------------------------------------------------------");
        }else {
            System.out.println("  string                            : " + text_first + " is not palindrome string");
            System.out.println("----------------------------------------------------------------------------");
        }

    }

}
