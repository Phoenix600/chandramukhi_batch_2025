package section5_printing_and_string_class;

public class Example9
{
    public static void main(String[] args) {

        String str1 = new String();
        System.out.println(str1);

        byte[] bNums = {97,98,99,100};
        String str2 = new String(bNums);

        byte[] bNums1 = {65,66,67,68,69,70};
        String str3   = new String(bNums1,2,3);
        System.out.println(str3);

        char[] chars = {'A','a','B','b','C','c'};
        String str4  = new String(chars);
        System.out.println(str4);

        char[] chars1 = {'X','Y','Z','A','B','C','D'};
        String str5   = new String(chars1,2,4);
        System.out.println(str5); //BbCc

        String str6 = "S2P Means Java";
        System.out.println(str6);

    }
}
