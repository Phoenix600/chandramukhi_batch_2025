package section3_variables_and_literals;

import java.math.BigInteger;

public class Example1
{
    public static void main(String[] args)
    {
        /*
         * Statically Typed Programming :
         * 1. Integral    : byte, short, int, long
         * 2. Decimal     : float, double
         * 3. Character   : char
         * 4. Yes/No      : boolean
         */
        // Variable Declaration And Initialization
        // syntax:
        //M-1:  DATA_TYPE VAR_NAME = VALUE;
        byte bNum1 = 12; // -128 to 127
        System.out.println(bNum1);

        short sNum2 = 30000;  // -32000 to 32000
        System.out.println(sNum2);

        int nNum3 = 33000; // -2b to 2b
        System.out.println(nNum3);

        long lNum4 = 10000000000000000L;  // > 2b
        System.out.println(lNum4);

        // Variable Declaration
        // M-2 DATA_TYPE VAR_NAME;
        int myAge; // uninitialized variable
//        System.out.println(myAge);  // This will give error

        // Float : Category Of Data:
        float fNum5 = 12.1234567891011123f; // 6 decimal places
        System.out.println(fNum5);

        double dNum6 = 12.1234567891011123; // 15 decimal places
        System.out.println(dNum6);

        // character : char
        char cData = 'A';
        System.out.println(cData);

        // Yes-No : boolean
        boolean isRich = true;
        boolean isLoyal = true;

        System.out.println(isLoyal);
    }
}
