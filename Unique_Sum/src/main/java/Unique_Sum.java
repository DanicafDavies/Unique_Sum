import java.util.Scanner;

/**
 * File_Name: Unique Sum
 * Coding Language: Java
 * Author: Danica Davies
 * Date of creation: 20/10/23
 * Date of last update: 20/10/23
 * Description: Unique Sum Programming Challenge - When given 3 integer values, return their sum.
 * if one value is the same as another value, they do not count towards the sum.
 * In other words only return the sum of unique numbers given**/

public class Unique_Sum
{

    public static void main( String[] args )
    {
        int a,b,c;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the First number:");
        a = myObj.nextInt();
        System.out.println("Enter the Second number:");
        b = myObj.nextInt();
        System.out.println("Enter the Third number:");
        c = myObj.nextInt();

        if (a == b && a == c) {
            a = 0; b =0; c = 0;
        }

        if (a == b || a == c || b == c)
        {   if (a == b) {
                a = 0; b = 0; }
            else if (a == c) {
                a = 0; c = 0; }
            else if (b == c) {
                b = 0; c = 0; }
        }
        System.out.println("Unique Sum: " + a + "+" + b + "+" + c + " = " + (a+b+c));
    }
}

