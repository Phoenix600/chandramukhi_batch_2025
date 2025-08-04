package section3_variables_and_literals;

import java.util.Scanner;

public class Example3
{
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        byte bNum1;
        short sNum2;
        int nNum3;
        long lNum4;

        float fNum5;
        double dNum6;

        boolean isPrime;

        String sData;

        System.out.println("Enter The Byte Value : ");
        bNum1 = Input.nextByte();
        System.out.println("value : " + bNum1);

        System.out.println("Enter The Short Value : ");
        sNum2 = Input.nextShort();
        System.out.println("Value : " + sNum2);

        System.out.println("Enter The Integer Value : ");
        nNum3 = Input.nextInt();
        System.out.println("Value : " + nNum3);

        System.out.println("Enter The Long Value : ");
        lNum4 = Input.nextLong();
        System.out.println("Value : " + lNum4);

        System.out.println("Enter The Float Value : ");
        fNum5 = Input.nextFloat();
        System.out.println("Value : " + fNum5);

        System.out.println("Enter The Double Value : ");
        dNum6 = Input.nextDouble();
        System.out.println("Value : " + dNum6);

        System.out.println("Enter The Boolean Value : ");
        isPrime = Input.nextBoolean();
        System.out.println("Value : " + isPrime);

        System.out.println("Enter The String Value : ");
        Input.nextLine();
        sData = Input.nextLine();
        System.out.println("Value : " + sData);
    }
}
