package autoAndUnboxing;

public class AutoAndUnboxing {
    public static void main(String[] args) {
        int num = 7;
        Integer numberInteger = Integer.valueOf(7);
        Integer numInt = num;
        System.out.println(num+""+numberInteger+" "+numInt);

        Integer integer = new Integer(77);
        int newInt = integer.intValue();
        int tempInt = integer;
        System.out.println(integer+""+newInt+""+tempInt+"");

        char character = 's';
        Character newCharacter = Character.valueOf(character);
        Character tempChar = character;
        System.out.println(character+""+newCharacter+""+tempChar);

        Character myCharacter = new Character('t');
        char myChar = myCharacter.charValue();
        char mytempChar = myCharacter;
        System.out.println(myCharacter+""+myChar+""+mytempChar);


    }
}
