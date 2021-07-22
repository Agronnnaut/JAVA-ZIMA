package presentation_4;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


    }

    private static void firstTask() {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        List<String> strArray = myList.stream()
                .filter(e -> e.charAt(0) == 'c')
                .map(e -> e.toUpperCase())
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        strArray.forEach(e -> System.out.println(e));

    }

    private static void secondTask() {
        System.out.print("Enter n: ");
        int length = new Scanner(System.in).nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = new Random().nextInt(9);
            System.out.print(arr[i] + " ");
        }

        System.out.print("\n");
        System.out.println(
                Arrays.stream(arr)
                        .filter(e -> e % 2 == 0)
                        .average()
                        .getAsDouble()
        );
    }

    private static void thirdTask() {
        String input = "sdfasfbegasdfvahcaxafgzsvasb";

        input.chars().map(e -> e >= 104 && e <= 116 ? e - 32 : e)
                .forEach(e -> System.out.print((char)e));
    }
}
