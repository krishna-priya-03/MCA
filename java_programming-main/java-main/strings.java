//write a program to read string manipulation method

public class strings{
    public static void main(String[] args){
        String str1 = "Hello World";
        String str2 = "Java Programming";

        //length of the string
        int length = str1.length();
        System.out.println("Length of str1: " + length);

        //concatenation of strings
        String str3 = str1.concat(str2);
        System.out.println("Concatenated string: " + str3);

        String str4 = str1 + " " + str2;
        System.out.println("Concatenated string using + operator: " + str4);

        String str5 = "HELLO WORLD";

        //comparing strings
        boolean isEqual = str1.equals(str5);
        System.out.println("Are str1 and str5 equal? " + isEqual); 

        // index of a character
        int index = str1.indexOf('o');
        System.out.println("Index of 'o' in str1: " + index);


        //uppercase and lowercase
        String upperStr = str1.toUpperCase();   
        String lowerStr = str1.toLowerCase();
        System.out.println("Uppercase: " + upperStr);
        System.out.println("Lowercase: " + lowerStr);

        //replace characters
        String replacedStr = str1.replace('o', 'x');
        System.out.println("Replaced string: " + replacedStr);

        //substring
        String subStr = str1.substring(0, 5);   
        System.out.println("Substring: " + subStr);

        //trim
        String str6 = "   Hello World   ";
        String trimmedStr = str6.trim();
        System.out.println("Trimmed string: '" + trimmedStr + "'");

        //ASCI value of a character
        char ch = 'A';
        int asciiValue = (int) ch;
        System.out.println("ASCII value of '" + ch + "': " + asciiValue);

        //ascii value of a character in a string
        char ch2 = str1.charAt(0);
        int asciiValue2 = (int) ch2;
        System.out.println("ASCII value of '" + ch2 + "' in str1: " + asciiValue2);

        //byte va lue of a string
        byte[] byteArray = str1.getBytes();
        System.out.println("Byte array of str1: " + java.util.Arrays.toString(byteArray));

    }
}