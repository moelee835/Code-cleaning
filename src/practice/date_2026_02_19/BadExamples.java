package practice.date_2026_02_19;

import java.util.ArrayList;
import java.util.List;

public class BadExamples {
    private static final double TAX_RATE = 1.05;

    public static void main(String[] args) {
        System.out.println("=== Bad naming examples ===");
        System.out.println("multiply(2,3) = " + multiply(2, 3));
        repeatPrintingDoIfAllowed(true, 3);
        System.out.println("calculateTax(90) = " + calculateTax(90));
        sumAllNumerics(new String[]{"10", "20", "30"});
    }

    // 1) 메소드와 변수 이름이 불명확하고 매직넘버 사용
    public static int multiply(int x, int y) {
        return x * y;
    }

    // 2) 불분명한 불리언 플래그와 이름
    public static void repeatPrintingDoIfAllowed(boolean isAllowed, int count) {
        if (isAllowed) {
            repeatPrint("do", count);
        } else {
            repeatPrint("no", 1);
        }
    }

    private static void repeatPrint(String message, int count) {
        for(int i = 0; i < count; i++)
            System.out.println(message);
    }

    // 3) 매직 넘버(세율 등)를 직접 사용
    public static double calculateTax(double price) {
        return price * TAX_RATE; // 1.05는 의미가 불명
    }

    // 4) 여러 책임이 뒤섞인 긴 메소드 (파싱/검증/계산/출력)
    public static void sumAllNumerics(String[] numerics) {
        List<Integer> parsedIntegers;

        parsedIntegers = parseNumerics(numerics);
        int sum = sumNonNegative(parsedIntegers);
        printSum(sum);
    }

    private static void printSum(int sum) {
        System.out.println("sum = " + sum);
    }

    private static int sumNonNegative(List<Integer> parsedIntegers) {
        int sum = 0;
        for(Integer number : parsedIntegers) {
            sum += Math.max(0, number);
        }
        return sum;
    }

    private static List<Integer> parseNumerics(String[] numerics) {
        List<Integer> parsedNumbers = new ArrayList<>();
        for(String numeric : numerics) {
            try {
                parsedNumbers.add(Integer.parseInt(numeric));
            } catch (NumberFormatException e) {
                System.out.println("Failed to parse 'x' as Integer. skipping.");
            }
        }
        return parsedNumbers;
    }
}

