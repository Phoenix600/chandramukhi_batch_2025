package section4_operators_and_expressions;
import java.util.Scanner;

public class Example7
{
    public static void main(String[] args) {
        float a;
        float b;
        float c;

        float s;
        float area;

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the length of side a : ");
        a = Input.nextFloat();

        System.out.println("Enter the length of side b : ");
        b = Input.nextFloat();

        System.out.println("Enter the length of side c : ");
        c = Input.nextFloat();

        s =  (a + b + c) / 2f;
        area = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area Of Triangle : " + area);
    }
}
