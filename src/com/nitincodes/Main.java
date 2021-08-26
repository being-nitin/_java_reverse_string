package com.nitincodes;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// java code to reverse a string
    Scanner sc = new Scanner(System.in);
    String string = sc.next();
    String rev =" ";
    for(int i=string.length()-1;i>=0;i--){
        rev = rev + string.charAt(i);
    }
        System.out.println("the reverse of "+string+" is" +rev);

    }
}
