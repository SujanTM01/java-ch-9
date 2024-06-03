package WrapperClass;

public class wrapperClassMethod2 {
    //character Class
    public static void main(String[] args) {
        System.out.println("Checking Character:"+Character.isLetter('A'));
        System.out.println("Checking character: "+Character.isLetter('0'));
        System.out.println("Checking digit:"+Character.isDigit('0'));
        System.out.println("Checking digit: "+Character.isDigit('S'));
        System.out.println("Checking whitespace:"+Character.isWhitespace(' '));
        System.out.println("Checking whiteSpace:"+Character.isWhitespace('\n'));
        System.out.println("Checking uppercase:"+Character.isUpperCase('J'));
        System.out.println("Checking upperCase:"+Character.isUpperCase('j'));
        System.out.println("Checking lowerCase: "+Character.isLowerCase('S'));
        System.out.println("checking Lowercase: "+Character.isLowerCase('s'));
        System.out.println("to uppercase:"+Character.toUpperCase('a'));
        System.out.println("to lowerCase:"+Character.toLowerCase('A'));
    }
}
