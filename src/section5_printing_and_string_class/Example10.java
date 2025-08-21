package section5_printing_and_string_class;

public class Example10
{
    public static void main(String[] args)
    {
        String str1 = "   Welcome   ";
        String str2 = "Java Programming";

        int size = str1.length();
        System.out.println("Length Of Str1 : " + size);

        String s = "S2P Means Java";
        // calculate the length of String s object
        // Write Your Code Here

        String upperString = "JAVA MEANS S2P";
        String lowerCaseString = upperString.toLowerCase();
        System.out.println("LowerCase String : " + lowerCaseString);
        System.out.println("Original String  : " + upperString);


        String lowerString1 = "I Still See Your Shadow In My Room";
        String upperCaseString1 = lowerString1.toUpperCase();
        System.out.println("UpperCAse String : " + upperCaseString1);

        String trimmedString = str1.trim();
        System.out.println("Untrimmed String : " + str1);
        System.out.println("Trimmed String : " + trimmedString);

        String blankString = ""; // Zero Character Sequence
        boolean ans =  blankString.isBlank();
        System.out.println("Is This Blank : " + ans);

        String pubgDays = "AKM is OP";
        char cData =  pubgDays.charAt(5);
        System.out.println("Char At 5th Position " + cData);

        String s1 = "Java is ";
        String s2 = "OP";
        String s3 = s1 + s2;

        System.out.println("s1 + s2 : " + s3);

        // re-assignment or Reusing Of Variable
        s3 = s2 + s1;
        System.out.println("s2 + s1 : " + s3);


    }
}
