package week_06.assignments;

public class Question_06_38 {
    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {

            if (i % 10 == 0 && i > 0) {
                System.out.println();
            }
            if (i < 100) {
                System.out.print(getRandomUpperCaseLetter());
                System.out.print(" ");
            } else {
                System.out.print(getRandomDigitCharacter());
                System.out.print(" ");
            }
        }
    }

    /**
     * Generate a random character between ch1 and ch2
     */
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /**
     * Generate a random lowercase letter
     */
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    /**
     * Generate a random uppercase letter
     */
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    /**
     * Generate a random digit character
     */
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    /**
     * Generate a random character
     */
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
