import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {12, 19, 13, 56, 90, 76, 24, 9, 45, 49};
        int maxTwoSum = 0, minTwoSum = 0;
        int temp;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(numbers));
        maxTwoSum = numbers[numbers.length - 1] + numbers[numbers.length - 2];
        minTwoSum = numbers[0] + numbers[1];

        System.out.println("Enter operation: *, /, -, +");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();

        switch (operation) {
            case "+" -> System.out.println(maxTwoSum + minTwoSum);
            case "/" -> System.out.println(maxTwoSum / minTwoSum);
            case "*" -> System.out.println(maxTwoSum * minTwoSum);
            case "-" -> System.out.println(maxTwoSum - minTwoSum);
            default -> System.out.println("Wrong operation!");
        }
    }
}