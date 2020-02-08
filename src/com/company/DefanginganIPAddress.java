package com.company;

import java.util.Scanner;

public class DefanginganIPAddress {

    public static void main(String[] args) {
        System.out.print("Enter an IP address: ");
        Scanner input = new Scanner(System.in);
        String IP = input.next();
        System.out.println(defangIPaddr(IP));
    }

    public static String defangIPaddr(String address) {
        String newstring = address.replace(".","[.]");
        return newstring;
    }
}
