package week_05.assignments;

public class Question_05_11 {
    public static void main(String[] args) {
        int counter = 0;
        for (int number = 100; number <= 200; number++) {
            if (number % 5 == 0 ^ number % 6 == 0) {
                counter++;
                System.out.print(number);
                System.out.print(counter % 10 == 0 ? "\n" : " ");
            }
        }
    }
}
