package section4_operators_and_expressions;

import java.util.Scanner;

public class Example6
{
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        float lfBase;
        float lfHeight;

        System.out.println("Enter the base of triangle : ");
        lfBase = Input.nextFloat();

        System.out.println("Enter the height of triangle : ");
        lfHeight = Input.nextFloat();

        float lfArea = (lfBase * lfHeight)/2;
        System.out.println("Area Of Triangle : " + lfArea);
    }
}
