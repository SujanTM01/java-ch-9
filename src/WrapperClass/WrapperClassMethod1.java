package WrapperClass;

public class WrapperClassMethod1 {
    //Write a Java program to use different functions of wrapper
    //class:
    public static void main(String[] args) {
        Double myDouble = new Double(1.234221313);
        System.out.println("Converting to byte"+myDouble.byteValue());
        System.out.println("converting to short:"+myDouble.shortValue());
        System.out.println("Converting to int :"+myDouble.intValue());
        System.out.println("Converting to long :"+myDouble.doubleValue());
        System.out.println("Converting to float:"+myDouble.floatValue());
        System.out.println("converting to String:"+myDouble.toString());
        System.out.println("Converting to double class:"+Double.valueOf("2.2324221"));
        System.out.println("converting to primitive data types"+Double.parseDouble("2.2324221"));
        Double double1 = new Double(1.23);
        Double double2 = new Double(1.234);
        System.out.println("equal :"+double1.equals(double2));
        System.out.println("Compare to:"+double1.compareTo(double2));
    }
}
