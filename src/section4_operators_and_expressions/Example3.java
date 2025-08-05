package section4_operators_and_expressions;

public class Example3
{
    public static void main(String[] args) {
        // Arithmetic Operators With Integral Types
        byte lbNum  = 12;
        short lsNum = 130;
        int lnNum   = 2200;
        long llNum  = 1000000L;
        long llSum;
        char lcChar = 'A'; // 65 ASCII Value

        // Byte + Short --> Integer
        int lnSum   = lbNum + lsNum;
        System.out.println(lnSum);

        // Short + Integer --> Integer
        lnSum  = lsNum + lnNum;
        System.out.println(lnSum);

        // Integer + Integer --> Integer
        lnSum = lnNum + 12000;
        System.out.println(lnSum);

        // Long + Integer --> Long
        llSum = lnNum + 1234567L;
        System.out.println(llSum);

        // Char + Integer --> Integer
        lnSum = lcChar + 5;
        System.out.println(lnSum);
    }
}
