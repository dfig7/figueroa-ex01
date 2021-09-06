import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Diego Figueroa
 */
/*
Print: What is your name?
save name into String variable name
print: Hello, 'name', nice to meet you!
 */
public class Solution01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("What is your name? ");
        String name = sc.nextLine();
        System.out.printf("Hello, %s, nice to meet you!", name);
    }

}
