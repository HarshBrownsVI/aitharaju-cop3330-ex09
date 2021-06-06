/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sriharsha Aitharaju
 */

java.util.*;
public class Ex9 {
    public static void main (String[] args)
    {
        Scanner kb = new Scanner(System.in);
        final int gallon = 350; // constant
        int length = kb.nextInt();
        int width = kb.nextInt();
        int res = ((length*width) / gallon) + 1;
        System.out.println("You will need to purchase " + res + " gallons of paint to cover "+ (length*width) + " square feet.");
    }

    }
}