import java.util.Scanner;

public class Main {
    static int[] numbers = new int[10];
    static int numbersCount = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            fillArray();
        for (int n : numbers)
            System.out.println(n);
    }

    public static int readNumber() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0)
            throw new NegativeNumberException();
        return number;
    }

    public static void fillArray() {
        try {
            int number = readNumber();
            numbers[numbersCount] = number;
        } catch (NegativeNumberException e) {
            numbers[numbersCount] = 0;
            System.out.println(e);
        } finally {
            numbersCount++;
        }
    }
}