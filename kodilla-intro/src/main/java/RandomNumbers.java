import java.util.Random;

public class RandomNumbers {
    private static int random;
    private static int sum = 0;
    private static int maxValue = Integer.MIN_VALUE;
    private static int minValue = Integer.MAX_VALUE;
    static Random number = new Random();

    public static int sumRandom() {
        do {
            sum += number.nextInt(31);
            if (number.nextInt(31) > maxValue) { //jeżeli wylosowana liczba jest większa, przypisze ją do maxValue
                maxValue = number.nextInt(31);
            }
            if (number.nextInt(31) < minValue) { //jeżeli wylosowana liczba jest mniejsza, przypisze ją do minValue
                minValue = number.nextInt(31);
            }
        } while (sum < 5000);
        return sum;
    }

    public static int maxValue() {
        return maxValue;
    }

    public static int minValue() {
        return minValue;
    }

    public static void main(String[] args) {
        System.out.println("Sum of random numbers: " + sumRandom());
        System.out.println("MIN Value: " + minValue());
        System.out.println("MAX Value: " +maxValue());

    }
}
