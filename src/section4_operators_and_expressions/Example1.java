package section4_operators_and_expressions;

public class Example1
{
    public static void main(String[] args) {
        // Arithmetic Operators  ( Binary Operators )
        int a = 10;
        int b = 3;

        int result = a + b;
        System.out.println("Add : " + result);

        result = a - b;
        System.out.println("Sub : " + result);

        result = a * b;
        System.out.println("Mul : " + result);

        result = a / b;
        System.out.println("Div : " + result);

        result = a % b;
        System.out.println("Mod : " + result);

        int c = 3;
        // Relational Operators   ( Binary Operator )
        // greater than >
        // a = 10
        // b = 3
        // c = 3
        boolean flag;

        flag = a > b;
        System.out.println("Flag : a > b " + flag);

        // greater than equals to >=
        flag = a >= b;
        System.out.println("Flag : a >= b " + flag);

        // less than  <
        flag = a < b; // false
        System.out.println("Flag : a < b " + flag);

        // less than equals to <=
        flag = b <= a;
        System.out.println("Flag : b <= a " + flag);

        // equal equals to
        flag = c == b;
        System.out.println("Flag : c == b " + flag);

        // not equals to
        flag = a != c;
        System.out.println("Flag : a != c " + flag);

        // Logical Operators  --> Result --> Boolean
        // && --> Logical AND   ( Binary )
        // || --> Logical OR    ( Binary )
        // !  --> Logical NOT   ( Unary )
        flag = true && true;
        System.out.println("Flag TRUE AND TRUE : " + flag);

        flag = false || false;
        System.out.println("Flag FALSE OR FALSE : " + flag);

        flag = !true;
        System.out.println("NOT TRUE : " + flag);

        flag = a==b && a !=b;
        System.out.println("Flag : a == b AND a != b : " + flag);

        flag = a==b || a !=b;
        System.out.println("Flag : a == b OR a != b : " + flag);

        flag = !(a==b || a !=b);
        System.out.println("Flag : NOT (a == b OR a != b) : " + flag);

        flag = !(a==b && a !=b);
        System.out.println("Flag : NOT (a == b AND a != b) : " + flag);

        // Ternary Operator  ( 3 Inputs )
        int x = a > b ? 100 : 200;
        System.out.println("x = a > b ? 100 : 200 => " + x);

        // Unary Operator
        int y = 10;
        // ++
        // --

        // y++; // post increment
        // ++y; // pre increment
        // y = 10; s.o.p(++y)// 11
        // y = 11
        // s.o.p(y++) // 11
        // y = 12

        int p = 10;
        int q = 10;

        System.out.println(p++);
        System.out.println(p);

        System.out.println(++q);
        System.out.println(q);

        int r = 10;
        int s = 10;

        System.out.println(r--);// 10  --> r= 9
        System.out.println(r); // 9

        System.out.println(--s); // 10--> 9 --> s --> 9
        System.out.println(s);// 9
    }
}

// In Java Calculations happens At Higher Data Types
// Int       12
// Float     12.1212   ---> Float
// byte + int --> int
// byte + byte --> int
// short + byte --> int
// short + short --> int
// long + int    ---> long
// long + double ---> double
// float + double --> double
