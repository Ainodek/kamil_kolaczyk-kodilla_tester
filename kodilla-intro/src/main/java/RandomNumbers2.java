import java.util.Random;

public class RandomNumbers2 {
    private  int random;
    private  int sum = 0;
    private int maxValue = Integer.MIN_VALUE;
    private int minValue = Integer.MAX_VALUE;
    static RandomNumbers2 value = new RandomNumbers2();
    public int sumRandom() {
        Random number = new Random();
        do {
            value.sum += number.nextInt(31);
            if (number.nextInt(31) > value.maxValue) { //jeżeli wylosowana liczba jest większa, przypisze ją do maxValue
                value.maxValue = number.nextInt(31);
            }
            if (number.nextInt(31) < value.minValue) { //jeżeli wylosowana liczba jest mniejsza, przypisze ją do minValue
                value.minValue = number.nextInt(31);
            }
        } while (value.sum < 5000);
        return value.sum;
    }

    public int maxValue() {
        return value.maxValue;
    }

    public int minValue() {
        return value.minValue;
    }

    public static void main(String[] args) {
        System.out.println("Sum of random numbers: " + value.sumRandom());
        System.out.println("MIN Value: " + value.minValue());
        System.out.println("MAX Value: " + value.maxValue());

    }
}
