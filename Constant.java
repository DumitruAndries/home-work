package Lesson3.game.hero;

public class Constant {

    public static final int ELF_POWER = 20;
    public static final int ELF_CHARISMA = 5;
    public static final int ELF_MAGIC = 11;


    public static void main(String[] args) {
        String str = new String("I study Basic Java!");

        printLastCharacter(str);
        checkSubstring(str);
        replaceCharacters(str);
        convertToUpperCase(str);
        convertToLowerCase(str);
        substringExample(str);
    }

    public static void printLastCharacter(String str) {
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Last character: " + lastChar);
    }

    public static void checkSubstring(String str) {
        boolean containsJava = str.contains("Java");
        System.out.println("Contains 'Java': " + containsJava);
    }

    public static void replaceCharacters(String str) {
        String replacedStr = str.replace('a', 'o');
        System.out.println("Replaced string: " + replacedStr);
    }

    public static void convertToUpperCase(String str) {
        String upperCaseStr = str.toUpperCase();
        System.out.println("Upper case string: " + upperCaseStr);
    }

    public static void convertToLowerCase(String str) {
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lower case string: " + lowerCaseStr);
    }

    public static void substringExample(String str) {
        String substring = str.substring(14);
        System.out.println("Substring: " + substring);
    }
}
