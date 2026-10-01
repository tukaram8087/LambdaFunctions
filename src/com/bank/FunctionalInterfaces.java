
import java.util.Arrays;
import java.util.Random;
import java.util.function.*;

public class Functionallnterfaces {
    
    public static void main(String[] args) {
        System.out.println("--- Working with Java Lambdas ---");

        // 1. 
       
        Consumer<String[]> sortStrings = arr -> Arrays.sort(arr);
        
        String[] fruits = {"Banana", "Apple", "Mango", "Cherry"};
        sortStrings.accept(fruits);
        System.out.println("1. Sorted fruits: " + Arrays.toString(fruits));


        // 2. 
        
        Function<int[], Integer> getLargest = arr -> {
            int max = arr[0];
            for (int n : arr) {
                if (n > max) max = n;
            }
            return max;
        };

        int[] numsA = {4, 19, 2, 88, 33};
        System.out.println("2. Largest number: " + getLargest.apply(numsA));


        // 3. 
        Function<int[], Integer> getSmallest = arr -> {
            int min = arr[0];
            for (int n : arr) {
                if (n < min) min = n;
            }
            return min;
        };

        int[] numsB = {45, 12, 89, 3, 55};
        System.out.println("3. Smallest number: " + getSmallest.apply(numsB));


        // 4. generate a 3 digit random number
      
        Supplier<Integer> randomThreeDigit = () -> new Random().nextInt(900) + 100;
        System.out.println("4. Random 3-digit number: " + randomThreeDigit.get());


        // 5. take an int array and return its reverse
        Function<int[], int[]> reverseNums = arr -> {
            int[] rev = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                rev[i] = arr[arr.length - 1 - i];
            }
            return rev;
        };

        int[] original = {10, 20, 30, 40, 50};
        System.out.println("5. Reversed array: " + Arrays.toString(reverseNums.apply(original)));


        // 6. print the current date
        
        Runnable showDate = () -> System.out.println("6. Today's date is: " + LocalDate.now());
        showDate.run();


        // 7. check if a number is prime
        Predicate<Integer> checkPrime = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        int testNum = 29;
        System.out.println("7. Is " + testNum + " a prime number? " + checkPrime.test(testNum));


        // 8.   take 2 strings and concatenate them
        BiFunction<String, String, String> joinStrings = (str1, str2) -> str1 + " " + str2;
        System.out.println("8. Concatenated string: " + joinStrings.apply("Hello", "World"));
    }
}